package com.ita.edu.teachua.ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ita.edu.teachua.ui.pages.MainPage;

public class RedirectToInstagramPageTest {

    private static final String INSTA_URL = "https://www.instagram.com/teach.in.ukrainian/";

    @Test
    public void redirectToInstagramPageTest() {
        MainPage mainPage = new MainPage();
        String actualResult = mainPage.openMainPage()
                .clickAboutUsButton()
                .clickInstagramLogoButton()
                .switchWindowToInstagram()
                .getUrl();
        Assert.assertEquals(actualResult, INSTA_URL, "Not correct URL");
    }
}
