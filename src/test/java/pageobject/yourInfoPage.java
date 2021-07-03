package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class yourInfoPage extends menuPage{
	@FindBy(css="#first-name")
	WebElement firstNameField;
	@FindBy(css="#last-name")
	WebElement lastNameField;
	@FindBy(css="#postal-code")
	WebElement zipcodeField;
	@FindBy(css="#continue")
	WebElement continueBtn;
	@FindBy(css="#cancel")
	WebElement cancelBtn;
	@FindBy(css=".error-message-container.error")
	WebElement errorMsg;
	
	
	public yourInfoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void fillcheckoutinfo(String name,String lastname,String postcode) {
		fillText(firstNameField, name);
		fillText(lastNameField, lastname);
		fillText(zipcodeField, postcode);
	}
	
	public void continueToPay() {
		click(continueBtn);
	}
	public void cancel() {
		click(cancelBtn);
	}
	//validation 
	public String getFinishMsg() {
		return getT(errorMsg);
	}
	
	
}
