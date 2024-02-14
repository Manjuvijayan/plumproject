package plumtestpackage;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import plumpagepackage.Addtocartpage;

public class Searchtest extends Plumbaseclass{

	@Test
	public void test1() throws InterruptedException
	{
		Addtocartpage ac=new Addtocartpage(driver);
		ac.searchfn("soap",Keys.ENTER);
		
		ac.addtocartfn();
		Thread.sleep(3000);
		ac.clearcartfn();
	}


}
