package com.ita.edu.teachua.ui.components;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.componentslocators.GuestDropdownLocators;
import com.ita.edu.teachua.ui.pages.BasePage;
import com.ita.edu.teachua.ui.pages.RegisterPopUp;
import org.openqa.selenium.WebDriver;

public class GuestDropdownComponent extends BasePage {

    private ButtonElement registerButton;

    public GuestDropdownComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        registerButton = new ButtonElement(driver, GuestDropdownLocators.REGISTER_BUTTON);
    }

    public RegisterPopUp clickRegisterButton() {
        registerButton.click();
        return new RegisterPopUp(driver);
    }

}
