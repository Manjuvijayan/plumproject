package plumtestpackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Plumbaseclass {

	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://plumgoodness.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		}
	
@AfterClass
public void teardown()
{
	driver.close();
}
}
