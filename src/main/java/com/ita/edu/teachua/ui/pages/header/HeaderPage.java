package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.DropDownElement;
import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.HeaderLocators;
import com.ita.edu.teachua.ui.pages.aboutuspage.AboutUsPage;
import com.ita.edu.teachua.ui.pages.advanced_search.AdvancedSearchPage;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.clubs_page.ClubsPage;
import com.ita.edu.teachua.ui.pages.services_page.ServicesPage;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderPage extends BasePage {

    private LinkElement aboutUs;
    private LinkElement clubsLink;
    private LinkElement services;
    private DropDownElement guestDropdown;

    public HeaderPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    public void initElements() {
        aboutUs = new LinkElement(driver, HeaderLocators.ABOUT_US_LINK);
        clubsLink = new LinkElement(driver, HeaderLocators.CLUBS_LINK);
        services = new LinkElement(driver, HeaderLocators.SERVICES_LINK);
        guestDropdown = new DropDownElement(driver, HeaderLocators.GUEST_DROPDOWN);
    }

    public ClubsPage clickOnClubs() {
        clubsLink.click();
        return new ClubsPage(driver);
    }

    public AboutUsPage clickOnAboutUs() {
        aboutUs.click();
        return new AboutUsPage(driver);
    }

    public ServicesPage clickOnServices() {
        services.click();
        return new ServicesPage(driver);
    }

    public GuestDropdownComponent clickOnGuestDropdown() {
        guestDropdown.click();
        return new GuestDropdownComponent(driver);
    }

    public OwnerDropdownComponent clickOnUserLoginDropdown() {
        for (int i = 0; i < 3; i++) {
            guestDropdown = new DropDownElement(new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(HeaderLocators.GUEST_DROPDOWN.getPath())));
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
        clickOnGuestDropdown().clickOnLoginButton().fillLoginFields(email, password);
        sleep(3000);
        return new HeaderPage(driver);
    }

    public OwnerDropdownComponent clickOnOwnerDropdown() {
        DropDownElement ownerDropdown = new DropDownElement(driver, HeaderLocators.OWNER_DROPDOWN);
        ownerDropdown.click();
        return new OwnerDropdownComponent(driver);
    }
}
