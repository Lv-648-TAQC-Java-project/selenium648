package com.ita.edu.teachua.ui.pages;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.RegisterPopUpLocators;
import org.openqa.selenium.WebDriver;

public class RegisterPopUp extends BasePage {

    private InputElement firstName;
    private InputElement lastName;
    private InputElement phoneNumber;
    private InputElement email;
    private InputElement password;
    private InputElement passwordConfirm;
    private ButtonElement registerButton;

    public RegisterPopUp(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        firstName = new InputElement(driver, RegisterPopUpLocators.FIRST_NAME_FIELD);
        lastName = new InputElement(driver, RegisterPopUpLocators.LAST_NAME_FIELD);
        phoneNumber = new InputElement(driver, RegisterPopUpLocators.PHONE_NUMBER_FIELD);
        email = new InputElement(driver, RegisterPopUpLocators.EMAIL_FIELD);
        password = new InputElement(driver, RegisterPopUpLocators.PASSWORD_FIELD);
        passwordConfirm = new InputElement(driver, RegisterPopUpLocators.PASSWORD_CONFIRM_FIELD);
        registerButton = new ButtonElement(driver, RegisterPopUpLocators.REGISTER_BUTTON);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }


    public RegisterPopUp clickFirstNameField() {
        firstName.click();
        return this;
    }

    public RegisterPopUp clickLastNameField() {
        lastName.click();
        return this;
    }

    public RegisterPopUp clickEmailField() {
        email.click();
        return this;
    }

    public RegisterPopUp clickPhoneNumberField() {
        phoneNumber.click();
        return this;
    }

    public RegisterPopUp clickPasswordField() {
        password.click();
        return this;
    }

    public RegisterPopUp clickPasswordConfirmField() {
        passwordConfirm.click();
        return this;
    }

    public RegisterPopUp clearFirstNameField() {
        firstName.clear();
        return this;
    }

    public RegisterPopUp clearLastNameField() {
        lastName.clear();
        return this;
    }

    public RegisterPopUp sendKeysFirstNameField() {
        firstName.sendKeys("Vitalii");
        return this;
    }

    public RegisterPopUp sendKeysLastNameField() {
        lastName.sendKeys("Pidstavskyi");
        return this;
    }

    public RegisterPopUp sendKeysEmailField() {
        email.sendKeys("vitalii@gmail.com");
        return this;
    }

    public RegisterPopUp sendKeysPhoneNumberField() {
        phoneNumber.sendKeys("662745332");
        return this;
    }

    public RegisterPopUp sendKeysPasswordField() {
        password.sendKeys("12345678qQ!");
        return this;
    }

    public RegisterPopUp sendKeysPasswordConfirmField() {
        passwordConfirm.sendKeys("12345678qQ!");
        return this;
    }

    public RegisterPopUp completeFirstNameField() {
        clickFirstNameField();
        sendKeysFirstNameField();
        return this;
    }

    public RegisterPopUp completeLastNameField() {
        clickLastNameField();
        sendKeysLastNameField();
        return this;
    }

    public RegisterPopUp completePhoneNumberField() {
        clickPhoneNumberField();
        sendKeysPhoneNumberField();
        return this;
    }

    public RegisterPopUp completeEmailField() {
        clickEmailField();
        sendKeysEmailField();
        return this;
    }

    public RegisterPopUp completePasswordField() {
        clickPasswordField();
        sendKeysPasswordField();
        return this;
    }

    public RegisterPopUp completePasswordConfirmField() {
        clickPasswordConfirmField();
        sendKeysPasswordConfirmField();
        return this;
    }

}
