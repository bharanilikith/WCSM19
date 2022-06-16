package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("manager");
	driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();

	String acttitle = driver.getTitle();

	if(acttitle.equals("Instagram")) {
		System.out.println("Pass:home page is dispalyed");
	}
	else
	{
		System.out.println("Fail:homre page is not dispalyed");
	}
	System.out.println(driver.getCurrentUrl());


	}

}
