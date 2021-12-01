package com.ita.edu.teachua.ui.pages.header;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.headerlocators.RestoringPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.utils.GmailContentExtractor;
import org.openqa.selenium.WebDriver;

public class RestoringPopUpComponent extends BasePage {
    private InputElement editEmail;
    private ButtonElement restore;

    public RestoringPopUpComponent(WebDriver driver) {
        super(driver);
        //initElements();
    }

    /*private void initElements() {
        editEmail = new InputElement(driver, RestoringPopUpLocators.EDIT_EMAIL_FIELD);
        restore = new ButtonElement(driver, RestoringPopUpLocators.RESTORE);
    }*/

    public RestoringPopUpComponent inputEmail(String email) {
        editEmail = new InputElement(driver, RestoringPopUpLocators.EDIT_EMAIL_FIELD);
        editEmail.clear();
        editEmail.sendKeys(email);
        return this;
    }

    public RestoringPasswordPopUpComponent clickOnRestore() {
        restore = new ButtonElement(driver, RestoringPopUpLocators.RESTORE);
        restore.click();
        sleep(5000);
        driver.get(GmailContentExtractor.getGmailMessageLink("subject:Відновлення паролю"));
        return new RestoringPasswordPopUpComponent(driver);
    }
}