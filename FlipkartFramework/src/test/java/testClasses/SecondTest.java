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

public class SecondTest
extends Drivers {
    @Test(priority=2, description="I am the second Test")
    void sLaunchAmazon() throws Exception {
        loggers = LogManager.getLogger((String)SecondTest.class.getName());
        test = reports.createTest("Second Test", "Launching Amazon Website on Chrome Browser");
        test.log(Status.INFO, "Browser Launching Browser");
        driver.get(SecondTest.getB("url"));
        test.pass("Browser Properly Launched");
        loggers.info("Browser has been Launched2");
        Screenshots.screenshot("SecondClass");
    }
}

