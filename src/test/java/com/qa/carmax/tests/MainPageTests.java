package com.qa.carmax.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.carmax.pages.MainPageActions;
import com.qa.carmax.selbrowser.SelectBrowserCarmax;

public class MainPageTests extends SelectBrowserCarmax {
	
	@Test
	public void profileSignupHoverTest() {
		//WebDriver driver = null;
		MainPageActions mpgactions = new MainPageActions(driver);
		Actions act = new Actions(driver);
		act.moveToElement(mpgactions.hoverProfileSignup()).perform();
		mpgactions.signupRegister();
		
	}
	
	
	
}
