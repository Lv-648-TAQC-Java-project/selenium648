package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.OwnerDropdownLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.profile_page.AddCenterPopUpComponent;
import com.ita.edu.teachua.ui.pages.profile_page.ProfilePage;
import org.openqa.selenium.WebDriver;

public class OwnerDropdownComponent extends BasePage {

    private ButtonElement addCenterButton;
    private ButtonElement profileButton;

    public OwnerDropdownComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        addCenterButton = new ButtonElement(driver, OwnerDropdownLocators.ADD_CENTER_BUTTON);
//        profileButton = new ButtonElement(driver, OwnerDropdownLocators.MY_PROFILE_BUTTON);
    }

    public AddCenterPopUpComponent clickOnAddCenterButton() {
        addCenterButton.click();
        return new AddCenterPopUpComponent(driver);
    }

    public ProfilePage clickOnProfile() {
        profileButton = new ButtonElement(waitElementToBeClickable(OwnerDropdownLocators.MY_PROFILE_BUTTON, 5));
        profileButton.click();
        return new ProfilePage(driver);
    }

}
