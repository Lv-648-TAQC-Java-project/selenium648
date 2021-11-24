package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.GuestDropdownLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class GuestDropdownComponent extends BasePage {

    private ButtonElement registerButton;
    private ButtonElement loginButton;

    public GuestDropdownComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        registerButton = new ButtonElement(driver, GuestDropdownLocators.REGISTER_BUTTON);
        loginButton = new ButtonElement(driver, GuestDropdownLocators.LOGIN_BUTTON);
    }

    public RegisterPopUpComponent clickOnRegisterButton() {
        registerButton.click();
        return new RegisterPopUpComponent(driver);
    }

    public LoginPopUpComponent clickOnLoginButton() {
        loginButton.click();
        return new LoginPopUpComponent(driver);
    }

}
