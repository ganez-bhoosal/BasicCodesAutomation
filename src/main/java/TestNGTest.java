import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is beforeSuite ");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is beforeClass ");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is beforeMethod ");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is beforeTest ");
	}
	
	@Test
	public void test()
	{
		System.out.println("This is Test ");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is afterTest ");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is afterMethod ");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is afterClass ");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is afterSuite ");
	}
	
	
}
