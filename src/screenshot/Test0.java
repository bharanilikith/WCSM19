package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Step:1 Typcasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//Step:2 Access the method and photo is stored in RAM
		File RAM = ts.getScreenshotAs(OutputType.FILE);
		
		//Step:3 specify the location
		File dest=new File("./photo/amazon.png");
		
	  //Step:4 copy paste from RAM to required location
		FileUtils.copyFile(RAM, dest);
		
		driver.close();


	}

}
