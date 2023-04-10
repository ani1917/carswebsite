package com.qa.carmax.objects;

import org.openqa.selenium.By;

public interface MainPage {
public static final By viewbox = By.xpath("//button[@aria-label = 'Go to my profile page']"); 
public static final By signup = By.xpath("//a[@href='/mycarmax/register']");
}
