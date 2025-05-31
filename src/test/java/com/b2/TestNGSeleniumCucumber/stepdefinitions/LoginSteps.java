package com.b2.TestNGSeleniumCucumber.stepdefinitions;

import com.b2.TestNGSeleniumCucumber.actions.HomePageActions;
import com.b2.TestNGSeleniumCucumber.actions.LoginPageActions;
import com.b2.TestNGSeleniumCucumber.utils.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();
    String url = "http://ptbsp.ddns.net:6882/";

    @Given("User has opened the browser")
    public void openBrowser() {
        HelperClass.setUpDriver();
    }

    @And("User has navigated on the login page Education Fund Payment Management System for Zaidan Educare School app")
    public void navigateToWebApp() throws InterruptedException {
        HelperClass.openPage(url);
        Thread.sleep(2000);
    }

    @When("User enters {string} & {string}")
    public void userEntersCredential(String username, String password) {
        objLogin.inputCredentials(username, password);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        objLogin.clickLoginButton();
    }

    @Then("User is navigated to the dashboard page")
    public void isNavigatedToDashboardPage() {
        Assert.assertTrue(objHomePage.isPageTitleDisplayed(), "Assert is page title displayed");
    }

    @And("User should be able to see navigation bar for bendahara")
    public void isUserAbleToSeeNavBar() {
        Assert.assertTrue(objHomePage.isDasborDisplayed(), "Assert is Dasbor displayed");
        Assert.assertTrue(objHomePage.isTagihanSiswaDisplayed(), "Assert is Tagihan Siswa displayed");
        Assert.assertTrue(objHomePage.isTransaksiPenerimaanDanaDisplayed(), "Assert is Transaksi Penerimaan Dana displayed");
        Assert.assertTrue(objHomePage.isPengaturanNotifikasiDisplayed(), "Assert is Pengaturan Notifikasi displayed");
        Assert.assertTrue(objHomePage.isStatusPembayaranDisplayed(), "Assert is Status Pembayaran displayed");
        Assert.assertTrue(objHomePage.isRekapitulasiDisplayed(), "Assert is Rekapitulasi displayed");
        Assert.assertTrue(objHomePage.isProgresTransaksiPenerimaanDanaDisplayed(), "Assert is Progres Transaksi Penerimaan Dana displayed");
    }

    @Then("User should be able to see {string}")
    public void userShouldBeAbleToSee(String message) {
        Assert.assertTrue(objLogin.isErrorMessageDisplayed(message), "Assert is error message displayed");
    }
}
