package GIT_Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	Properties refobj ;
	WebDriver driver ;
	/*
	@Test
	public void Login_details() throws Throwable{
		refobj = new Properties();
		driver= new ChromeDriver();
		
		refobj.load(new FileInputStream("Register.properties"));
		driver.manage().window().maximize();
		driver.get(refobj.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath(refobj.getProperty("emailobj"))).sendKeys("gin66655@gamil.com");;
		driver.findElement(By.xpath(refobj.getProperty("pwdobj"))).sendKeys("Jin@6665");;
		driver.findElement(By.xpath(refobj.getProperty("signobj"))).click();
		Thread.sleep(3000);
		driver.quit();
	}*/
	
	
	@Test
	public void Register() throws Throwable{
		refobj = new Properties();
		driver= new ChromeDriver();
		refobj.load(new FileInputStream("Register.properties"));
		driver.manage().window().maximize();
		driver.get(refobj.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath(refobj.getProperty("regobj"))).click();
		driver.findElement(By.xpath(refobj.getProperty("nameobj"))).sendKeys("mayaas");
		driver.findElement(By.xpath(refobj.getProperty("contobj"))).sendKeys("8523697412");
		driver.findElement(By.xpath(refobj.getProperty("emailobj"))).sendKeys("mayaas@gmail.com");
		driver.findElement(By.xpath(refobj.getProperty("pswdobj"))).sendKeys("maya@6666");
		driver.findElement(By.xpath(refobj.getProperty("genderobj"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(refobj.getProperty("genderobj"))).sendKeys("Female");
		Thread.sleep(3000);
		driver.findElement(By.xpath(refobj.getProperty("dobobj"))).sendKeys("10-5-1998");
		driver.findElement(By.xpath(refobj.getProperty("checkboxodj"))).click();
		driver.findElement(By.xpath(refobj.getProperty("clickregobj"))).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	

}
