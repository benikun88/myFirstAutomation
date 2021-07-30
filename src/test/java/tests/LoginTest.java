package tests;

import java.security.PublicKey;
import java.security.interfaces.DSAPublicKey;

import javax.sound.sampled.TargetDataLine;
import javax.swing.text.PlainDocument;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LoginPage;
import pageobject.ProductsPage;
	
public class LoginTest extends BaseTest{
	
//	@Test(dataProvider = "getData")
//	public void tc_01_loginFailed1(String user,String password) {
//		LoginPage lP=new LoginPage(driver);
//		lP.login(user, password);
//		String actual=lP.getError();
//		String expected="Epic sadface: Username and password do not match any user in this service";
//		Assert.assertEquals(actual, expected);
//		}
//	@DataProvider
//	public Object[][] getData(){
//		Object[][] myData = {
//				{"beni", "secret_sauce"},
//				{"gal","123"},
//				{"yonit","1#444"},
//				{"gal","123456878"},
//		};
//		return myData;      
//		
//		
//	}
	
	@Test(priority =1)
	public void tc_01_loginFailed1() {
		LoginPage lP=new LoginPage(driver);
		lP.login("beni", "secret_sauce");
		String actual=lP.getError();
		String expected="Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actual, expected);
		}
	
	@Test(priority =2)
	public void tc_02_loginFailed1() {
		LoginPage lP=new LoginPage(driver);
		lP.login("standard_user", "");
		String actual=lP.getError();
		String expected="Epic sadface: Password is required";
		Assert.assertEquals(actual, expected);

	}
	
	@Test(priority =3)
	public void tc_03_loginFailed1() {
		LoginPage lP=new LoginPage(driver);
		lP.login("", "secret_sauce");
		String actual=lP.getError();
		String expected="Epic sadface: Username is required";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority =4)
	public void tc_04_loginFailed1() {
		LoginPage lP=new LoginPage(driver);
		lP.login("standard_user", "ecret_sauce");
		String actual=lP.getError();
		String expected="Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actual, expected);

	

		}
	@Test(priority = 5)
	public void tc_05_loginsucces1() {
		LoginPage lP=new LoginPage(driver);
		lP.login("standard_user", "secret_sauce");
		ProductsPage proPage=new ProductsPage(driver);
		Assert.assertTrue(proPage.isPtoductsPage());
		lP.sleep(2000);

	}
	
	
	
	
	
	
}
 