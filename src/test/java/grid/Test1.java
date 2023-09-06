package grid;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/nlogin/login");

		driver.findElement(By.id("usernameField")).sendKeys("soumyaranjanjena2023@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Soumya@2050");
		driver.findElement(By.xpath("//button[.='Login']")).click();

		driver.findElement(By.xpath("//div[@class='view-profile-wrapper']")).click();
//		driver.findElement(By.xpath("//a[.='Update']")).click();
		
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\srjen\\OneDrive\\Desktop\\GitBashPractice\\Soumyaranjan_Jena.pdf");
		
//		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon-img-wrapper']")).click();
//		
//		driver.findElement(By.xpath("//a[@title='Logout']")).click();
//		
//		StringSelection str = new StringSelection("C:\\Users\\srjen\\OneDrive\\Desktop\\GitBashPractice\\Soumyaranjan_Jena.pdf");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//
//		Robot r = new Robot();
//
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//
		Thread.sleep(5000);
		driver.quit();

	}

}
