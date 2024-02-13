package com.selenium.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello facebook!" );
        //driver installed location
       // System.setProperty("webdriver.chrome.driver" , "/Users/lokeshwarimohan/documents/softwares/chromedriver/chromedriver");
       WebDriverManager.chromedriver().setup();
       
       
       ChromeOptions chromeOptions = new ChromeOptions();
    
    
    WebDriver  driver = new ChromeDriver(chromeOptions);
    
    //get the url of the jenkins project
    driver.get("https://www.facebook.com/");
    
    
    
    
    
    //enable 3 minute wait time
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    
    
    
    //Locate user name and enter details
    driver.findElement(By.id("email")).sendKeys("email@gmail.com");
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    //Locate lasr name and enter details
    driver.findElement(By.id("pass")).sendKeys("emailnew$");
    
    
    
    try 
    {
		Thread.sleep(1000);
	} 
    catch (InterruptedException e) 
    
    {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
    //Locate login button for facebook and enter details
    driver.findElement(By.name("login")).click();
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    driver.quit();
    System.out.println("Script run successfully and login to facebook");
    }

}
