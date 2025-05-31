package com.b2.TestNGSeleniumCucumber.actions;

import com.b2.TestNGSeleniumCucumber.locators.HomePageLocators;
import com.b2.TestNGSeleniumCucumber.utils.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageActions {
    HomePageLocators homePageLocators = null;

    public HomePageActions() {
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), homePageLocators);
    }

    public boolean isPageTitleDisplayed() {
        String expectedTitle = "Dasbor - Bendahara";
        return (homePageLocators.pageTitle.getText().equals(expectedTitle));
    }

    public boolean isDasborDisplayed() {
        return homePageLocators.navbarItems.stream()
                .map(WebElement::getText)
                .anyMatch(item -> item.equals("Dasbor"));
    }

    public boolean isTagihanSiswaDisplayed() {
        return homePageLocators.navbarItems.stream()
                .map(WebElement::getText)
                .anyMatch(item -> item.equals("Tagihan Siswa"));
    }

    public boolean isTransaksiPenerimaanDanaDisplayed() {
        return homePageLocators.navbarItems.stream()
                .map(WebElement::getText)
                .anyMatch(item -> item.equals("Transaksi Penerimaan Dana"));
    }

    public boolean isPengaturanNotifikasiDisplayed() {
        return homePageLocators.navbarItems.stream()
                .map(WebElement::getText)
                .anyMatch(item -> item.equals("Pengaturan Notifikasi"));
    }

    public boolean isStatusPembayaranDisplayed() {
        return homePageLocators.navbarItems.stream()
                .map(WebElement::getText)
                .anyMatch(item -> item.equals("Status Pembayaran"));
    }

    public boolean isRekapitulasiDisplayed() {
        return homePageLocators.navbarItems.stream()
                .map(WebElement::getText)
                .anyMatch(item -> item.equals("Rekapitulasi"));
    }

    public boolean isProgresTransaksiPenerimaanDanaDisplayed() {
        return homePageLocators.navbarItems.stream()
                .map(WebElement::getText)
                .anyMatch(item -> item.equals("Progres Transaksi Penerimaan Dana"));
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
