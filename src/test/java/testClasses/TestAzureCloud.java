package testClasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAzureCloud {
	
	WebDriver dr;
	
	@Test
	public void testAzureCloud() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		
		dr.get("https://dev.azure.com/itszakariabd");
		
		Thread.sleep(2000L);
		
		System.out.println(dr.getTitle());
		
		WebElement el = dr.findElement(By.xpath("//*[text()='Sign in']"));
		
		if(el.isDisplayed())
			Assert.assertTrue("test is passsed", el.isDisplayed());
		
	}

}
