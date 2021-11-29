package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
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
        sleep(2000);
        return this;
    }
    public ProfileEditPopUpComponent fillFirstName(String firstNameFill){
        InputElement firstName = new InputElement(driver, ProfileEditPopUpLocators.FIRSTNAME_EDIT);
        firstName.clear();
        firstName.sendKeys(firstNameFill);
        return this;
    }
    public ProfileEditPopUpComponent fillLastName(String lastNameFill){
        InputElement lastName = new InputElement(driver, ProfileEditPopUpLocators.LASTNAME_EDIT);
        lastName.clear();
        lastName.sendKeys(lastNameFill);
        sleep(2000);
        return this;
    }
    public boolean getSaveButtonValue(){
        ButtonElement saveButton=new ButtonElement(driver,ProfileEditPopUpLocators.SAVE_BUTTON);
        return saveButton.isActive();
    }
    public ProfileEditPopUpComponent clickSubmit(){
        ButtonElement saveButton=new ButtonElement(driver,ProfileEditPopUpLocators.SAVE_BUTTON);
        saveButton.click();
        return this;
    }
    public String getAttributeSubmitButtonIsClickable(){
        ButtonElement saveButton=new ButtonElement(driver,ProfileEditPopUpLocators.SAVE_BUTTON);
        return saveButton.getAttribute();
    }
    public String getMessage() {
        return new LabelElement(driver, ProfileEditPopUpLocators.MESSAGE_INVALID_INPUT).getText();
    }
}
