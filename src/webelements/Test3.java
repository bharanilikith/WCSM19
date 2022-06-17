package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement serachbox = driver.findElement(By.id("twotabsearchtextbox"));
	Point loc = serachbox.getLocation();
	int x = loc.getX();
	System.out.println(x+ "x coordinates");
	
	int y = loc.getY();
	System.out.println(y+"y coordinates");
	
	driver.close();
	}

}
