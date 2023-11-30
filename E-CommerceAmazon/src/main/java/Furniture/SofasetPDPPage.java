package Furniture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SofasetPDPPage {
	@FindBy(xpath = "(//span[@class='a-price-whole'])[1]") private WebElement ProductPrize;
	@FindBy(xpath = "//select[@id='quantity']") private WebElement ProductQuentity;
	@FindBy(xpath = "//input[@id='add-to-cart-button']")private WebElement AddToCartBTn;
	@FindBy(xpath = "//span[@id='attachSiNoCoverage']") private WebElement skipBtn;
	
	public SofasetPDPPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void getProductPrize() {
		
		String Pprize = ProductPrize.getText();	
		System.out.println(Pprize);
		
	}
	public void AddProductQuentity() throws InterruptedException {
		Select select = new Select(ProductQuentity);
		select.selectByIndex(1);
		Thread.sleep(2000);
		
	}
	public void AddToCartBTn() throws InterruptedException {
		AddToCartBTn.click();
		Thread.sleep(2000);
   	skipBtn.click();
	Thread.sleep(8000);
		
	}

}
