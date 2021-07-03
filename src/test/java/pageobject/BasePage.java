package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
		WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	public void fillText(WebElement el,String text) {
		highlightElement(el, "yellow");
		el.clear();
		el.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		el.sendKeys(text);
	}
	public void click(WebElement el) {
		highlightElement(el, "yellow");
		el.click();
	}
	public String getT(WebElement el) {
		return el.getText();
	}
	public void sleep(long milis) {
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) { 
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void fillAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}
	public void quit() {
		driver.quit();
	}
	
	private void highlightElement(WebElement element, String color) {
		//keep the old style to change it back
		String originalStyle = element.getAttribute("style");
		String newStyle = "background-color:red;border: 1px solid " + color + ";" + originalStyle;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Change the style 
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + newStyle + "');},0);",
				element);

		// Change the style back after few miliseconds
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ originalStyle + "');},400);", element);

	}
	
}
