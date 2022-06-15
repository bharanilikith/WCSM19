package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin");	
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
		

	}

}
