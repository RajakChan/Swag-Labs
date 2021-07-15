package stepDefinition;

import java.io.IOException;

import org.bouncycastle.dvcs.CPDRequestBuilder;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.cartPage;
import objectRepository.homePage;
import objectRepository.loginPage;
import testBase.TestBase;


public class cartStepDefinition extends TestBase{
	public cartStepDefinition() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//public cartStepDefinition() throws IOException {
	///	super();
		
//	}

	loginPage lp;
	homePage hp;
cartPage cp;

	//@Before()
//	public void login() throws IOException {
		//lp=new loginPage();
	//	TestBase.initialize();
	//lp=new loginPage();
	//	lp.credentials(pro.getProperty("username"),pro.getProperty("password"));
//	lp.login();
	//	hp=new homePage();
    //hp.productSort();
	//	hp=new homePage();
//	 hp.SortSelection();
	//hp.cartIconButton();
	//cp=new cartPage();
		//cp.addingCart();
	//hp.cartIconButton();
	//}
	@Given("customer is already on cart page")
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
	
	@When("text is displayed as your cart")
	public void text_is_displayed_as_your_cart() throws IOException {
		cp.validateYourCartText();

	}

	@Then("customer clicks on checkout")
	public void customer_clicks_on_checkout() throws InterruptedException {
		Thread.sleep(3000);
	   cp.checkOut();
	}
	@Then("customer clicks on continue shopping")
public void customer_clicks_on_continue_shopping() throws InterruptedException, IOException {
	Thread.sleep(1000);
	cp.continueShopping();
	}
	@Then("customer clicks on remove")
	public void customer_clicks_on_remove() throws InterruptedException {
		Thread.sleep(1000);
	    cp.remove();
	}
	@AfterMethod()
	public void tearDown() {
	
	driver.quit();
	}
	//@Then("customer clicks on particular selected product")
//	public void customer_clicks_on_particular_selected_product() {
	//    cp.selectingParticularProduct();
	//}

	//@Then("customer clicks on back to products")
	//public void customer_clicks_on_back_to_products() {
	    
	//}
}
