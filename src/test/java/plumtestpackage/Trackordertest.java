package plumtestpackage;

import org.testng.annotations.Test;

import plumpagepackage.Trackorderpage;
public class Trackordertest extends Plumbaseclass
{

	@Test
	public void test1()
	{
		Trackorderpage tp=new Trackorderpage(driver);
		tp.trackorderfn();
		
	}
}