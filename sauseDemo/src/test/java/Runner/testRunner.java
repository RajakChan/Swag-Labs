package Runner;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
  @CucumberOptions(
		features="C:\\Users\\CHASHAIK\\eclipse-workspace\\sauseDemo\\src\\test\\resources\\Features\\cart.feature",
		glue= {"stepDefinition"},
		dryRun=false)
	//	monochrome=true,strict=true)
		
public class testRunner{
	
	

}