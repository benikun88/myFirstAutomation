package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class completePage extends menuPage{
	@FindBy(css=".complete-header")
	WebElement completeheader;
	@FindBy(css="#back-to-products")
	WebElement returnHomeBtn;
	
	public completePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void returnhome() {
		click(returnHomeBtn);
	}
	
	
	//validation
	public String getFinishMsg() {
		return getT(completeheader);
	}
	
}
