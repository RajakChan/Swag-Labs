package stepDefinition;
import java.io.IOException;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.homePage;
import objectRepository.loginPage;
import testBase.TestBase;


public class loginStepDefinition extends TestBase {
	public loginStepDefinition() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	loginPage lp ;//=new loginPage();
	homePage hp;

	@Given("customer is already on login  page")
	public void customer_is_already_on_login_page() {
	TestBase.initialize();
	
	}
	
	

	@When("title of login page is Sauce demo")
	public void title_of_login_page_is_Sauce_demo() throws IOException
	{
		lp=new loginPage();
		String title=lp.validateLoginTitle();
		org.testng.Assert.assertEquals("Swag Labs", title);
	}

	@Then("customer enters username and password")
	public void customer_enters_username_and_password(DataTable dataTable) throws IOException {
for(Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
		lp.credentials(pro.getProperty("username"),pro.getProperty("password"));
	}
	}
	
	
	


	@Then("customer clicks on login button")
	public void customer_clicks_on_login_button() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
       hp= lp.login();
}
	
	@Then("customer is on home page")
	public void customer_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
       //boolean productText=hp.validateYourProductText();
       //Assert.assertEquals("PRODUCTS", productText);
		driver.navigate().forward();
	}



}