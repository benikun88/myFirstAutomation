package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends menuPage{	
	@FindBy(css=".inventory_item_name")
	List<WebElement> productslist;
	@FindBy(css=".btn_inventory")
	List<WebElement> addtocartlist;
	@FindBy(css=".shopping_cart_link")
	WebElement cartBtn;
//	@FindBy(css="shopping_cart_badge")
//	WebElement cartBadge;
	@FindBy(css=".header_secondary_container>.title")
	WebElement titleLabel;
	@FindBy(css=".product_sort_container")
	WebElement orderBtn;
	
	public ProductsPage(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
	}
	public void chooseProduct(String name) {
		for (WebElement el : productslist) {
			if(el.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}
		}
	}
	
	public void addRmToCart(String name) {
		for (WebElement el : addtocartlist) {
			System.out.println(el.getAttribute("name"));
			if(el.getAttribute("name").contains(name)) {
				click(el);
				break;
			}
		}
	}
	public void openCart() {
		click(cartBtn);
	}
	
	//validation
	public boolean isPtoductsPage() {
		if(getT(titleLabel).equalsIgnoreCase("Products")) {
			return true;
		}
		else {
			return false;
		}
			
	}
	public void order(String value) {
		Select s=new Select(orderBtn);
		s.selectByValue(value);
	}
	public String getCartAmount() {
		return getT(driver.findElement(By.cssSelector(".shopping_cart_badge")));
	}
		
}
