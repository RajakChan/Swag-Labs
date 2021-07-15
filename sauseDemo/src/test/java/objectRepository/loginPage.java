package objectRepository;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class loginPage extends TestBase{
	
	

	@FindBy(xpath="//div[@class=['bot_column']")
	WebElement  swagLabs_Image;
	
	@FindBy(xpath="//div[@class=['login_logo']")
	WebElement  swagLabs_Logo;
	
	
	@FindBy(name="user-name")
	WebElement username;
		
	@FindBy(id="password")
	WebElement password;

	@FindBy(xpath="//input[@data-test='login-button']")
	WebElement login;


public loginPage() throws IOException
{
	
	PageFactory.initElements(driver, this);  
}

public String  validateLoginTitle()
{
	return driver.getTitle();
}

public  void credentials(String usern,String pwd) throws IOException {
	username.sendKeys(usern);
	password.sendKeys(pwd);
	//login.click();
	//return new homePage();
}

	
	public homePage login() throws IOException
	{
		login.click();
	   return new homePage();
		
	}

public boolean validateLoginLogo() {
	return swagLabs_Logo.isDisplayed();
}
public void validateImage()
{
	swagLabs_Image.isDisplayed();
}
}


