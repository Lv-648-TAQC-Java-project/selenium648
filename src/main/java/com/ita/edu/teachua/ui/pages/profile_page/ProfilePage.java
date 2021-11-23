package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.LoginPopUpLocators;
import com.ita.edu.teachua.ui.locators.pageslocators.ProfilePageLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage {
    private ButtonElement add;

    public ProfilePage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        add = new ButtonElement(driver, ProfilePageLocators.ADD_BUTTON);
    }

    public AddDropdownComponent clickOnAddButton() {
        add.click();
        return new AddDropdownComponent(driver);
    }
}
