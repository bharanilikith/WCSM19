package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement serachbox = driver.findElement(By.id("twotabsearchtextbox"));

Dimension s = serachbox.getSize();
int height = s.getHeight();
System.out.println(height +"height of the element is");

int width = s.getWidth();
System.out.println(width +"width of the element ");

driver.close();


	}

}
