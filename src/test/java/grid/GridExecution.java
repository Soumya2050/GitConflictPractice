package grid;

import org.testng.annotations.Test;

import generic.BaseClass;

public class GridExecution extends BaseClass{
	
	@Test
	public void pjTest() {
		driver.get("https://www.selenium.dev/");
	}
}
