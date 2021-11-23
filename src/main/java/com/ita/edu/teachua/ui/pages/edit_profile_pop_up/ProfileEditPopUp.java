package com.ita.edu.teachua.ui.pages.edit_profile_pop_up;

import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.elements.LabelElement;
import com.ita.edu.teachua.ui.locators.pageslocators.ProfileEditPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProfileEditPopUp extends BasePage {
    public ProfileEditPopUp(WebDriver driver) {
        super(driver);
    }
    public ProfileEditPopUp fillPhone(String phoneNumber){
        InputElement phone=new InputElement(driver, ProfileEditPopUpLocators.PHONE_EDIT);
        phone.clear();
        phone.sendKeys(phoneNumber);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
    public String getMessage(){
        return new LabelElement(driver,ProfileEditPopUpLocators.MESSAGE_INVALID_INPUT).getText();
    }
}
