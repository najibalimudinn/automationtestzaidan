package com.b2.TestNGSeleniumCucumber.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageLocators {
    @FindBy(xpath = "/html/body/div[2]/main/div/div[1]/div/div/div[1]/h1")
    public WebElement pageTitle;

    @FindBy(tagName = "li")
    public List<WebElement> navbarItems;

    @FindBy(xpath = "/html/body/div[2]/main/div/div[1]/div/div/div[2]/button")
    public WebElement logoutButton;

    @FindBy(xpath = "//button[text()='Ya']")
    public WebElement yaButton;

}
