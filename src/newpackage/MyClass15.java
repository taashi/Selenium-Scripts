//filter functionality check - started

package newpackage;

import java.awt.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class MyClass15 {
	
	 public static void main(String[] args) {
			
			
		 FirefoxOptions options;
		WebDriver driver;
			
		 
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Taashi Priya\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			
			options = new FirefoxOptions();
			options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); 
	 
			driver = new FirefoxDriver(options);
			driver.get("http://localhost:8081/todo2/index.php");
		 
			assert(driver.getPageSource().contains("Welcome to Todo List"));
			
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			DateFormat df = new SimpleDateFormat("MMddyyyyHHmmss");
			Date today = Calendar.getInstance().getTime();        
			String username = "taashi";

			//driver.findElement(By.linkText("Submit Query")).click();
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys("hi");
			//driver.findElement(By.name("password2")).sendKeys("password");
			//driver.findElement(By.linkText("Submit Query")).click();
			
			driver.findElement(By.name("enter")).click();
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			assert(driver.getPageSource().contains("Todo List Dashboard"));
			assert(driver.getPageSource().contains(username));
			assert(driver.getPageSource().contains("Todo List"));
			WebElement x = driver.findElement(By.xpath("//body/table[1]/tbody[1]/tr[4]/td[1]"));
			
			String y = x.getText();
			int result = Integer.parseInt(y);
			
			 Select dropdown = new Select(driver.findElement(By.id("status_filter")));
             dropdown.selectByVisibleText("Started");
             driver.findElement(By.name("filter_button")).click(); 
				
//		    List<WebElement> count = driver.findElement(By.xpath(" /html[1]/body[1]/table[2]"));
			int rowCount=driver.findElements(By.xpath("/html/body/table[2]/tbody/tr")).size();
		    
			if (result == rowCount)
			{
				System.out.println("The filter functionality works correctly");
			}
			else
				System.out.println("The filter functionality does not work correctly");

	
			
			
			//driver.close();
	    }

}
