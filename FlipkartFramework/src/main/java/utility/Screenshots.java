/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 *  org.openqa.selenium.OutputType
 *  org.openqa.selenium.TakesScreenshot
 */
package utility;

import base.Drivers;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshots extends Drivers {
	public static void screenshot(String filename) throws Exception {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File source = (File) screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile((File) source, (File) new File(
				"D:\\SP Main Folder\\Java\\MyJavaProjects\\FlipkartFramework\\Screenshots\\"+filename+".png"));
	}
}
