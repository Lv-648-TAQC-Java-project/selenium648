package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.OwnerDropdownLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.profile_page.AddCenterPopUpComponent;
import com.ita.edu.teachua.ui.pages.profile_page.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OwnerDropdownComponent extends BasePage {

    private ButtonElement addCenterButton;
    private ButtonElement profileButton;

    public OwnerDropdownComponent(WebDriver driver) {
        super(driver);
    }

    public AddCenterPopUpComponent clickOnAddCenterButton() {
        addCenterButton = new ButtonElement(driver, OwnerDropdownLocators.ADD_CENTER_BUTTON);
        addCenterButton.click();
        return new AddCenterPopUpComponent(driver);
    }

    public ProfilePage clickOnProfile() {
        profileButton = new ButtonElement(new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(OwnerDropdownLocators.MY_PROFILE_BUTTON.getPath())));
        profileButton.click();
        return new ProfilePage(driver);
    }

}
