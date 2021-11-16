package com.ita.edu.teachua.ui.pages.header;

import org.openqa.selenium.WebDriver;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.OwnerDropdownLocators;
import com.ita.edu.teachua.ui.pages.add_center_pop_up.AddCenterPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;

public class OwnerDropdownComponent extends BasePage {
    private ButtonElement addCenter;
    public OwnerDropdownComponent(WebDriver driver) {
	super(driver);
	
    }
    public AddCenterPopUp clickOnAddCenter() {
	addCenter = new ButtonElement(driver,OwnerDropdownLocators.ADD_CENTER_BUTTON);
	addCenter.click();
	return new AddCenterPopUp(driver);
    }
}
