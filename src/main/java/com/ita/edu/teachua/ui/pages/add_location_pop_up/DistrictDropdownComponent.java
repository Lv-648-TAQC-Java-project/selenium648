package com.ita.edu.teachua.ui.pages.add_location_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.CityDropdownLocators;
import com.ita.edu.teachua.ui.locators.componentslocators.DistrictDropdownLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class DistrictDropdownComponent extends BasePage {

    private ButtonElement desnianskyiButton;

    public DistrictDropdownComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        desnianskyiButton = new ButtonElement(driver, DistrictDropdownLocators.DESNIANSKYI_BUTTON);
    }

    public AddLocationPopUp clickOnDesnianskyiButton() {
        desnianskyiButton.click();
        return new AddLocationPopUp(driver);
    }
}