package com.ita.edu.teachua.ui.pages.add_center_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.AddCenterPopUpLocators;
import com.ita.edu.teachua.ui.pages.add_location_pop_up.AddLocationPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class AddCenterPopUp extends BasePage {

    private InputElement nameField;
    private ButtonElement addLocation;

    public AddCenterPopUp(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        nameField = new InputElement(driver, AddCenterPopUpLocators.NAME_FIELD);
        addLocation = new ButtonElement(driver, AddCenterPopUpLocators.ADD_LOCATION_BUTTON);
    }

    public AddCenterPopUp clickOnNameField() {
        nameField.click();
        return new AddCenterPopUp(driver);
    }

    public AddCenterPopUp sendKeysNameField(String name) {
        nameField.sendKeys(name);
        return new AddCenterPopUp(driver);
    }

    public AddLocationPopUp clickOnAddLocation() {
        addLocation.click();
        return new AddLocationPopUp(driver);
    }
}
