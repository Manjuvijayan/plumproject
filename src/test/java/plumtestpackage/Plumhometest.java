package plumtestpackage;

import org.testng.annotations.Test;

import plumpagepackage.Plumhomepage;

public class Plumhometest extends Plumbaseclass{


	@Test
	
	public void test1()
	{
		Plumhomepage hp=new Plumhomepage(driver);
		hp.logoCheck();
	}
@Test 

public void test2()
{
	Plumhomepage hp=new Plumhomepage(driver);
	hp.titleVerification();
}
@Test
 public void test3()
 {
	 Plumhomepage hp=new Plumhomepage(driver);
	 hp.linkCount();
	 
 }
@Test
public void test4()
{
	 Plumhomepage hp=new Plumhomepage(driver);
	 hp.sliderText();
}
@Test
public void test5()
{
	Plumhomepage hp=new Plumhomepage(driver);
	hp.elementsCount();
}
@Test
public void test6()
{
	Plumhomepage hp=new Plumhomepage(driver);
	hp.mainelementsname();
}
}
