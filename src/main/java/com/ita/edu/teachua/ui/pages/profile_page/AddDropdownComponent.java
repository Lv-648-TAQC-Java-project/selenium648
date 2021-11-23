package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.AddDropdownComponentLocators;
import com.ita.edu.teachua.ui.locators.componentslocators.OwnerDropdownLocators;
import com.ita.edu.teachua.ui.locators.pageslocators.ProfilePageLocators;
import com.ita.edu.teachua.ui.pages.add_center_pop_up.AddCenterPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.profile_page.ProfilePage;
import org.openqa.selenium.WebDriver;

public class AddDropdownComponent extends BasePage {

    private ButtonElement addCenterButton;

    public AddDropdownComponent(WebDriver driver) {
        super(driver);
    }

    public AddCenterPopUp clickOnAddCenterButton() {
        addCenterButton = new ButtonElement(driver, AddDropdownComponentLocators.ADD_CENTER_BUTTON);
        addCenterButton.click();
        return new AddCenterPopUp(driver);
    }
}
