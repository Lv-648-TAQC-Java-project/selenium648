package com.ita.edu.teachua.ui.pages.header;

import org.openqa.selenium.WebDriver;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.OwnerDropdownLocators;
import com.ita.edu.teachua.ui.pages.add_center_pop_up.AddCenterPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.profile_page.ProfilePage;

public class OwnerDropdownComponent extends BasePage {
    private ButtonElement addCenter;
    private ButtonElement myProfile;
    public OwnerDropdownComponent(WebDriver driver) {
	super(driver);
	
    }
    public AddCenterPopUp clickOnAddCenter() {
	addCenter = new ButtonElement(driver,OwnerDropdownLocators.ADD_CENTER_BUTTON);
	addCenter.click();
	return new AddCenterPopUp(driver);
    }
    public ProfilePage clickOnProfile() {
	myProfile = new ButtonElement(driver,OwnerDropdownLocators.MY_PROFILE_BUTTON);
	myProfile.click();
	return new ProfilePage(driver);
    }
}
