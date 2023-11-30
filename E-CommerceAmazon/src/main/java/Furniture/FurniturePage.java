package Furniture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FurniturePage {
@FindBy(xpath = "//span[text()='Sofas and sofa sets']")private WebElement sofaLink;
public FurniturePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void SofaLinkClick() {
	sofaLink.click();
	
}

}
