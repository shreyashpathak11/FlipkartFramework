package base;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Loggers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utility.Browser;

public class Drivers extends Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ExtentSparkReporter spark = new ExtentSparkReporter(
			"D:\\SP Main Folder\\Java\\MyJavaProjects\\FlipkartFramework\\Reports\\Reports.html");
	public static ExtentReports reports = new ExtentReports();
	public static ExtentTest test;
	public static Logger loggers;

	@BeforeSuite
	public void browserName() throws Exception {
		String name = Drivers.getB("browser");
		if (name.equalsIgnoreCase("chrome")) {
			loggers = LogManager.getLogger((String) Drivers.class.getName());
			loggers.info("Launching Chrome Browser");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
			wait = new WebDriverWait(driver, Duration.ofSeconds(5L));
			driver.manage().window().maximize();
		} else if (name.equalsIgnoreCase("firefox")) {
			reports.attachReporter(new ExtentObserver[] { spark });
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
			wait = new WebDriverWait(driver, Duration.ofSeconds(5L));
			driver.manage().window().maximize();
		} else {
			reports.attachReporter(new ExtentObserver[] { spark });
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
			wait = new WebDriverWait(driver, Duration.ofSeconds(5L));
			driver.manage().window().maximize();
		}
	}

	@BeforeTest
	public void reporting() {
		reports.attachReporter(new ExtentObserver[] { spark });
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
		reports.flush();
	}
}
