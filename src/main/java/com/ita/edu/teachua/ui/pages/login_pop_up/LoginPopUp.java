package com.ita.edu.teachua.ui.pages.login_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.LoginPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.header.Header;
import org.openqa.selenium.WebDriver;

public class LoginPopUp extends BasePage {

    private InputElement email;
    private InputElement password;
    private ButtonElement logInButton;

    public LoginPopUp(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        email = new InputElement(driver, LoginPopUpLocators.EMAIL_FIELD);
        password = new InputElement(driver, LoginPopUpLocators.PASSWORD_FIELD);
        logInButton = new ButtonElement(driver, LoginPopUpLocators.LOG_IN_BUTTON);
    }

    public void clickRegisterButton() {
        logInButton.click();
    }

    public LoginPopUp clickEmailField() {
        email.click();
        return this;
    }

    public LoginPopUp clickPasswordField() {
        password.click();
        return this;
    }

    public LoginPopUp sendKeysEmailField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    public LoginPopUp sendKeysPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    public Header clickLogInButton() {
        logInButton.click();
        return new Header(driver);
    }
}
