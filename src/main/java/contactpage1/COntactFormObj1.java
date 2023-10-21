package contactpage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class COntactFormObj1 {
	
public WebDriver driver;
	public COntactFormObj1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "subject") WebElement inp_sub;
	@FindBy(xpath = "//input[@name='email']") WebElement inp_mail;
	@FindBy(xpath = "//input[contains(@id,'q1') and contains(@style,'font')]") WebElement inp_q1;

	public void search() {
		inp_sub.sendKeys("Selenium Assignment");
		inp_mail.sendKeys("anushiyashanmugam");
		inp_q1.sendKeys("anu");
	}

}