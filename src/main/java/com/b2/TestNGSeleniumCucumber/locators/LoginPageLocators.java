package com.b2.TestNGSeleniumCucumber.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
    @FindBy(name = "username")
    public WebElement usernameField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/button")
    public WebElement loginButton;
}
