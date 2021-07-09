package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.LoginPage;
import pageobject.ProductsPage;
import pageobject.yourCartPage;

public class CartTest extends BaseTest2{
	@Test(priority =1)
	public void tc_01_addToCart() {
		ProductsPage pP=new ProductsPage(driver);
		pP.addRmToCart("backpack");
		pP.sleep(2000);
		pP.openCart();
		yourCartPage yC=new yourCartPage(driver);
		String actual=yC.getname();
		String expected="Sauce Labs Backpack";
		Assert.assertEquals(actual, expected);
		yC.returnShoppinng();
		pP.addRmToCart("backpack");
		}
	@Test(priority =2)	
	public void tc_02_addToCart() {
		ProductsPage pP=new ProductsPage(driver);
		pP.addRmToCart("backpack");
		pP.addRmToCart("bike");
		pP.sleep(4000);
		String actual=pP.getCartAmount();
		String expected="2";
		Assert.assertEquals(actual, expected);
		}
	
	
	
	
	
	
}

