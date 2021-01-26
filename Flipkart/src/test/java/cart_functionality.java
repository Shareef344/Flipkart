

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.annotations.Test;

public class cart_functionality {
	Logger log = Logger.getLogger(cart_functionality.class);
	WebDriver driver;
	
@Test
public void Login() {
	 	PropertyConfigurator.configure("D:\\hybridFrameEclipse\\Flipkart\\og4j.properties");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.get("https://www.flipkart.com/");
	//	log.info("application opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String Login = driver.findElement(By.xpath("//span[contains(.,'Login')]")).getText();
//		log.info("000000");
		
		if (Login.equalsIgnoreCase("Login")) {
			driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();
		log.info("closed login tab");
		}else {
		log.info("No login tab found");
		}
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmi Mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	log.info("clicked on Search buttton");
		
	List<WebElement>	AllMobiles = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	int total = AllMobiles.size();
	System.out.println(driver.getTitle());

	for (WebElement all : AllMobiles) {
	System.out.println(all.getText());
		
		if  (all.getText().equalsIgnoreCase("Redmi 9 Prime (MintGreen, 128 GB)")) {
			all.click();
			log.info("clicked on redmio mobile");	
			break;
		
		} else {
		System.out.println("redmi 8 mobile not clicked syso");
		log.info("redmi 8 mobile not clicked log");	
		break;
			}
		
		}

/*	Set<String> handle= driver.getWindowHandles();
	Iterator<String> it = handle.iterator();
	String ParentWindow = it.next();
	String ChildWindow =  it.next();
	driver.switchTo().window(ChildWindow);
	
	System.out.println("Title is------" + driver.getTitle());
	
	driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("501505");
	driver.findElement(By.xpath("//span[contains(text(),'Check')]")).click();
	
	driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/144/144/ke1pnrk0/mobile/h/f/2/mi-redmi-9-prime-m2004j191-original-imafutb5637bes8y.jpeg?q=50']")).click();
	
	
	
	
	
	
	*/
	
	
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).build().perform();
	act.moveToElement(driver.findElement(By.xpath("//a[@title='Samsung']"))).click().build().perform();	
//	driver.findElement(By.xpath("//a[@title='Samsung']")).click();
	
	
	}
}

