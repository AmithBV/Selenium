import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "./res/chromedriver");
		WebDriver driver = new ChromeDriver();*/
		
		String Key= "webdriver.chrome.driver";
		String Value ="/home/tyss/Downloads/chromedriver";
		System.setProperty(Key, Value);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///home/tyss/Desktop/chk.html");
		List<WebElement> v = driver.findElements(By.xpath("(//input[@type='checkbox'])[(position()mod 2)=0]"));
	for(WebElement b:v){
		b.click();

	}
	}
}
