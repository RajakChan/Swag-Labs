package TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objectRepository.homePage;
import objectRepository.loginPage;
import testBase.TestBase;
import util.testUtil;

public class homeTestng extends TestBase {
loginPage lp;
homePage hp;
	public homeTestng() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass()
	public void setUp() {
		TestBase.initialize();
	}
@Test(priority=1)
public void customer_is_already_on_home_page() throws IOException {
	hp=new homePage();
	hp.validateYourProductText();
   
}
@Test(priority=2)
public void customer_clicks_on_sort_option() {
	hp.productSort();
}
@Test(priority=3)
public void customer_selects_options_as_required() throws InterruptedException {
driver.manage().timeouts().pageLoadTimeout(testUtil.Page_Load_Timeout, TimeUnit.SECONDS);
hp.SortSelection();
}
@Test(priority=4)
public void required_products_are_sorted() {
    System.out.println("Products are sorted ");
}
@Test(priority=5)
public void customer_clicks_on_add_to_cart() {
	   hp.addToCart();
	}
@Test(priority=6)
public void customer_clicks_on_cart_icon() throws IOException {
    hp.cartIconButton();
}
@AfterMethod()
public void tearDown() {

driver.quit();
}
}
