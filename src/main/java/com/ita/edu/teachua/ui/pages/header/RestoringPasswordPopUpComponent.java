package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.RestoringPasswordPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.Date;

public class RestoringPasswordPopUpComponent extends BasePage {
    private InputElement enterPassword;
    private InputElement reEnterPassword;
    private ButtonElement changePasswordButton;

    public RestoringPasswordPopUpComponent(WebDriver driver) { // TODO
        super(driver);
        /*initElements();*/
    }

    /*private void initElements() {
        enterPassword = new InputElement(driver, );
        reEnterPassword = new InputElement(driver, );
    }*/
    public void setNewRandomPassword(){
        String newRandomPassword = String.format("Test_%d",new Date().getTime());
        enterPassword = new InputElement(driver, RestoringPasswordPopUpLocators.PASSWORD_FIELD);
        enterPassword.clear();
        enterPassword.sendKeys(newRandomPassword);
        reEnterPassword = new InputElement(driver, RestoringPasswordPopUpLocators.PASSWORD_CONFIRM_FIELD);
        reEnterPassword.clear();
        reEnterPassword.sendKeys(newRandomPassword);
        changePasswordButton = new ButtonElement(driver,RestoringPasswordPopUpLocators.CHANGE_PASSWORD_BUTTON);
        changePasswordButton.click();
    }
}