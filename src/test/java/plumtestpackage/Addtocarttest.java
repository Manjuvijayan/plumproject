package plumtestpackage;


import org.testng.annotations.Test;

import plumpagepackage.Addtocartpage;

public class Addtocarttest extends Plumbaseclass{

	@Test
	public void test1()
	{
		Addtocartpage ac=new Addtocartpage(driver);
		ac.viewallfn();
	}
	@Test	
public void test2() throws InterruptedException
{
	Addtocartpage ac=new Addtocartpage(driver);
	ac.addtocartfn();
	System.out.println("add to cart is successfull");
	ac.countplus();
	System.out.println("count is increased");
	ac.checkoutfn();
}
}
