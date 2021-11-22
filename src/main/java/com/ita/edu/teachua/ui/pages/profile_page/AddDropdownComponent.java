package com.ita.edu.teachua.ui.pages.profile_page;

import org.openqa.selenium.WebDriver;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.pages.add_center_pop_up.AddCenterPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;

public class AddDropdownComponent extends BasePage {
    
    private ButtonElement addCenter;
    public AddDropdownComponent(WebDriver driver) {
	super(driver);
	initElements();
    }
    public void initElements() {
	addCenter = new ButtonElement(driver,AddDropDownComponentLocators.ADD_CENTER_BUTTON);
    }
    
    public AddCenterPopUp clickOnAddCenter() {
	waitVisibilityOfElementLocated(AddDropDownComponentLocators.ADD_CENTER_BUTTON,10).click();
	//addCenter.click();
	return new AddCenterPopUp(driver);
    }
}
