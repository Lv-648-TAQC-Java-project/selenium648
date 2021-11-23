package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.OwnerDropdownLocators;
import com.ita.edu.teachua.ui.pages.add_center_pop_up.AddCenterPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.profile_page.ProfilePage;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OwnerDropdownComponent extends BasePage {
    private ButtonElement addCenter;
    private ButtonElement myProfile;

    public OwnerDropdownComponent(WebDriver driver) {
        super(driver);

    }

    public AddCenterPopUp clickOnAddCenter() {
        addCenter = new ButtonElement(driver, OwnerDropdownLocators.ADD_CENTER_BUTTON);
        addCenter.click();
        return new AddCenterPopUp(driver);
    }

    public ProfilePage clickOnProfile() {
        myProfile = new ButtonElement(driver, OwnerDropdownLocators.MY_PROFILE_BUTTON);
        myProfile.click();
        return new ProfilePage(driver);
    }

    public ProfilePage clickMyProfile() {
        // ButtonElement myProfile=new ButtonElement(driver, OwnerDropdownLocators.MY_PROFILE);
        for (int i = 0; i < 3; i++) {
            ButtonElement myProfile = new ButtonElement(new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(OwnerDropdownLocators.MY_PROFILE_BUTTON.getPath())));
            try {
                myProfile.click();
                break;
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
        }
        return new ProfilePage(driver);
    }
}
