package AshBrokerage.core;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import javax.mail.MessagingException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
		protected final Logger logger = LogManager.getLogger(getClass());
		public static ExtentSparkReporter spark;
		public static ExtentReports extent;
		public static ExtentTest test;
		public static FileReader fileReader;
		public WebDriver driver;
		public static Date date = new Date();
		public static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		public static String dt = formatter.format(date);
		public static String reportDestination = "reports/report_" + dt + ".html";
		
	/*	@BeforeTest
		@Parameters("browser")
		public void initialize(String browser) {
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://dynamic-advisor-qa.techf.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				System.out.println("chrome is launched");
			}
			
			else if(browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://dynamic-advisor-qa.techf.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				System.out.println("firefox is launched");
			}
			
			else if(browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://dynamic-advisor-qa.techf.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				System.out.println("edgedriver is launched");
				
			}
			
		}*/
		
		@BeforeTest(alwaysRun=true)
		public void setup() {       
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://dynamic-advisor-staging.techf.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		}
	  	
		@BeforeSuite(alwaysRun = true)
		public void reportsetup() throws IOException {
			extentReportSpark();
		}
		
		public void extentReportSpark() throws IOException {
			//ExtentReports, ExtentSparkReporter
			// Delete everything from reports folder expect .gitkeep
			File dir = new File(System.getProperty("user.dir") + "/reports");
			File[] files = dir.listFiles();
			for (File file : files) {
				// convert the file name into string
				String fileName = file.toString();
				int index = fileName.lastIndexOf('.');
				if (index > 0) {
					String extension = fileName.substring(index + 1);
					if (extension.equalsIgnoreCase("html") || extension.equalsIgnoreCase("zip")) {
						String filePath = fileName;
						File deleteFile = new File(filePath);
						deleteFile.delete();
					}
				}
			}
//serenity
			spark = new ExtentSparkReporter(reportDestination);  
			extent = new ExtentReports();
			extent.attachReporter(spark);

			spark.config().setDocumentTitle("Ash Brokerage Automation Testing Report");
			spark.config().setReportName("Ash Brokerage Automation Test Suite");
			spark.config().setTimelineEnabled(Boolean.TRUE);
			spark.config().setOfflineMode(Boolean.TRUE);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
			spark.config().setTimelineEnabled(Boolean.TRUE);
			
			extent.setSystemInfo("Platform", "Windows");
			extent.setSystemInfo("URL","https://dynamic-advisor-qa.techf.com");
			extent.setSystemInfo("Browser","Chrome");
			extent.setSystemInfo("User Name","Pavan Kale");
		}

//		@AfterMethod
		public void tearDown(ITestResult result) throws IOException,MessagingException {
			if (result.getStatus() == ITestResult.FAILURE) {
				test.log(Status.FAIL, "TEST CASE FAILED " + result.getName());  //
				test.log(Status.FAIL, "TEST CASE FAILED " + result.getThrowable());
				String pathString=Base.screenShot(driver, result.getName());
				test.addScreenCaptureFromPath(pathString);
			} else if (result.getStatus() == ITestResult.SKIP) {
				test.log(Status.SKIP, "Test Case SKIPPED " + result.getName());
			} else if (result.getStatus() == ITestResult.SUCCESS) {
				test.log(Status.PASS, "Test Case PASSED " + result.getName());
			}
		// driver.close();
		}
		    
//		@AfterTest
		public void afterTest() {
			 driver.close();
		}
	@AfterSuite
	public void endReports() {
		extent.flush();
	}

	public static String screenShot(WebDriver driver,String filename) {
		  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		  String destination = System.getProperty("user.dir")+"\\ScreenShot\\"+filename+"_"+dateName+".png";
		  File finalDestination = new File(destination);
		  try {
		   FileUtils.copyFile(source, finalDestination);
		  } catch (Exception e) {
		   // TODO Auto-generated catch block
		   e.getMessage();
		  }
		  return destination;
		 }
	}


