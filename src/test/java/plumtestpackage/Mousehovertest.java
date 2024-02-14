package plumtestpackage;

import org.testng.annotations.Test;

import plumpagepackage.Addtocartpage;

public class Mousehovertest extends Plumbaseclass {

	@Test
	public void test1() throws InterruptedException
	{
		Addtocartpage ac=new Addtocartpage(driver);
		ac.mousehoverfn();
	}

	@Test
	public void test2()
	{
		Addtocartpage ac=new Addtocartpage(driver);
		ac.sortby();
	}


}
