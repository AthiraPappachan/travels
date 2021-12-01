package vrltravelstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import vrltravelspage.vrlhomepage;





public class vrlhometest {

	WebDriver driver;
	String baseurl="https://www.vrlbus.in/vrl2013/booking_home_page.aspx";
	
	@BeforeTest
	public void setup() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Nidhin\\\\Downloads\\\\Software Testing\\\\selenium\\\\chrome driver 94\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void start() {
		driver.get(baseurl);
	}
	@Test
	public void searchh() {
		
		vrlhomepage vh=new vrlhomepage(driver);
		vh.sourcedata("bengaluru");
		vh.destinationdata("ahamedabad");
		vh.currentdate();
		vh.check();
	}
	
}

