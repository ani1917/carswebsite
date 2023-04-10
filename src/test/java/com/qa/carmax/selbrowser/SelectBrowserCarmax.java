package com.qa.carmax.selbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SelectBrowserCarmax {
	public WebDriver driver;

	public void selbrowser(String selectbrowser)
	{
		if(selectbrowser.equals("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if (selectbrowser.equals("firefox")) {
			 driver = new FirefoxDriver();
		}
		else
		{
			 driver = new EdgeDriver();
		}
	}
	
	@BeforeMethod	
	public void browserOpenAction() {
		selbrowser("chrome");
		driver.get("https://www.carmax.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void browserCloseAction() {
		driver.manage().window().minimize();
		
	}
	
	
}
