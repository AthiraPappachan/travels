package vrltravelspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class vrlhomepage {
	WebDriver driver;
	By source=By.xpath("//input[@name='ONWARD_ORIGIN_CITY']");
	By destination =By.xpath("//input[@name='ONWARD_DESTINATION_CITY']");
	By journeydate=By.xpath("//input[@name='TRIPSTARTDATE']");
	By search=By.xpath("//input[@value='Search']");
	By daytotavel=By.xpath("//tbody/tr[1]/td[3]/a[1]");
	
	public vrlhomepage(WebDriver driver) {
		this.driver=driver;
	}
	public void sourcedata(String departureplace) {
		driver.findElement(source).sendKeys(departureplace);
	}
	public void destinationdata(String arrivalplace) {
		driver.findElement(destination).sendKeys(arrivalplace);
	}
	public void currentdate() {
		driver.findElement(journeydate).click();
		driver.findElement(daytotavel).click();
		
	}
	public void check() {
		driver.findElement(search).click();
	}

}
