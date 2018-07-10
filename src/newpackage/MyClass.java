//registering a new user and checking if the user has been registered

package newpackage;
import java.awt.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyClass {

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
			String username = "tttppkk123";

			driver.findElement(By.linkText("Register new account")).click();
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys("password");
			driver.findElement(By.name("password2")).sendKeys("password");
			
			driver.findElement(By.name("register")).click();
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys("password");
			driver.findElement(By.name("enter")).click();
			if(driver.getPageSource().contains(username))
			{
				System.out.println("The new user has been registered");
			}
			else
			{
				System.out.println("The new user has not been registered");
			}
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//driver.close();
	    }
	
	
	
}


