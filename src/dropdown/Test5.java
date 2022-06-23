package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
WebElement month = driver.findElement(By.id("month"));

Select s=new Select(month);
s.selectByIndex(0);
s.selectByVisibleText("May");
s.selectByValue("3");

List<WebElement> alloptions = s.getOptions();
System.out.println(alloptions.size());

ArrayList a=new ArrayList<>();

for(WebElement opt:alloptions) {
	String text = opt.getText();
	a.add(text);
	System.out.println(text);
}


System.out.println("**********after sorting***********");
Collections.sort(a);

for(Object options:a) {
	System.out.println(options);
}

driver.close();



	}

}
