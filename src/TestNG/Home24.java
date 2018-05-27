package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Home24 {
	public WebDriver driver;

  @Test
  public void main() {
	// Find the element that's XPath attribute
	  driver.findElement(By.xpath("/html/body")).click();
      driver.findElement(By.xpath("//*[@id=\"checkout-registration-block-intro\"]/button")).click();
 
      driver.findElement(By.xpath("//*[@id=\"checkout-registration-block-full\"]/form[1]/div/div/div[2]/div")).click();
      
      
      // Enter First Name on the element found by above desc.
 
      driver.findElement(By.xpath("//*[@id=\"view2\"]/fieldset[1]/div[2]/div[3]/input")).sendKeys("testuser");
      
      // Enter Last Name on the element found by above desc.
      
      driver.findElement(By.xpath("//*[@id=\"view2\"]/fieldset[1]/div[3]/div[3]/input")).sendKeys("Manu");
      
      // Enter Last Name on the element found by above desc.
      
      driver.findElement(By.xpath("//*[@id=\"view2\"]/fieldset[1]/div[3]/div[3]/input")).sendKeys("Manu@test.com");
      
      // Enter Password on the element found by the above desc.
      
      driver.findElement(By.xpath("//*[@id=\"view2\"]/fieldset[2]/div[2]/div[3]/input")).sendKeys("Test@123");
      
      // Confirm Password on the element found by the above desc.
      
      driver.findElement(By.xpath("//*[@id=\"view2\"]/fieldset[2]/div[4]/div[3]/input")).sendKeys("Test@123");
      
      // Select Checkbox to accept terms and condition
      
      driver.findElement(By.xpath("//*[@id=\"view2\"]/fieldset[2]/div[5]/label")).click();
      
      // Select Newsletter checkbox
      driver.findElement(By.xpath("//*[@id=\"view2\"]/fieldset[2]/div[6]/div")).click();

      // Click on Continue button
      driver.findElement(By.xpath("//*[@id=\"view2\"]/fieldset[3]/div/button")).click();
      
      // Print a Log In message to the screen
      
      System.out.println(" SignUp Successfully, Task1 DONE :)");
  
  }
  @BeforeMethod
  
  public void beforeMethod()
  {
	  String exePath = "F:\\Java\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.home24.de/meinkundenkonto/kunde/login");
  }
  @AfterMethod
  
  public void afterMethod() 
  {
	  // Close the driver
 
      driver.quit();
      }
}
