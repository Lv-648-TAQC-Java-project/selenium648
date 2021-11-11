package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class LoginTest {
    @Test
    public void test1() throws InterruptedException {
        MainPage mainPage = new MainPage();

        boolean s = mainPage.openMainPage()
                .clickLoginDropdown()
                .clickLoginButton()
                .enterValidData("dadaa@gmail.com", "dadaaa")
                .clickSubmitButton()
                .errorMessage();

        Thread.sleep(5000);
        Assert.assertTrue(s);
        mainPage.afterMet();
    }
}
