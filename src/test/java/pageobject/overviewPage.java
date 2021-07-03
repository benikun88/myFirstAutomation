package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class overviewPage extends menuPage{

	@FindBy(css="#cancel")
	WebElement cancelBtn;
	@FindBy(css="#finish")
	WebElement finishBtn;
	@FindBy(css=".header_secondary_container")
	WebElement titleLabel;
	
	
	public overviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void cancel() {
		click(cancelBtn);
	}
	public void finish() {
		click(finishBtn);
	}
	public boolean isPtoductsPage() {
		if(getT(titleLabel).equalsIgnoreCase("Checkout: Overview")) {
			return true;
		}
		else {
			return false;
		}
	}
}
