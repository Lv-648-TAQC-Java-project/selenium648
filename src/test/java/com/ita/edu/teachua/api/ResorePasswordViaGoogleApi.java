package com.ita.edu.teachua.api;

import com.ita.edu.teachua.ui.pages.header.HeaderPage;
import org.testng.annotations.Test;

public class ResorePasswordViaGoogleApi extends TestRunner {

    @Test
    public void VerifyNewPasswordValidationWhenRestoringPasswordViaForgotPassword(){
        HeaderPage header = new HeaderPage(driver);
        header.clickOnGuestDropdown()
                .clickOnLoginButton()
                .clickOnForgotPasswordButton()
                .inputEmail("speak.ukrainian.atqc.test@gmail.com")
                .clickOnRestore();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
