package com.qa.carmax.tests;


	import java.io.FileNotFoundException;
	import java.util.ArrayList;
	import java.util.Iterator;

	import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

import com.qa.carmax.objects.SignupPage;
import com.qa.carmax.pages.MainPageActions;
import com.qa.carmax.selbrowser.SelectBrowserCarmax;
	import utils.DataUtil;

	public class SignupPageTest  extends SelectBrowserCarmax {

		
		@DataProvider(name="getData")
		public Iterator<Object[]> returnData() throws FileNotFoundException
		{
			  ArrayList<Object[]> testdata = null;
				testdata= DataUtil.getExcelData("signupfile.xlsx","Sheet1");
				return testdata.iterator();
			
		}
		
		@Test(dataProvider = "getData")
		public void printData(String fname,String lname,String email,String mobile,String password )
		{
			//driver.get("https://www.facebook.com/");
			
			MainPageActions mpgactions = new MainPageActions(driver);
			Actions act = new Actions(driver);
			act.moveToElement(mpgactions.hoverProfileSignup()).perform();
			mpgactions.signupRegister();
			System.out.println(fname+" "+lname+" "+" "+email+" "+mobile+" "+password);
			
			driver.findElement(SignupPage.fname).sendKeys(fname);
			driver.findElement(SignupPage.lname).sendKeys(lname);
			driver.findElement(SignupPage.email).sendKeys(email);
			driver.findElement(SignupPage.mobile).sendKeys(mobile);
			driver.findElement(SignupPage.password).sendKeys(password);
			driver.findElement(SignupPage.createaccountbtn).click();
			
			//driver.findElement(By.id("email")).sendKeys(fname);
			//driver.findElement(By.id("pass")).sendKeys(lname);
			//driver.findElement(By.name("email")).sendKeys(mobile);//signup and create a form
			//driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
}
	}
