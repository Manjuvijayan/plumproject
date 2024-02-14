package plumpagepackage;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Plumhomepage {

	WebDriver driver;
	
	//@FindBy(xpath="//*[@id=\"shopify-section-sections--15665365090364__header\"]/store-header/header/div[1]/a/span/img")
	@FindBy(xpath="//*[@class='logo__link inline-block']")
	WebElement logo;
	@FindBy(tagName="a")
	List<WebElement> linkdetails;
	//@FindBy(xpath="//*[@id=\"shopify-section-sections--15665365090364__announcement\"]/announcement-bar/div/div/div/div/div/a")
	@FindBy(xpath="//*[@class='announcement__text flex items-center m-0']")
	WebElement  slider;
	@FindBy(xpath="//*[@class='main-nav__item main-nav__item--primary main-nav__item-content']")
	List<WebElement >mainelements;
	@FindBy(xpath="//*[@class='main-menu__content has-motion justify-center']")
	//@FindBy(xpath="//*[@id=\"shopify-section-sections--15665365090364__header\"]/store-header/header/main-menu/details/div")
	WebElement elementnames;
	public Plumhomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void logoCheck()
	{
		boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo not present");
		}
	}
public void titleVerification()
{
	String s=driver.getTitle();
	System.out.println("Title is="+s);
	
	if(s.equalsIgnoreCase("Plum Goodness | 100% Vegan & Toxin-Free Products | For Men & Women"))
	{
		System.out.println("Title is as per expected");
	}
	else
	{
		System.out.println("Title not as per expected");
	}
	//Assert.assertEquals("Plum Goodness | 100% Vegan & Toxin-Free Products | For Men & Women","Plum Goodness | 100% Vegan & Toxin-Free Products | For Men & Women");
	
}

public void linkCount() 
{
//	List<WebElement>linkdetails=driver.findElements(By.tagName("a"));
	
    System.out.println("link count="+linkdetails.size());

	for(WebElement element:linkdetails)
	{
		String link=element.getAttribute("href");
		verify(link);
	}
}
public String verify(String link)
{
	try
	{
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		int code=con.getResponseCode();
	//	System.out.println(code);
		if(code>=400)
		{
			System.out.println(u+ "is a broken link");
		}
		
	}
	catch(Exception e)
	
	{
		
	}
	return link;
}

public void sliderText()
{
	String s=slider.getText();
	System.out.println("slider text is="+s);
}

public void elementsCount()
{
	int n=mainelements.size();
	System.out.println("No: of main elements="+n);
}
public void mainelementsname()
{
String s=elementnames.getText();
System.out.println("Main elements are="+s);
}

}








