
package stepDefinition;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.homePage;
import objectRepository.loginPage;
import testBase.TestBase;
import util.testUtil;

public class homeStepDefinition extends TestBase {
	loginPage lp;//=new loginPage();
	homePage hp;//=new homePage();
	testUtil ut;
	public homeStepDefinition() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Before()
	public void login() throws IOException {
		
		TestBase.initialize();
		lp=new loginPage();
		lp.credentials(pro.getProperty("username"),pro.getProperty("password"));
		lp.login();
	}
	
	@Given("customer is already on home page")
	public void customer_is_already_on_home_page() throws IOException {
		hp=new homePage();
		hp.validateYourProductText();
	   
	}

	@When("customer clicks on sort option")
	public void customer_clicks_on_sort_option() {
		hp.productSort();
	}

	@Then("customer selects options as required")
	public void customer_selects_options_as_required() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	//	ut=new testUtil();
	//driver.manage().timeouts().pageLoadTimeout(testUtil.Page_Load_Timeout, TimeUnit.SECONDS);
hp.SortSelection();
	}

	@Then("required products are sorted")
	public void required_products_are_sorted() {
	    System.out.println("Products are sorted ");
	}

	@Then("customer clicks on add to cart")
	public void customer_clicks_on_add_to_cart() {
	   hp.addToCart();
	}

	@Then("customer clicks on cart icon")
	public void customer_clicks_on_cart_icon() throws IOException {
	    hp.cartIconButton();
	}
	

}
