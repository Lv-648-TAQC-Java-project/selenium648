package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.OwnerDropdownLocators;
import com.ita.edu.teachua.ui.pages.add_center_pop_up.AddCenterPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
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
        profileButton = new ButtonElement(driver, OwnerDropdownLocators.MY_PROFILE_BUTTON);
    }

    public AddCenterPopUp clickOnAddCenterButton() {
        addCenterButton.click();
        return new AddCenterPopUp(driver);
    }

    public ProfilePage clickOnProfile() {
        profileButton.click();
        return new ProfilePage(driver);
    }

}
