package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.RegisterPopUpComponentLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class RegisterPopUpComponent extends BasePage {

    private InputElement firstName;
    private InputElement lastName;
    private InputElement phoneNumber;
    private InputElement email;
    private InputElement password;
    private InputElement passwordConfirm;
    private ButtonElement registerButton;
    private ButtonElement closeButton;

    public RegisterPopUpComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        phoneNumber = new InputElement(driver, RegisterPopUpComponentLocators.PHONE_NUMBER_FIELD);
        firstName = new InputElement(driver, RegisterPopUpComponentLocators.FIRST_NAME_FIELD);
        lastName = new InputElement(driver, RegisterPopUpComponentLocators.LAST_NAME_FIELD);
        email = new InputElement(driver, RegisterPopUpComponentLocators.EMAIL_FIELD);
        password = new InputElement(driver, RegisterPopUpComponentLocators.PASSWORD_FIELD);
        passwordConfirm = new InputElement(driver, RegisterPopUpComponentLocators.PASSWORD_CONFIRM_FIELD);
        registerButton = new ButtonElement(driver, RegisterPopUpComponentLocators.REGISTER_BUTTON);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public RegisterPopUpComponent clickFirstNameField() {
        firstName.click();
        return this;
    }

    public RegisterPopUpComponent fillFirstName(String firstNameFill) {
        firstName.sendKeys(firstNameFill);
        return this;
    }

    public RegisterPopUpComponent clickLastNameField() {
        lastName.click();
        return this;
    }

    public InputElement getLastNameField() {
        return lastName;
    }

    public InputElement getFirstNameField() {
        return firstName;
    }

    public InputElement getEmailField() {
        return email;
    }

    public InputElement getPasswordField() {
        return password;
    }

    public InputElement getPhoneNumber() {
        return phoneNumber;
    }

    public InputElement getPasswordConfirmField() {
        sleep(400);
        return passwordConfirm;
    }

    public RegisterPopUpComponent fillLastName(String lastNameFill) {
        lastName.sendKeys(lastNameFill);
        return this;
    }

    public RegisterPopUpComponent clickEmailField() {
        email.click();
        return this;
    }

    public RegisterPopUpComponent fillEmail(String emailFill) {
        email.sendKeys(emailFill);
        return this;
    }

    public RegisterPopUpComponent clickPhoneNumberField() {
        phoneNumber.click();
        return this;
    }

    public RegisterPopUpComponent fillPhoneNumber(String phoneNumberFill) {
        phoneNumber.sendKeys(phoneNumberFill);
        return this;
    }

    public RegisterPopUpComponent clickPasswordField() {
        password.click();
        return this;
    }

    public RegisterPopUpComponent fillPassword(String passwordFill) {
        password.sendKeys(passwordFill);
        return this;
    }

    public RegisterPopUpComponent clickPasswordConfirmField() {
        passwordConfirm.click();
        return this;
    }

    public RegisterPopUpComponent fillPasswordConfirm(String passwordConfirmFill) {
        passwordConfirm.sendKeys(passwordConfirmFill);
        return this;
    }

    public RegisterPopUpComponent clearFirstNameField() {
        firstName.clear();
        return this;
    }

    public RegisterPopUpComponent clearEmailField() {
        email.clear();
        return this;
    }

    public RegisterPopUpComponent clearPasswordField() {
        password.clear();
        return this;
    }

    public RegisterPopUpComponent clearPasswordConfirmField() {
        passwordConfirm.clear();
        return this;
    }

    public HeaderPage clickCloseButton() {
        closeButton = new ButtonElement(driver, RegisterPopUpComponentLocators.CLOSE_BUTTON);
        closeButton.click();
        return new HeaderPage(driver);
    }

    public RegisterPopUpComponent clearLastNameField() {
        lastName.clear();
        return this;
    }

    public String getLastNameText() {
        return lastName.getValue();
    }

    public String getFirstNameText() {
        return firstName.getValue();
    }

    public String getEmailText() {
        return email.getValue();
    }

    public String getPasswordText() {
        return password.getValue();
    }

    public String getPhoneNumberText() {
        return phoneNumber.getValue();
    }

    public RegisterPopUpComponent sendKeysFirstNameField() {
        firstName.sendKeys("Vitalii");// TODO
        return this;
    }

    public RegisterPopUpComponent sendKeysLastNameField() {
        lastName.sendKeys("Pidstavskyi");// TODO
        return this;
    }

    public RegisterPopUpComponent sendKeysEmailField() {
        email.sendKeys("vitalii@gmail.com");// TODO
        return this;
    }

    public RegisterPopUpComponent sendKeysPhoneNumberField() {
        phoneNumber = new InputElement(driver, RegisterPopUpComponentLocators.PHONE_NUMBER_FIELD);
        phoneNumber.sendKeys("662745332");// TODO
        return this;
    }

    public RegisterPopUpComponent sendKeysPasswordField() {
        password.sendKeys("12345678qQ!");// TODO
        return this;
    }

    public RegisterPopUpComponent sendKeysPasswordConfirmField() {
        passwordConfirm.sendKeys("12345678qQ!");// TODO
        return this;
    }

    public RegisterPopUpComponent completeFirstNameField() {
        clickFirstNameField();
        sendKeysFirstNameField();
        return this;
    }

    public RegisterPopUpComponent completeLastNameField() {
        clickLastNameField();
        sendKeysLastNameField();
        return this;
    }

    public RegisterPopUpComponent completePhoneNumberField() {
        clickPhoneNumberField();
        sendKeysPhoneNumberField();
        return this;
    }

    public RegisterPopUpComponent completeEmailField() {
        clickEmailField();
        sendKeysEmailField();
        return this;
    }

    public RegisterPopUpComponent completePasswordField() {
        clickPasswordField();
        sendKeysPasswordField();
        return this;
    }

    public RegisterPopUpComponent completePasswordConfirmField() {
        clickPasswordConfirmField();
        sendKeysPasswordConfirmField();
        return this;
    }

}
