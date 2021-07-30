package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
		@FindBy(id="user-name")
		WebElement userElement;
		@FindBy(css="#password")
		WebElement passElement;
		@FindBy(css="#login-button")
		WebElement loginBtnElement;
		@FindBy(css="[data-test=\"error\"]")
		WebElement errorMsg;
		@FindBy(css=".error-button")
		WebElement errorBtn;
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		//sleep(2000);
		// TODO Auto-generated constructor stub
	}
	public void login(String username,String password) {
		setUser(username);
		setPass(password);
		click(loginBtnElement);
	}
	public void setUser(String username) {
		fillText(userElement,username);
		}
	public void setPass(String password) {
		fillText(passElement, password);
		}
	
	//validate
	public String getError() {
		return getT(errorMsg);
	}
	
	public void closeErr() {
		click(errorBtn);
	}

}
