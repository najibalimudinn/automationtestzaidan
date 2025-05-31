package com.b2.TestNGSeleniumCucumber.actions;

import com.b2.TestNGSeleniumCucumber.locators.HomePageLocators;
import com.b2.TestNGSeleniumCucumber.utils.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class HomePageActions {
    HomePageLocators homePageLocators = null;

    public HomePageActions() {
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), homePageLocators);
    }

    public String getPageTitle() {
        return homePageLocators.pageTitle.getText();
    }

    public List<String> getNavbarItemsText() {
        return homePageLocators.navbarItems.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void clickLogoutButton() {
        homePageLocators.logoutButton.click();
    }

    public void clickYaButton(){
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homePageLocators.yaButton));
        homePageLocators.yaButton.click();
    }

}
