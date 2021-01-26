import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//select[@name='continents']"));
		
		  Select se = new Select(ele);
		  
		  java.util.List<WebElement> lst = se.getOptions();
		 
		
		for(WebElement e: lst) {
		System.out.println(e.getText());
		if (lst.contains("Africa")) {
			driver.findElement(By.xpath("//*[text()='Africa']")).click();
		}
		}

	}

}
