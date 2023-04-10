package com.qa.carmax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.carmax.objects.MainPage;

public class MainPageActions {
	WebDriver driver;
	public MainPageActions(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public WebElement hoverProfileSignup() {
		final WebElement elementHoverProfilesignup =  driver.findElement(MainPage.viewbox);
		return elementHoverProfilesignup;
	}
	
	public void signupRegister() {
	 driver.findElement(MainPage.signup).click();
	}

}
