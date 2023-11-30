package LoginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Furniture.FurniturePage;
import Furniture.SofaSetPage;
import Furniture.SofasetPDPPage;
import Home.HomePage;
import Home.ProfilePage;
import LibraryFiles.BaseClase;
import LibraryFiles.UtilityClass;
import Login.LoginPage;
import Login.PassWordPage;
import Login.UserNamePage;

public class LoginTest extends BaseClase {
	LoginPage login;
	UserNamePage user;
	PassWordPage pass;
	HomePage home;
	ProfilePage profil;
	FurniturePage furniture;
	SofaSetPage sofasetbed;
	SofasetPDPPage sofapdp;

	@BeforeClass
	public void openbrowser() throws IOException {
		Openbrowser();
		login = new LoginPage(driver);
		user = new UserNamePage(driver);
		pass = new PassWordPage(driver);
		home=new HomePage(driver);
		profil=new ProfilePage(driver);
		furniture=new FurniturePage(driver);
		sofasetbed = new SofaSetPage(driver);	
		sofapdp =new SofasetPDPPage(driver);
	}
@Test
	public void loginToApp() throws IOException, InterruptedException {
	Thread.sleep(4000);
		login.signIcon();
		Thread.sleep(2000);
		user.InputUname(UtilityClass.getDataFromPF("UN"));
		user.CountinueBtnClick();
		Thread.sleep(1000);
		pass.InputPass(UtilityClass.getDataFromPF("PWD"));
		pass.SubmitBtnClick();
		
		Thread.sleep(2000);
	}
@Test(priority = 1)
public void VerifyTitle() throws EncryptedDocumentException, IOException {
	String actTitle = driver.getTitle();
	Reporter.log(actTitle,true);
	String expTitle = UtilityClass.getExcelData(0, 2);
	Assert.assertEquals(actTitle, expTitle, "Pass: Both value are same");
	}

@Test(priority = 2 ,enabled = false)
public void VerifyUserAndProfileName() throws InterruptedException {
	String uname ="";
	String result = home.profileBtnClick(uname);
	Reporter.log(result,true);
	
	profil.LoginSecurityBtnClick();
	Thread.sleep(8000);
	String pname="";
	String Profilename = profil.getUserName(pname);
	Reporter.log(Profilename,true);
	Thread.sleep(2000);	
Assert.assertEquals(Profilename, result,"Pass:Both value are same");

}
@Test(priority = 3)
public void VerifyPDP() throws InterruptedException {
	
	home.SelectListbox();
	furniture.SofaLinkClick();
	Thread.sleep(2000);	
	sofasetbed.SofacumbedClick();
	Thread.sleep(2000);	
	sofasetbed.ProducImageClick();
	Thread.sleep(2000);
	sofasetbed.getWindowID();
}
@Test(priority = 4)
public void AddToCart() throws InterruptedException {
	sofapdp.getProductPrize();
	sofapdp.AddProductQuentity();
	sofapdp.AddToCartBTn();
	Reporter.log("Item Add Sucessfuly" ,true);
	home.NavCartLinkClick();
	Thread.sleep(2000);
	}

@AfterClass
public void CloseBrowser() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();	
}

}

