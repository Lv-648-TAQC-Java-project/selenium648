package com.ita.edu.teachua.ui.pages.login_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.pageslocators.LoginPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.header.HeaderPage;
import org.openqa.selenium.WebDriver;

public class LoginPopUp extends BasePage {

    private InputElement email;
    private InputElement password;
    private ButtonElement logInButton;
    private LinkElement forgotPassword;

    private InputElement emailField;
    private InputElement passwordField;
    private ButtonElement submitButton;

    public LoginPopUp(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        logInButton = new ButtonElement(driver, LoginPopUpLocators.LOG_IN_BUTTON);
        forgotPassword = new LinkElement(driver, LoginPopUpLocators.FORGOT_PASSWORD);
        emailField = new InputElement(driver, LoginPopUpLocators.EMAIL_FIELD);
        passwordField = new InputElement(driver, LoginPopUpLocators.PASSWORD_FIELD);
        submitButton = new ButtonElement(driver, LoginPopUpLocators.SUBMIT_BUTTON);
    }

    public void clickRegisterButton() {
        logInButton.click();
    }

    public LoginPopUp clickEmailField() {
        emailField.click();
        return this;
    }

    public LoginPopUp clickPasswordField() {
        passwordField.click();
        return this;
    }

    public LoginPopUp sendKeysEmailField(String emailValue) {
        emailField.sendKeys(emailValue);
        return this;
    }

    public LoginPopUp sendKeysPasswordField(String passwordValue) {
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

    public LoginPopUp inputData(String emailData, String passwordData) {
        InputElement email = new InputElement(driver, LoginPopUpLocators.EMAIL_FIELD);
        email.sendKeys(emailData);
        InputElement password = new InputElement(driver, LoginPopUpLocators.PASSWORD_FIELD);
        password.sendKeys(passwordData);
        return this;
    }

    public HeaderPage clickSubmitButton() {
        LinkElement loginButton = new LinkElement(driver, LoginPopUpLocators.SUBMIT_BUTTON);
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
