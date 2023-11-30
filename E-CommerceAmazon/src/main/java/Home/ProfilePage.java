package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	@FindBy(xpath = "//h2[normalize-space()='Login & security']") private WebElement LoginSecurityBtn;
	@FindBy(xpath = "//span[text()='Vikrant ']") private WebElement uName;
public ProfilePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
	public void LoginSecurityBtnClick() {
		LoginSecurityBtn.click();
		
	}
	public String getUserName(String Profilename) {
		String resultuname = uName.getText();
		//System.out.println(resultuname);
		return resultuname;
		
	}
}
