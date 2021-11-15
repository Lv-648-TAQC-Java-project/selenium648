package com.ita.edu.teachua.ui.pages;

import com.ita.edu.teachua.ui.components.GuestDropdownComponent;
import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.DropDownElement;
import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.pageslocators.HeaderLocators;
import org.openqa.selenium.WebDriver;

public class Header extends BasePage {

    private LinkElement aboutUs;
    private LinkElement clubsLink;
    private LinkElement services;
    private DropDownElement guestDropdown;
    private ButtonElement advancedSearchButton;

    public Header(WebDriver driver) {
        super(driver);
        initElements();
    }

    public void initElements() {
        aboutUs = new LinkElement(driver, HeaderLocators.ABOUT_US_LINK);
        clubsLink = new LinkElement(driver, HeaderLocators.CLUBS_LINK);
        services = new LinkElement(driver, HeaderLocators.SERVICES_LINK);
        guestDropdown = new DropDownElement(driver, HeaderLocators.GUEST_DROPDOWN);
        advancedSearchButton = new ButtonElement(driver, HeaderLocators.ADVANCED_SEARCH_BUTTON);
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

    public GuestDropdownComponent clickOnLoginDropdown() {
        guestDropdown.click();
        return new GuestDropdownComponent(driver);
    }

    public AdvancedSearchPage clickAdvancedSearchButton() {
        advancedSearchButton.click();
        return new AdvancedSearchPage(driver);
    }

}
