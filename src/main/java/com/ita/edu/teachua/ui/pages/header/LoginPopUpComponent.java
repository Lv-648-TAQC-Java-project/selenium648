package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.LoginPopUpComponentLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPopUpComponent extends BasePage {
    private ButtonElement logInButton;
    private LinkElement forgotPasswordButton;
    private LinkElement loginSubmitButton;

    private InputElement emailField;
    private InputElement passwordField;
    private ButtonElement submitButton;



    public LoginPopUpComponent(WebDriver driver) {
        super(driver);
        //initElements();
    }

   /* private void initElements() {
        logInButton = new ButtonElement(driver, LoginPopUpComponentLocators.LOG_IN_BUTTON);
        forgotPassword = new LinkElement(driver, LoginPopUpComponentLocators.FORGOT_PASSWORD);
        emailField = new InputElement(driver, LoginPopUpComponentLocators.EMAIL_FIELD);
        passwordField = new InputElement(driver, LoginPopUpComponentLocators.PASSWORD_FIELD);
        submitButton = new ButtonElement(driver, LoginPopUpComponentLocators.SUBMIT_BUTTON);
    }*/

    public void clickRegisterButton() {
        logInButton.click();
    }

    public LoginPopUpComponent sendKeysEmailField(String emailValue) {
        emailField = new InputElement(driver, LoginPopUpComponentLocators.EMAIL_FIELD);
        emailField.clear();
        emailField.sendKeys(emailValue);
        return this;
    }

    public LoginPopUpComponent sendKeysPasswordField(String passwordValue) {
        passwordField = new InputElement(driver, LoginPopUpComponentLocators.PASSWORD_FIELD);
        passwordField.clear();
        passwordField.sendKeys(passwordValue);
        return this;
    }

    public HeaderPage clickLogInButton() {
        logInButton = new ButtonElement(driver, LoginPopUpComponentLocators.LOG_IN_BUTTON);
        logInButton.click();
        return new HeaderPage(driver);
    }

    public HeaderPage fillLoginFields(String email, String password) {
        sendKeysEmailField(email);
        sendKeysPasswordField(password);
        clickSubmitButton();
        return new HeaderPage(driver);
    }

    public LoginPopUpComponent inputData(String emailData, String passwordData) {
        emailField = new InputElement(driver, LoginPopUpComponentLocators.EMAIL_FIELD);
        emailField.sendKeys(emailData);
        passwordField = new InputElement(driver, LoginPopUpComponentLocators.PASSWORD_FIELD);
        passwordField.sendKeys(passwordData);
        return this;
    }

    public HeaderPage clickSubmitButton() {
        loginSubmitButton = new LinkElement(driver, LoginPopUpComponentLocators.SUBMIT_BUTTON);
        loginSubmitButton.click();
        sleep(2000);
        //  new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Вийти']")));
        return new HeaderPage(driver);
    }

    public RestoringPopUpComponent clickOnForgotPasswordButton(){
        forgotPasswordButton = new LinkElement(driver,LoginPopUpComponentLocators.FORGOT_PASSWORD);
        forgotPasswordButton.click();
        return new RestoringPopUpComponent(driver);
    }
}
