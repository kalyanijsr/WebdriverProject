package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFFBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

     System.setProperty("webdriver.gecko.driver","geckodriver.exe");

     WebDriver driver = new FirefoxDriver();

     driver.get("http://www.simplilearn.com/");

     driver.manage().window().maximize();

     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
     
     WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	
 }
 }