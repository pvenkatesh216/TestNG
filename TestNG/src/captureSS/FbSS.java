package captureSS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbSS {
  @Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
	  WebDriver d= new ChromeDriver();
	  d.get("http://www.facebook.com");
	  d.findElement(By.id("email")).sendKeys("venkyp216@gmail.com");
	  d.findElement(By.id("pass")).sendKeys("gopinath216");
	  d.findElement(By.xpath("//*[@id='u_0_2']")).click();
	  Thread.sleep(2000);
	  
	  TakesScreenshot ts=(TakesScreenshot)d;
	  File src= ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("./Screenshots/fb.png"));
	  
	  System.out.println("SS Taken");
	  System.out.println("Welcome");
	  System.out.println("Welcome new");
	  d.quit();
	    
  }
}
