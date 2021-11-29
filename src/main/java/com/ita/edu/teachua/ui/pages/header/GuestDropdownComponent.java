package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.GuestDropdownLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GuestDropdownComponent extends BasePage {

    private ButtonElement registerButton;
    private ButtonElement loginButton;

    public GuestDropdownComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        //registerButton = new ButtonElement(driver, GuestDropdownLocators.REGISTER_BUTTON);
        //loginButton = new ButtonElement(driver, GuestDropdownLocators.LOGIN_BUTTON);
    }

    public RegisterPopUpComponent clickOnRegisterButton() {
        registerButton = new ButtonElement(driver, GuestDropdownLocators.REGISTER_BUTTON);
        registerButton.click();
        return new RegisterPopUpComponent(driver);
    }

    public LoginPopUpComponent clickOnLoginButton() {
        //loginButton = new ButtonElement(driver, GuestDropdownLocators.LOGIN_BUTTON);
        loginButton = new ButtonElement(new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(GuestDropdownLocators.LOGIN_BUTTON.getPath())));
        loginButton.click();
        return new LoginPopUpComponent(driver);
    }

}
