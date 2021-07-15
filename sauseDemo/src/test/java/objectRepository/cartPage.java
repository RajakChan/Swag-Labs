package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;



public class cartPage extends TestBase {

@FindBy(className="title")
WebElement yourCartText;

@FindBy(id="checkout")
WebElement checkOutBtn;

@FindBy(id="add-to-cart-sauce-labs-backpack")
WebElement addtoCart;


@FindBy(xpath="//button[@data-test='continue-shopping']")
WebElement continueShopping;

//@FindBy(id="add-to-cart-sauce-labs-onesie")
//WebElement addToCart;
//@FindBy(xpath="//div[@class='inventory_item_name']")
//WebElement selectedProduct;
@FindBy(className="inventory_item_name")
WebElement selectedProduct;

@FindBy(id="remove-sauce-labs-onesie")
WebElement remove;

//intialize page objects
public cartPage() throws IOException
{
	PageFactory.initElements(driver, this);  
}

public void verifyYourItem() throws IOException
{
	
}

public void validateYourCartText()
{
	if(driver.getPageSource().contains("YOUR CART")) {
		System.out.println("Product text is present");
	}
	else
	{
		System.out.println("Product text is absent");
	}
}

public void tearDown() {
	driver.quit();
}


	public void checkOut()
	{
		checkOutBtn.click();
}
	public void continueShopping() {
		continueShopping.click();
	}
	public void remove()
	{
		remove.click();
	}
public void selectingParticularProduct(){
	selectedProduct.click();
}
	
}
