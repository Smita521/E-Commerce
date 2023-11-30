package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']") private WebElement profileBtn;
	@FindBy(xpath = "//select[@id='searchDropdownBox']") private WebElement selectbox;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']") private WebElement serchbtn;
	@FindBy(xpath = "//a[@id='nav-logo-sprites']") private WebElement amazonlogo;
	@FindBy(xpath = "//a[@id='nav-cart']")private WebElement NavCart;
	
	
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public String profileBtnClick(String uname) {
	profileBtn.click();
	String ProfileName = profileBtn.getText();
	//System.out.println(ProfileName);
	return ProfileName;	
}
public void SelectListbox() {
	amazonlogo.click();
	
	Select sel = new Select(selectbox);
	
	sel.selectByVisibleText("Furniture");
	serchbtn.click();
}
public void NavCartLinkClick() {
	NavCart.click();
	
}
}
