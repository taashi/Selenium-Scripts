//Clicking on edit button and  editing task

package newpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Myclass9 {
	
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
			driver.findElement(By.xpath("//img[@src='edit.png']")).click();
	
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Alert alert = driver.switchTo().alert();
			alert.accept();
			if(driver.findElement(By.name("task_name")) != null)
			{
				System.out.println("case passed");
			}
			else
				System.out.println("case failed");
			
			
			//driver.close();
	    }

}
