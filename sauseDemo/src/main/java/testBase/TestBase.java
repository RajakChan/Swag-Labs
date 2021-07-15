package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.testUtil;

public class TestBase {
	public static WebDriver driver=null;;
public 	static Properties pro;


public TestBase() throws IOException {
	try {
		pro=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\CHASHAIK\\eclipse-workspace\\sauseDemo\\src\\main\\java\\config.properties");
		pro.load(fin);
	}
	catch(IOException e)
	{
		e.getMessage();
	}
	
}

public  static void  initialize() {
  String browserName = pro.getProperty("browser");
  System.out.println(browserName);
  if(browserName.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver_win32\\chromedriver.exe");
  driver=new ChromeDriver();
  }
  else {
		System.out.println("Please pass the right browser: " + browserName);
	}
  //else if(browserName.equals("firefox"))
////  {
	//.setProperty("webdriver.gecko.driver","C:\\Softwares\\Geckodriver_win32\\geckodriver.exe");
	//    driver=new FirefoxDriver();
//  }
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
 driver.manage().timeouts().pageLoadTimeout(testUtil.Page_Load_Timeout, TimeUnit.SECONDS);
 driver.manage().timeouts().implicitlyWait(testUtil.Implicitly_Wait, TimeUnit.SECONDS);
 //driver.get(pro.getProperty("url"));
driver.get(pro.getProperty("url"));  


			
}
//browserName.equals("chrome")

}
