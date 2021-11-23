package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.DropDownElement;
import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.pageslocators.HeaderLocators;
import com.ita.edu.teachua.ui.pages.advanced_search.AdvancedSearchPage;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage extends BasePage {

    private LinkElement aboutUs;
    private LinkElement clubsLink;
    private LinkElement services;
    private DropDownElement guestDropdown;
    private ButtonElement advancedSearchButton;
    private DropDownElement ownerDropdown;

    public HeaderPage(WebDriver driver) {
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

    public HeaderPage clickOnClubs() {
        clubsLink.click();
        return this;
    }

    public HeaderPage clickOnAboutUs() {
        aboutUs.click();
        return this;
    }

    public HeaderPage clickOnServices() {
        services.click();
        return this;
    }

    public GuestDropdownComponent clickOnGuestDropdown() {
        guestDropdown.click();
        return new GuestDropdownComponent(driver);
    }

    public OwnerDropdownComponent clickOnOwnerDropdown() {
        DropDownElement ownerDropdown = new DropDownElement(driver, HeaderLocators.OWNER_DROPDOWN);
        ownerDropdown.click();
        return new OwnerDropdownComponent(driver);
    }

    public OwnerDropdownComponent clickOnUserLoginDropdown() {
        for (int i = 0; i < 3; i++) {
            guestDropdown = new DropDownElement(new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(HeaderLocators.GUEST_DROPDOWN.getPath())));
            try {
                guestDropdown.click();
                break;
            } catch (StaleElementReferenceException | TimeoutException e) {
                e.printStackTrace();
            }
        }
        return new OwnerDropdownComponent(driver);
    }

    public HeaderPage authorize(String email, String password) {
        clickOnGuestDropdown().clickOnLoginButton().FillLoginFields(email, password);
        return new HeaderPage(driver);
    }

    public OwnerDropdownComponent clickOnOwnerDropdown() {
        ownerDropdown = new DropDownElement(driver, HeaderLocators.OWNER_DROPDOWN);
        ownerDropdown.click();
        return new OwnerDropdownComponent(driver);
    }

    public AdvancedSearchPage clickAdvancedSearchButton() {
        advancedSearchButton.click();
        return new AdvancedSearchPage(driver);
    }
}
