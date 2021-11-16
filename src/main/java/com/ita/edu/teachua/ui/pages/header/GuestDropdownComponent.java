package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.GuestDropdownLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.login_pop_up.LoginPopUp;
import com.ita.edu.teachua.ui.pages.register_pop_up.RegisterPopUp;
import org.openqa.selenium.WebDriver;

public class GuestDropdownComponent extends BasePage {

    private ButtonElement registerButton;
    private ButtonElement logInButton;

    public GuestDropdownComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        registerButton = new ButtonElement(driver, GuestDropdownLocators.REGISTER_BUTTON);
        logInButton = new ButtonElement(driver, GuestDropdownLocators.LOG_IN_BUTTON);
    }

    public RegisterPopUp clickRegisterButton() {
        registerButton.click();
        return new RegisterPopUp(driver);
    }

    public LoginPopUp clickLogInButton() {
        logInButton.click();
        return new LoginPopUp(driver);
    }

}
