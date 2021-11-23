package com.ita.edu.teachua.ui.pages.add_location_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.LocalityDropdownLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class LocalityDropdownComponent extends BasePage {

    private ButtonElement akademmistechkoButton;

    public LocalityDropdownComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        akademmistechkoButton = new ButtonElement(driver, LocalityDropdownLocators.AKADEMMISTECHKO_BUTTON);
    }

    public AddLocationPopUp clickOnAkademmistechkoButton() {
        akademmistechkoButton.click();
        return new AddLocationPopUp(driver);
    }
}