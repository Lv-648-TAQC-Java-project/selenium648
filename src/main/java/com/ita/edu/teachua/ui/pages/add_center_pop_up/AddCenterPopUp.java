package com.ita.edu.teachua.ui.pages.add_center_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.pageslocators.AddCenterPopUpLocators;
import com.ita.edu.teachua.ui.pages.add_location_pop_up.AddLocationPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class AddCenterPopUp extends BasePage {
    private ButtonElement addLocation;
    public AddCenterPopUp(WebDriver driver) {
        super(driver);
    }
    
    public AddLocationPopUp clickOnAddLocation() {
	addLocation = new ButtonElement(driver,AddCenterPopUpLocators.ADD_LOCATION_BUTTON);
	addLocation.click();
	return new AddLocationPopUp(driver);
    }
}
