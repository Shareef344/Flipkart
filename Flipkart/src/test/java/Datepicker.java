import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepicker {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		
		String  dateMonth = "March, 2021";
		while(true) {
		String Date = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]")).getText();
		System.out.println(Date);
		if (Date.contains("March 2021"))
		{
		System.out.println("done");	
		}
		else {
		//	System.out.println("no");
			driver.findElement(By.xpath("//div[@id='datepickers-container']/div[1]/nav[1]/div[3]")).click();			
		}	
		
	}
		
		
		
		
		
		

	}

}
