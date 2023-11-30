package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserNamePage {
@FindBy(xpath = "//input[@id='ap_email']")private WebElement uname;
@FindBy(xpath = "//input[@id='continue']")private WebElement countinue;

public  UserNamePage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}
public  void InputUname(String username) {
	uname.sendKeys(username);
}
public void CountinueBtnClick() {
	countinue.click();
}
}
