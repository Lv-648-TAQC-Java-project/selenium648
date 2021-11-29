package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.AddDropdownComponentLocators;
import com.ita.edu.teachua.ui.locators.pageslocators.profilelocators.AddDropDownComponentLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class AddDropdownComponent extends BasePage {

    private ButtonElement addCenterButton;
    private ButtonElement addClubButton;

    public AddDropdownComponent(WebDriver driver) {
        super(driver);
    }

    public AddCenterPopUpComponent clickOnAddCenterButton() {
        addCenterButton = new ButtonElement(driver, AddDropdownComponentLocators.ADD_CENTER_BUTTON);
        waitElementToBeClickable(AddDropdownComponentLocators.ADD_CENTER_BUTTON,5);
        addCenterButton.click();
        return new AddCenterPopUpComponent(driver);
    }

    public AddClubPopUpComponent clickOnAddClubButton() {
        addClubButton = new ButtonElement(driver, AddDropDownComponentLocators.ADD_CLUB_BUTTON);
        waitElementToBeClickable(AddDropdownComponentLocators.ADD_CENTER_BUTTON,5);
        addClubButton.click();
        return new AddClubPopUpComponent(driver);
    }
}
