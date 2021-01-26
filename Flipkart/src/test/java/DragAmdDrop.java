import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAmdDrop {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src=driver.findElement(By.id("box5"));
		WebElement target =driver.findElement(By.id("box101"));
		
		
		WebElement src1=driver.findElement(By.id("box7"));
		WebElement target1 =driver.findElement(By.id("box104"));
		Actions act=new Actions(driver);
		act.clickAndHold(src).moveToElement(target).release().build().perform();
		//act.clickAndHold(src1).moveToElement(target1).release().build().perform();
		act.dragAndDrop(src1, target1).build().perform();
		

	}

}
