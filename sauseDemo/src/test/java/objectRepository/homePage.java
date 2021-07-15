package objectRepository;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.TestBase;
import util.testUtil;

public class homePage extends TestBase  {

	@FindBy(xpath="//span[@class='title']")
	WebElement productPageText;
	
	@FindBy(xpath="//select[@data-test='product_sort_container']")
	WebElement nameSort;
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	WebElement addToCart;
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartIcon;
	
	public homePage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public void validateYourProductText()
	{
		//return productPageText.isDisplayed();
		if(driver.getPageSource().contains("PRODUCTS")) {
			System.out.println("Product text is present");
		}
		else
		{
			System.out.println("Product text is absent");
		}
	}
public void productSort()
{
nameSort.click();
//Select s=new Select(nameSort);
//s.selectByIndex(1);
//System.out.println(s.getFirstSelectedOption().getText());

}
public void SortSelection() {
	//driver.manage().timeouts().pageLoadTimeout(testUtil.Page_Load_Timeout, TimeUnit.SECONDS);
	Select s=new Select(nameSort);
	s.selectByIndex(1);
	System.out.println(s.getFirstSelectedOption().getText());
}

public void addToCart() {
	addToCart.click();
}

public cartPage cartIconButton() throws IOException {
	cartIcon.click();
	return new cartPage();
}
	
}