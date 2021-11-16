package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.OwnerDropdownLocators;
import com.ita.edu.teachua.ui.pages.add_center_pop_up.AddCenterPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class OwnerDropdownComponent extends BasePage {

    private ButtonElement addCenterButton;

    public OwnerDropdownComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        addCenterButton = new ButtonElement(driver, OwnerDropdownLocators.ADD_CENTER);
    }

    public AddCenterPopUp clickOnAddCenterButton() {
        addCenterButton.click();
        return new AddCenterPopUp(driver);
    }

}
