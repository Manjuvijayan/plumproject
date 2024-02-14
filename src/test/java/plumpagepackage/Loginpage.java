package plumpagepackage;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	@FindBy(xpath="//a[contains(@href,'/account/login')]")
	WebElement login;
	@FindBy(id="customer-email")
	WebElement email;
	@FindBy(id="customer-password")
	WebElement password;
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	WebElement signin;
	@FindBy(xpath="//a[@class='logout']")
	WebElement logout;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void loginfn()
	{
		login.click();
	}
public void datadriven(String mail,String pswd) throws IOException, InterruptedException
{
	
email.clear();
email.sendKeys(mail);
password.clear();
password.sendKeys(pswd);
Thread.sleep(3000);
signin.click();

}

public void logoutfn()
{
logout.click();	
}
}
