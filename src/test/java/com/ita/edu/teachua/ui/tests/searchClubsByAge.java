package com.ita.edu.teachua.ui.tests;


import com.ita.edu.teachua.ui.pages.main_page.MainPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class searchClubsByAge extends TestRunner{

    @DataProvider
    public Object[][] checkByAgeDataProvider() {
        return new Object[][] {
                {"2", "2"},
                {"18", "18"},
                {"1", "2"},
                {"19", "18"}
        };
    }
    @Test(dataProvider = "checkByAgeDataProvider")
    public void checkByValidAgeDataProvider(String input, String expectedResult) {
        String actualResult = new MainPage(driver).clickAdvancedSearchButton()
                .setValueAgeInput(input)
                .pressEnterAgeInput()
                .getAgeInput().getValue();
        Assert.assertEquals(actualResult, expectedResult);

    }


}
