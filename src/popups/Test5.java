package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test5 {

	public static void main(String[] args) {
//chrome
ChromeOptions option=new ChromeOptions();
option.addArguments("--disabale notification");
WebDriver driver=new ChromeDriver(option);

//firefox
FirefoxOptions options=new FirefoxOptions();
options.addArguments("--disabale notification");
WebDriver driver1=new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
