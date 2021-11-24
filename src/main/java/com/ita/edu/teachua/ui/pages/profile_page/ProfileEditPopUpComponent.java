package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.elements.LabelElement;
import com.ita.edu.teachua.ui.locators.pageslocators.profilelocators.ProfileEditPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class ProfileEditPopUpComponent extends BasePage {
    public ProfileEditPopUpComponent(WebDriver driver) {
        super(driver);
    }

    public ProfileEditPopUpComponent fillPhone(String phoneNumber) {
        InputElement phone = new InputElement(driver, ProfileEditPopUpLocators.PHONE_EDIT);
        phone.clear();
        phone.sendKeys(phoneNumber);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public String getMessage() {
        return new LabelElement(driver, ProfileEditPopUpLocators.MESSAGE_INVALID_INPUT).getText();
    }
}
