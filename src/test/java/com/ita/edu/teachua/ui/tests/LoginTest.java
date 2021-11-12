package com.ita.edu.teachua.ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ita.edu.teachua.ui.pages.MainPage;

public class LoginTest extends TestRunner{

    @Test
    public void login() {

        MainPage mainPage = new MainPage(driver);

        boolean actualResult = mainPage.openMainPage()
                .clickLoginDropdown()
                .clickLoginButton()
                .enterValidData("dadaa@gmail.com", "dadaaa")
                .clickSubmitButton()
                .errorMessage();

        Assert.assertTrue(actualResult);
    }
}
