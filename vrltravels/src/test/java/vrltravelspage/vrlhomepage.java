package vrltravelspage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vrlhomepage {
	WebDriver driver;
	By source=By.xpath("//input[@name='ONWARD_ORIGIN_CITY']");
	By destination =By.xpath("//input[@name='ONWARD_DESTINATION_CITY']");
	By journeydate=By.xpath("//input[@name='TRIPSTARTDATE']");
	By search=By.xpath("//input[@value='Search']");
	
	
	public vrlhomepage(WebDriver driver) {
		this.driver=driver;
	}
	public void journey() {
		driver.findElement(source).sendKeys("bangalore");
		driver.findElement(destination).sendKeys("indi");
		driver.findElement(journeydate).clear();
		driver.findElement(journeydate).sendKeys("09-12-2021");
		driver.findElement(search).click();
		
	}
	public void titileverification() {
		String exptitile="https://www.vrlbus.in/vrl2013/booking_home_page.aspx?q=LWYTJX";
		String actual=driver.getTitle();
		assertEquals(actual, exptitile);
	}
	public void totalLinks() {
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(WebElement link:alllinks) {
			System.out.println(link.getText()+"-"+link.getAttribute("href"));
		}
		
	}
}
