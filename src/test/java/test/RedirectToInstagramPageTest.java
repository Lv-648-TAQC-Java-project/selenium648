package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.MainPage;

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
        mainPage.afterMet();
    }
}
