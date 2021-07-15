package TestNG;

import java.io.IOException;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objectRepository.cartPage;
import objectRepository.homePage;
import objectRepository.loginPage;
import testBase.TestBase;

public class cartTestng extends TestBase {
	loginPage lp;
	homePage hp;
	cartPage cp;

	public cartTestng() throws IOException {
		super();
		
	}
	@BeforeClass()
	public void setUp() {
		TestBase.initialize();
	}
@Test(priority=1)
public void customer_is_already_on_cart_page() throws IOException, InterruptedException {
	hp=new homePage();
    hp.productSort();
//    Thread.sleep(1000);//hp=new homePage();
		hp.SortSelection();
		hp.addToCart();
	//	Thread.sleep(1000);
	hp.cartIconButton();
//	Thread.sleep(1000);
	//cp=new cartPage();
	//////	cp.addingCart();
	hp.cartIconButton();
	cp=new cartPage();
  cp.validateYourCartText();
}
@Test(priority=2)
	public void text_is_displayed_as_your_cart() throws IOException {
		cp.validateYourCartText();

	}
@Test(priority=3	)
public void customer_clicks_on_checkout() throws InterruptedException {
	Thread.sleep(3000);
   cp.checkOut();
}
@Test(priority=4)
public void customer_clicks_on_continue_shopping() throws InterruptedException, IOException {
	Thread.sleep(1000);
	cp.continueShopping();
	}
@Test(priority=5)
public void customer_clicks_on_remove() throws InterruptedException {
	Thread.sleep(1000);
    cp.remove();
}
@AfterMethod()
public void tearDown() {

driver.quit();
}
}
