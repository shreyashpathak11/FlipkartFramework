/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.aventstack.extentreports.Status
 *  org.apache.logging.log4j.LogManager
 *  org.testng.annotations.Test
 */
package testClasses;

import base.Drivers;
import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import utility.Screenshots;

public class ThirdTest extends Drivers {
	@Test(priority = 3, description = "I am the Third Test")
	void sLaunchAmazon() throws Exception {
		loggers = LogManager.getLogger((String) ThirdTest.class.getName());
		test = reports.createTest("Second Test", "Launching Amazon Website on Chrome Browser");
		test.log(Status.INFO, "Browser Launching Browser");
		driver.get(ThirdTest.getB("url"));
		test.pass("Browser Properly Launched");
		loggers.info("Browser has been Launched3");
		Screenshots.screenshot("SecondClass");
	}
}
