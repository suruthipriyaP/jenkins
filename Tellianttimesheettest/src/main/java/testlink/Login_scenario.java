//package testlink;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import br.eti.kinoshita.testlinkjavaapi.TestLinkAPIException;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import testlink.api.java.client.TestLinkAPIClient;
//import testlink.api.java.client.TestLinkAPIResults;
//
//public class Login_scenario extends TestLinkIntegration {
//	 public static WebDriver driver;
//	@Test
//	public void TestOne() throws Exception
//	{    try {
//	    	WebDriverManager.chromedriver().setup();
//			ChromeDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			driver.get("http://14.141.185.76/testlink/index.php");
//			String current_url=	driver.getCurrentUrl();
//			System.out.println(current_url);
//			Assert.assertEquals("http://14.141.185.76/testlink/login.php",  current_url);
//			TestLinkIntegration.updateResults("validlogin",null,TestLinkAPIResults.TEST_PASSED);
//	}
//			catch(Exception e){
//				TestLinkIntegration.updateResults("validlogin",e.getMessage(),TestLinkAPIResults.TEST_FAILED);
//			}
//			
//	}
//
//
//}
//#################################################################################################
//	public static String DEVKEY="d49b25c2486f47d4bd8c990a55bc7ab3";
//	public static String URL="http://14.141.185.76//testlink/lib/api/xmlrpc/v1/xmlrpc.php";
//	 
//	public void reportResult(String TestProject,String TestPlan,String Testcase,String Build,String Notes,String Result) throws TestLinkAPIException, testlink.api.java.client.TestLinkAPIException{
//	TestLinkAPIClient api=new TestLinkAPIClient(DEVKEY, URL);
//	api.reportTestCaseResult(TestProject, TestPlan, Testcase, Build, Notes, Result);
//	}
//	 
//	@Test
//	public void Test1()throws Exception
//	{
//		WebDriverManager.chromedriver().setup();
//		Login_scenario a=new Login_scenario();
//	WebDriver driver=new ChromeDriver();
//	WebDriverWait wait=new WebDriverWait(driver, 600);
//	String testProject="Demo Project";
//	String testPlan="Plan 1";
//	//String testCase="US132_TC01_Verify if admin is able to add a Role";
//	String testCase="US132_TC01_Verify if admin is able to Edit a Role";
//	String build="Build #01";
//	String notes=null;
//	String result=null;
//	try{
//	driver.manage().window().maximize();
//	driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin#__utma=29003808.207225056.1604565781.1604565781.1604565781.1&__utmb=29003808.0.10.1604565781&__utmc=29003808&__utmx=-&__utmz=29003808.1604565781.1.1.utmcsr=google%7Cutmccn=(organic)%7Cutmcmd=organic%7Cutmctr=(not%20provided)&__utmv=-&__utmk=22947448");
//	result= TestLinkAPIResults.TEST_PASSED;
//	notes="Executed successfully";
//	}
//	catch(Exception e){
//	result=TestLinkAPIResults.TEST_FAILED;
//	notes="Execution failed";
//	}
//	finally{
//	 
//	a.reportResult(testProject, testPlan, testCase, build, notes, result);
//	driver.quit();
//	}
//	}
//	}


