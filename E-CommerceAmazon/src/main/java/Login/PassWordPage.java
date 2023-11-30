package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassWordPage {
	@FindBy(xpath = "//input[@id='ap_password']")private WebElement Pass;
	@FindBy(xpath = "//input[@id='signInSubmit']")private WebElement submit;
	
	public PassWordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
public void InputPass(String Password) {
	Pass.sendKeys(Password);
	
}
public void SubmitBtnClick() {
	submit.click();
	
}

}
