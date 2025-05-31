package com.b2.TestNGSeleniumCucumber.stepdefinitions;

import com.b2.TestNGSeleniumCucumber.actions.HomePageActions;
import com.b2.TestNGSeleniumCucumber.actions.LoginPageActions;
import com.b2.TestNGSeleniumCucumber.utils.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LogoutSteps {
    HomePageActions objHomePage = new HomePageActions();
    LoginPageActions objLogin = new LoginPageActions();
    String url = "http://ptbsp.ddns.net:6882/";

    @And("User has logged in to the Zaidan Educare School app with {string} username and {string} password")
    public void navigateToDashboard(String username, String password) throws InterruptedException{
        HelperClass.openPage(url);
        Thread.sleep(2000);
        objLogin.inputCredentials(username, password);
        objLogin.clickLoginButton();
    }

    @When("User clicks the logout button at the top right")
    public void userClicksOnLogoutButton(){objHomePage.clickLogoutButton();}

    @And("User clicks the Ya button")
    public void userClicksOnYaButton(){objHomePage.clickYaButton();}

    @Then("User is navigated to the login page")
    public void isNavigatedToLoginPage(){
        Assert.assertEquals(objLogin.getPageTitle(), "Pengelolaan Dana Pendidikan Sekolah Zaidan Educare", "Assert is page title displayed");
    }

    @And("User should be able to see login form")
    public void userShouldBeAbleToSee(){
        Assert.assertTrue(objLogin.isUsernameFieldDisplayed(), "Assert is username field displayed");
        Assert.assertTrue(objLogin.isPasswordFieldDisplayed(), "Assert is password field displayed");
        Assert.assertTrue(objLogin.isLoginButtonDisplayed(), "Assert is login button displayed");
    }
}
