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

public class FirstTest
extends Drivers {
    @Test(priority=1, description="I am the first Test")
    void fLaunchAmazon() throws Exception {
        loggers = LogManager.getLogger((String)FirstTest.class.getName());
        test = reports.createTest("First Test", "Launching Flipkart Website on Chrome Browser");
        test.log(Status.INFO, "Browser Launching Browser");
        driver.get(FirstTest.getB("url"));
        test.pass("Browser Properly Launched");
        loggers.info("Browser has been Launched1");
        Screenshots.screenshot("FirstClass");
    }
}

