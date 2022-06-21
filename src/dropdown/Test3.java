package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.netty.util.internal.SystemPropertyUtil;

public class Test3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("MTR"));
		Select s=new Select(dd);
		s.selectByIndex(2);
		s.selectByValue("c");
		s.selectByVisibleText("Coffee");
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()) {
			s.deselectAll();
		}
		else
		{
			System.out.println("it is not multiple select dropdown");
		}
		
		driver.close();
		
	}

}
