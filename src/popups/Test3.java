package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.amazon.com/");

String parent = driver.getWindowHandle();
System.out.println(parent);

Set<String> child = driver.getWindowHandles();
System.out.println(child);

driver.quit();









	}

}
