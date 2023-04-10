package com.qa.carmax.objects;

import org.openqa.selenium.By;

public interface SignupPage {
public static final By fname = By.name("First Name");
public static final By	lname = By.name("Last Name");
public static final By email = By.name("Email");
public static final By mobile = By.name("Phone Number");
public static final By 	password = By.name("Password");
public static final By createaccountbtn = By.xpath("//button[@aria-label='Create Account']");

}
