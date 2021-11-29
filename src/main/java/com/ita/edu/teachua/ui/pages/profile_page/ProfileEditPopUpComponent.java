package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.CheckBoxElement;
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

    public ProfileEditPopUpComponent clickOnChangePasswordCheckBox(){
        CheckBoxElement changePassword = new CheckBoxElement(driver, ProfileEditPopUpLocators.PASSWORD_EDIT_CHECKBOX);
        changePassword.click();
        return this;
    }

    public ProfileEditPopUpComponent clickOnSaveChangeButton(){
        ButtonElement saveChangeButton = new ButtonElement(driver, ProfileEditPopUpLocators.SAVE_CHANGE_BUTTON);
        saveChangeButton.click();
        return this;
    }
    public String getErrorMessageCurrentPasswordInput(){
        return new LabelElement(driver, ProfileEditPopUpLocators.CURRENT_PASSWORD_ERROR_MESSAGE).getText();
    }

    public String getErrorMessageNewPasswordInput(){
        return new LabelElement(driver, ProfileEditPopUpLocators.NEW_PASSWORD_ERROR_MESSAGE).getText();
    }

    public String getErrorMessageConfirmPasswordInput(){
        return new LabelElement(driver, ProfileEditPopUpLocators.CONFIRM_PASSWORD_ERROR_MESSAGE).getText();
    }

    public String getCurrentPasswordInputBorderColor(){
        return new InputElement(driver, ProfileEditPopUpLocators.CURRENT_PASSWORD_INPUT).getCSSValue("border-color");
    }

    public String getNewPasswordInputBorderColor(){
        return new InputElement(driver, ProfileEditPopUpLocators.NEW_PASSWORD_INPUT).getCSSValue("border-color");
    }

    public String getConfirmPasswordInputBorderColor(){
        return new InputElement(driver, ProfileEditPopUpLocators.CONFIRM_PASSWORD_INPUT).getCSSValue("border-color");
    }

        public ProfileEditPopUpComponent fillInCurrentPasswordInput(String currentPassword){
        InputElement currentPasswordInput = new InputElement(driver, ProfileEditPopUpLocators.CURRENT_PASSWORD_INPUT);
        currentPasswordInput.clear();
        currentPasswordInput.sendKeys(currentPassword);
        return this;
    }

    public ProfileEditPopUpComponent fillInNewPasswordInput(String newPassword){
        InputElement newPasswordInput = new InputElement(driver, ProfileEditPopUpLocators.NEW_PASSWORD_INPUT);
        newPasswordInput.clear();
        newPasswordInput.sendKeys(newPassword);
        return this;
    }

    public ProfileEditPopUpComponent fillInConfirmPasswordInput(String confirmPassword){
        InputElement confirmPasswordInput = new InputElement(driver, ProfileEditPopUpLocators.CONFIRM_PASSWORD_INPUT);
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(confirmPassword);
        return this;
    }



}
