package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.Header;
import org.testng.annotations.Test;

public class TestRegister extends TestRunner {
    @Test
    public void test1() {
        Header header = new Header(driver);
        header.clickOnLoginDropdown()
                .clickRegisterButton()
                .completeLastNameField()
                .completeFirstNameField()
                .completePhoneNumberField()
                .completeEmailField()
                .completePasswordField()
                .completePasswordConfirmField()
                .clickRegisterButton();
    }
}
