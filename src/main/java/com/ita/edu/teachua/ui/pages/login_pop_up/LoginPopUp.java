package com.ita.edu.teachua.ui.pages.login_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.LoginPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.header.HeaderPage;

import org.openqa.selenium.WebDriver;

public class LoginPopUp extends BasePage {
    private InputElement emailField; 
    private InputElement passwordField; 
    private ButtonElement submitButton;
    public LoginPopUp(WebDriver driver) {
        super(driver);
        initElements();
    }
    private void initElements() {
	emailField = new InputElement(driver,LoginPopUpLocators.EMAIL_FIELD);
	passwordField = new InputElement(driver,LoginPopUpLocators.PASSWORD_FIELD);
	submitButton = new ButtonElement(driver,LoginPopUpLocators.SUBMIT_BUTTON);
    }
    public HeaderPage FillLoginFields(String[] adminCredentials) {
	emailField.clear();
	emailField.sendKeys(adminCredentials[0]);
	passwordField.clear();
	passwordField.sendKeys(adminCredentials[1]);
	submitButton.click();
	return new HeaderPage(driver);
    }
}
