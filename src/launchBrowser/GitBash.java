package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitBash {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhart\\selenium\\1st_Selenium\\drivers\\chromedriver.exe");// line 12 and 13 will helps us to launch chrome driver
	
	//object create of webdriver
	WebDriver driver  = new ChromeDriver();//object variable
	
	//go to website 
	driver.get("https://www.amazon.com/"); // this how we launch google webbrowser.
	//maximize browser
	driver.manage().window().maximize();
	}
}
