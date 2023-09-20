package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Browser {
	static Properties prop = new Properties();
	static File file = new File(
			"D:\\SP Main Folder\\Java\\MyJavaProjects\\FlipkartFramework\\utility\\config.properties");

	public static String getB(String name) throws Exception {
		InputStream input = new FileInputStream(file);
		prop.load(input);
		return prop.getProperty(name);
	}

	public void setB(String name, String value) throws Exception {
		OutputStream output = new FileOutputStream(file);
		prop.setProperty(name, value);
		prop.store(output, "");
	}
}
