package AutoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement serach = driver.findElement(By.name("q"));
		serach.sendKeys("seleni");
		
		Thread.sleep(3000);
		
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//li[@class='sbct213456']"));
		
		System.out.println(autosuggestion.size());
		
		for(WebElement b:autosuggestion) {
			System.out.println(b.getText());
		}
		
		driver.close();
	
	
	}

}
