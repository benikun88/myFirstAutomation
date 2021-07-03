package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends menuPage{

	@FindBy(css=".btn_inventory")
	WebElement addToCartBtn; 
	@FindBy(css="#back-to-products")
	WebElement backBtn; 
	@FindBy(css=".back-image")
	WebElement titleLabel; 
	
	
	
	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void addToCart() {
		click(addToCartBtn);
	}
	public void back() {
		click(backBtn);
		
	}
	//validation
		public boolean isPtoductsPage() {
			if(getT(titleLabel).equalsIgnoreCase("Back to products")) {
				return true;
			}
			else {
				return false;
			}
				
		}
}
