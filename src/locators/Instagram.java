package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(3000);
driver.findElement(By.name("username")).sendKeys("admin");

Thread.sleep(3000);
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
