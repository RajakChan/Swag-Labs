package TestNG;

import java.io.IOException;
import java.util.Map;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.datatable.DataTable;
import objectRepository.homePage;
import objectRepository.loginPage;
import testBase.TestBase;

public class loginTestng extends TestBase{
loginPage lp;
WebDriver driver=null;
homePage hp;
	public loginTestng() throws IOException {
		super();
	}
	

	@BeforeClass()
	public void setUp() {
		TestBase.initialize();
	}



@Test(priority=3)
public void title_of_login_page_is_Sauce_demo() throws IOException{

	lp=new loginPage();
	String title=lp.validateLoginTitle();
Assert.assertEquals("Swag Labs", title);
}
@Test(priority=1)
public void customer_enters_username_and_password(DataTable dataTable) throws IOException {
for(Map<Object, Object> data : dataTable.asMaps(String.class, String.class)) {
		lp.credentials(pro.getProperty("username"),pro.getProperty("password"));
	}
	}
@Test(priority=2)
public void customer_clicks_on_login_button() throws IOException {
    // Write code here that turns the phrase above into concrete actions
	hp=new homePage();
   hp= lp.login();
}

@AfterMethod()
public void tearDown() {

driver.quit();
}

}
