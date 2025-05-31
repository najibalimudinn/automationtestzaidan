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

    public boolean isErrorMessageDisplayed(String message) {
        return loginPageLocators.errorMessage.getText().equals(message);
    }

    public boolean isLoginPageDisplayed(){
        String expectedTitle = "Pengelolaan Dana Pendidikan Sekolah Zaidan Educare";
        return (loginPageLocators.titleLogin.getText().equals(expectedTitle));
    }

    public boolean isFormDisplayed(){
        return
        loginPageLocators.usernameField.isDisplayed() &
        loginPageLocators.passwordField.isDisplayed() &
        loginPageLocators.loginButton.isDisplayed();
    }
}
