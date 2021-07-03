package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class yourCartPage extends menuPage{
	
	@FindBy(css=".cart_button")
	List <WebElement> removeList;
	@FindBy(css="#checkout")
	WebElement checkoutBtn;
	@FindBy(css="#continue-shopping")
	WebElement returnShoppinngBtn;
	@FindBy(css=".inventory_item_name")
	List<WebElement> productslist;
	@FindBy(css=".inventory_item_name")
	WebElement product;
	
	public yourCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void removeFromCart(String name) {
		for (WebElement el : removeList) {
			if(el.getAttribute("name").contains(name)) {
				click(el);
				break;
			}
		}
	}
	public void checkout() {
		click(checkoutBtn);
	}
	public void returnShoppinng() {
		click(returnShoppinngBtn);
	}
	public void chooseProduct(String name) {
		for (WebElement el : productslist) {
			if(el.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}
		}
	}
	public String getname() {
		return getT(product);
	}
	
}
