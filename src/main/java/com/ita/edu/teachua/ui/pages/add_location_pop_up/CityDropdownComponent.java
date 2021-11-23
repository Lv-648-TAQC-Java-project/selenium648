package com.ita.edu.teachua.ui.pages.add_location_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.CityDropdownLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class CityDropdownComponent extends BasePage {

    private ButtonElement kyivButton;

    public CityDropdownComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        kyivButton = new ButtonElement(driver, CityDropdownLocators.KYIV_BUTTON);
    }

    public AddLocationPopUp clickOnKyivButton() {
        kyivButton.click();
        return new AddLocationPopUp(driver);
    }
}