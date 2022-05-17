package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;  // this comes from libs folder library that is why its selenium import.
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws Exception {
		
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhart\\selenium\\1st_Selenium\\drivers\\chromedriver.exe");// line 12 and 13 will helps us to launch chrome driver
		
		//object create of webdriver
		WebDriver driver  = new ChromeDriver();//object variable
		
		//go to website 
		driver.get("https://www.amazon.com/"); // this how we launch google webbrowser.
		//maximize browser
		driver.manage().window().maximize();
		Thread.sleep(3000);//thread.sleep to use pause little bit. it will take few mili seconds to operate.
		driver.close();
		
	}

}
