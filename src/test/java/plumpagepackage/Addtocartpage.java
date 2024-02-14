package plumpagepackage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Addtocartpage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id='header-search']")
	WebElement search;
	@FindBy(xpath="//*[@class='quick-add-btn-text']")
	WebElement addtocart;
	@FindBy(xpath="//*[@class='header__cart-count absolute bg-theme-text text-theme-bg text-center']")
	WebElement atc;
	@FindBy(xpath="//*[@id=\"cart-item-1\"]/td[3]/div[1]/quantity-input/div/button[2]")
	WebElement count;
	@FindBy(xpath="//*[@id='cart-icon']")
	WebElement carticon;
	@FindBy(xpath="//*[@id=\"cart-drawer\"]/div[2]/div[2]/div/button")
	WebElement checkout;
	@FindBy(xpath="//summary//a[contains(text(),'skin')]")
	WebElement skinlink;
	@FindBy(xpath="//a[contains(text(),'sunscreens')]")
	WebElement sunscreenlink;
	@FindBy(xpath="//button[@class='usf-c-select__input-value usf-btn']")
	WebElement sortbybtn;
	@FindBy(xpath="//button[contains(text(),'Price: High to Low')]")
	WebElement sortby;
	@FindBy(xpath="//*[@class='usf-c-select__list']")
	WebElement sortlist;
	@FindBy(xpath="//a[@class='btn btn--primary' and @href='/collections/all-in-stock']")
	WebElement viewallbtn;
	@FindBy(xpath="//*[@class='cart-drawer__view-cart clear_cart']")
	WebElement clearcart;
	
	public Addtocartpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

public void searchfn(String item, Keys enter) 
{
	search.sendKeys(item,Keys.ENTER);
	
}
public void addtocartfn() throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)");
	addtocart.click();
	atc.click();
	Thread.sleep(3000);
}

public void countplus()
{
	count.click();
}

public void checkoutfn()
{
	checkout.click();
}

public void mousehoverfn() throws InterruptedException
{
	Actions a=new Actions(driver);
	a.moveToElement(skinlink).perform();
	sunscreenlink.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
}
public void sortby()
{
	
	sortbybtn.click();
	sortby.click();
    addtocart.click();
	
}	
public void viewallfn()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,800)");
	viewallbtn.click();
}
public void clearcartfn()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,800)");
	clearcart.click();
}
}
