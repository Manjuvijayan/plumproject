package plumpagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trackorderpage {

	
	WebDriver driver;
	@FindBy(xpath="//a[@class='header__icon text-current' and  @href=\"/pages/track-your-order-2\"]")
	WebElement trackorder;		
	@FindBy(xpath="//*[@class='btn']")
	WebElement trackbutton;
	@FindBy(xpath="//*[@id=\"order_number\"]")
	WebElement orderid;
	
	
	public Trackorderpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void trackorderfn()
	{
		trackorder.click();
	    orderid.click();
		trackbutton.click();
	}
 }
