package com.b2.TestNGSeleniumCucumber.actions;

import com.b2.TestNGSeleniumCucumber.locators.LoginPageLocators;
import com.b2.TestNGSeleniumCucumber.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
    LoginPageLocators loginPageLocators = null;

    public LoginPageActions() {
        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
    }

    public void inputCredentials(String username, String password) {
        loginPageLocators.usernameField.sendKeys(username);
        loginPageLocators.passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginPageLocators.loginButton.click();
    }

    public String getErrorMessage() {
        return loginPageLocators.errorMessage.getText();
    }

    public String getPageTitle() {
        return loginPageLocators.titleLogin.getText();
    }

    public boolean isUsernameFieldDisplayed() {
        return loginPageLocators.usernameField.isDisplayed();
    }

    public boolean isPasswordFieldDisplayed() {
        return loginPageLocators.passwordField.isDisplayed();
    }

    public boolean isLoginButtonDisplayed() {
        return loginPageLocators.loginButton.isDisplayed();
    }
}
