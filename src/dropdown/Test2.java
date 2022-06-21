package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("MTR"));
		Select s=new Select(dd);
		s.selectByIndex(2);
		s.selectByValue("c");
		s.selectByVisibleText("Coffee");
		

		s.deselectByIndex(2);
		s.deselectByValue("c");
		s.deselectByVisibleText("Coffee");
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
