package com.practice.TestNGExample;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTestOne {
   @Test
   public void TestMethod() {
	   System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\nreddyve\\Desktop\\Jenkins\\geckodriver.exe");
	   WebDriver driver = new FirefoxDriver();
	   driver.get("https://www.amazon.in/");
	   driver.findElement(By.xpath("//*[@id=\"nav-your-amazon\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("dvnreddy.v@gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	   driver.findElement(By.xpath(" //*[@id=\"ap_password\"]")).sendKeys("dvnreddy.v@gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]")).click();
	   
	   try {
		   String actualTitle = driver.getTitle();
		   String expectedTitle = "Amazon Sign In";
		   assertEquals(expectedTitle,actualTitle);
		   System.out.println("Executed and Pass");
		   driver.close();

		} catch (Exception e) {
			System.out.println("FAIL");
			driver.close();
		}
	   
	   
	 
	   
	   
   }
}
