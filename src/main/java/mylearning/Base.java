package mylearning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public static void initializeDriver() throws IOException {

		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(
				"G:\\selenium\\workspace\\E2EProject\\src\\main\\resources\\data.properties");
		p.load(fis);

		String browserName = p.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\selenium\\new\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(p.getProperty("url"));
			driver.close();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"G:\\selenium\\new\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(p.getProperty("url"));
			driver.close();

		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"G:\\selenium\\new\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get(p.getProperty("url"));
			driver.close();

		}

	}

	public static void main(String[] args) throws IOException {

		System.out.println("I'm the Test enginer");
		System.out.println("I'm the Test enginer");
		System.out.println("I'm the Test enginer");
		System.out.println("I'm the Test enginer");
		System.out.println("I'm the Test enginer");
		System.out.println("I'm the Test enginer");
		System.out.println("I'm the Test enginer");
		System.out.println("I'm the Test enginer");

		Base.initializeDriver();
	}

}
