package com.ita.edu.teachua.ui.pages;

import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.MainMenuHeaderLocators;
import org.openqa.selenium.WebDriver;

public class Header extends MainPage {

    private LinkElement aboutUs;
    private LinkElement clubsLink;
    private LinkElement services;

    public Header(WebDriver driver) {
        super(driver);
        initElements();
    }

    public void initElements() {
        aboutUs = new LinkElement(driver, MainMenuHeaderLocators.ABOUT_US_LINK);
        clubsLink = new LinkElement(driver,MainMenuHeaderLocators.CLUBS_LINK);
        services = new LinkElement(driver,MainMenuHeaderLocators.SERVICES_LINK);
    }

    public Header clickOnClubs() {
        clubsLink.click();
        return this;
    }

    public Header clickOnAboutUs() {
        aboutUs.click();
        return this;
    }

    public Header clickOnServices() {
        services.click();
        return this;
    }
}
