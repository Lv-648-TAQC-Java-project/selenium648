package com.ita.edu.teachua.ui.pages.login_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.RestoringPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class RestoringPopUp extends BasePage {
    private InputElement editEmail;
    private ButtonElement restore;

    public RestoringPopUp(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        editEmail = new InputElement(driver, RestoringPopUpLocators.EDIT_EMAIL_FIELD);
        restore = new ButtonElement(driver, RestoringPopUpLocators.RESTORE);
    }

    public RestoringPopUp inputEmail(String email) {
        editEmail.click();
        editEmail.sendKeys(email);
        return this;
    }

    public RestoringPasswordPopUp clickOnRestore() {
        restore.click();
        return new RestoringPasswordPopUp(driver);
    }
}