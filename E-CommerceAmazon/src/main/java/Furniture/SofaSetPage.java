package Furniture;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SofaSetPage {
	WebDriver driver;
	@FindBy(xpath ="//span[text()='Sofa cum beds']")private WebElement Sofacumbeds;
	@FindBy(xpath = "(//span[@class='rush-component'])[1]") private WebElement ProducImage;
	
	public SofaSetPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
 public void SofacumbedClick()	{
	 Sofacumbeds.click(); 
 }
public void ProducImageClick() {
	ProducImage.click();
	
}
public void getWindowID() {
	Set<String> windowsIds = driver.getWindowHandles();
	ArrayList<String> arOfId=new ArrayList<String>(windowsIds);
	String childwidId = arOfId.get(1);
	
	driver.switchTo().window(childwidId);
}
	
}
