package grid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoneyControl {
	
	@Test
	public void moneyControl() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/");
		driver.findElement(By.id("wzrk-cancel")).click();
		WebElement fm = driver.findElement(By.xpath("//iframe[@title='Indices Chart']"));
		driver.switchTo().frame(fm);
		Actions a = new Actions(driver);
//		WebElement scrl = driver.findElement(By.id("advance_decw"));
//		a.scrollToElement(scrl).p;
		 WebElement str = driver.findElement(By.xpath("//*[name()='svg' and @version='1.1' and @xmlns='http://www.w3.org/2000/svg']//*[name()='g'and @class='highcharts-tooltip']//*[name()='text']/*[@style='font-weight:bold']"));
		a.scrollToElement(str).click().perform();
		System.out.println(str.getText());
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
