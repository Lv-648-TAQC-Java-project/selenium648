package com.ita.edu.teachua.api;

import com.ita.edu.teachua.ui.pages.header.HeaderPage;
import com.ita.edu.teachua.utils.GmailContentExtractor;
import org.testng.annotations.Test;

public class ResorePasswordViaGmailApi extends TestRunner {

    @Test
    public void VerifyNewPasswordValidationWhenRestoringPasswordViaForgotPassword(){
        HeaderPage header = new HeaderPage(driver);
        header.clickOnGuestDropdown()
                .clickOnLoginButton()
                .clickOnForgotPasswordButton()
                .inputEmail("speak.ukrainian.atqc.test@gmail.com")
                .clickOnRestore()
                .setNewRandomPassword();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
