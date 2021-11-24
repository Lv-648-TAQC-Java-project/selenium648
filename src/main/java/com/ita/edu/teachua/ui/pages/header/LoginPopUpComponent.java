package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.LoginPopUpComponentLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPopUpComponent extends BasePage {

    private InputElement email;
    private InputElement password;
    private ButtonElement logInButton;
    private LinkElement forgotPassword;

    private InputElement emailField;
    private InputElement passwordField;
    private ButtonElement submitButton;

    public LoginPopUpComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        logInButton = new ButtonElement(driver, LoginPopUpComponentLocators.LOG_IN_BUTTON);
        forgotPassword = new LinkElement(driver, LoginPopUpComponentLocators.FORGOT_PASSWORD);
        emailField = new InputElement(driver, LoginPopUpComponentLocators.EMAIL_FIELD);
        passwordField = new InputElement(driver, LoginPopUpComponentLocators.PASSWORD_FIELD);
        submitButton = new ButtonElement(driver, LoginPopUpComponentLocators.SUBMIT_BUTTON);
    }

    public void clickRegisterButton() {
        logInButton.click();
    }

    public LoginPopUpComponent clickEmailField() {
        emailField.click();
        return this;
    }

    public LoginPopUpComponent clickPasswordField() {
        passwordField.click();
        return this;
    }

    public LoginPopUpComponent sendKeysEmailField(String emailValue) {
        emailField.sendKeys(emailValue);
        return this;
    }

    public LoginPopUpComponent sendKeysPasswordField(String passwordValue) {
        passwordField.sendKeys(passwordValue);
        return this;
    }

    public HeaderPage clickLogInButton() {
        logInButton.click();
        return new HeaderPage(driver);
    }

    public HeaderPage FillLoginFields(String email, String password) {
        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);
        submitButton.click();
        return new HeaderPage(driver);
    }

    public LoginPopUpComponent inputData(String emailData, String passwordData) {
        InputElement email = new InputElement(driver, LoginPopUpComponentLocators.EMAIL_FIELD);
        email.sendKeys(emailData);
        InputElement password = new InputElement(driver, LoginPopUpComponentLocators.PASSWORD_FIELD);
        password.sendKeys(passwordData);
        return this;
    }

    public HeaderPage clickSubmitButton() {
        LinkElement loginButton = new LinkElement(driver, LoginPopUpComponentLocators.SUBMIT_BUTTON);
        loginButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Вийти']")));
        return new HeaderPage(driver);
    }
}
