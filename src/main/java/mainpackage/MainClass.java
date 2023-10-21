package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class MainClass {
public WebDriver driver=null;

 @BeforeClass
	public void driveLunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
	/*	driver.get("https://www.mycontactform.com/samples.php/");
		driver.manage().window().maximize(); */
}
 @AfterClass
 public void drivClose() {
	 driver.close();
}
}
