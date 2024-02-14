package plumtestpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import plumpagepackage.Loginpage;
import plumutilspackage.Plumutilsexcel;


public class Logintest extends Plumbaseclass{

	@Test
	
	public void test1()
	{
		Loginpage ln=new Loginpage(driver);
	    ln.loginfn();
		
	}
@Test
public void test2() throws IOException, InterruptedException
{
	Loginpage ln=new Loginpage(driver);
	String x1="C:\\Users\\sreej\\OneDrive\\Desktop\\plumdata.xlsx";
	String  Sheet="Sheet1";
	
	int rowcount=Plumutilsexcel.getRowCount(x1,Sheet);
	
	for(int i=1;i<=rowcount;i++)
	{
		String mail=Plumutilsexcel.getCellValue(x1, Sheet,i,0);
		System.out.println("username="+mail);
		String pswd=Plumutilsexcel.getCellValue(x1, Sheet,i,1);
		System.out.println("password="+pswd);
		
		ln.datadriven(mail,pswd);
		//ob.loginclick();
	}
	//ln.datadriven();
}

@Test
public void test3()
{
	Loginpage ln=new Loginpage(driver);
	ln.logoutfn();
}
}
