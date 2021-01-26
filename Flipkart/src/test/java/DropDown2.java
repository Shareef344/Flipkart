import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		visibleTExtDate("//select[@id='day']", "15");
		visibleTExtMonth("//select[@id='month']", "Dec");
		
		
		}
		
		public static  void visibleTExtDate(String xpathValue, String Date) {
			WebElement day = driver.findElement(By.xpath(xpathValue));
			Select se = new Select(day);
			List<WebElement> AllDays = se.getOptions();
			
			for (int i = 0; i < AllDays.size(); i++) {
				String DayValue = AllDays.get(i).getText();
				System.out.println(DayValue);
				
				if (DayValue.equals(Date)) {
					AllDays.get(i).click();
					
				}	
			}		
		}
		public static  void visibleTExtMonth(String xpathValue, String MonthName) {
			WebElement Month = driver.findElement(By.xpath(xpathValue));
			Select se = new Select(Month);
			List<WebElement> AllMonths = se.getOptions();
			int TotalMonths = 	AllMonths.size();
			System.out.println(TotalMonths);
			for (int i = 0; i < TotalMonths; i++) {
				String Month1 = AllMonths.get(i).getText();
				System.out.println(Month1);
				if (Month1.equalsIgnoreCase(MonthName)) {
					AllMonths.get(i).click();
				}
				
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
//		
//		// List<WebElement size = driver.findElements(By.tagName("iframe");
//		//System.out.println(size);
//		
//	
////		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
////		driver.switchTo().window(tabs.get(0));
//	
//		
////		Set<String> windows =	driver.getWindowHandles();
////		System.out.println(windows.size());
////		Iterator<String> it = windows.iterator();
////		//String parent = it.next();
////		System.out.println("id of parent" + it.next());
////		//System.out.println("Parent window" + parent); 
////		//String child = it.next();
////		System.out.println("Child id =" +  it.next());
////		//System.out.println("Child" + child);
////		
////		//driver.switchTo().window(child);
////		System.out.println("123" + driver.getTitle());
//		
//	driver.switchTo().frame("meta_referrer");
//	driver.findElement(By.xpath("//input[@id='u_h_b']")).sendKeys("ssssss");
//		
		

	}


