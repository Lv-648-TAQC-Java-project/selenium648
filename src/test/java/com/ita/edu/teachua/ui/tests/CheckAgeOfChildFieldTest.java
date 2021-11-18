package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.main_page.MainPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckAgeOfChildFieldTest extends TestRunner {
    @DataProvider
    public Object[][] checkAgeOfChildFieldTestDataProvider() {
        return new Object[][]{
                {"1", "2"},
                {"2", "2"},
                {"18", "18"},
                {"19", "18"}
        };
    }

    @Test(dataProvider = "checkAgeOfChildFieldTestDataProvider")
    public void checkAgeOfChildFieldTest(String input, String expectedResult) {
        String actualResult = new MainPage(driver).clickAdvancedSearchButton()
                .setValueAgeInput(input)
                .pressEnterAgeInput()
                .getAgeInput().getValue();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
