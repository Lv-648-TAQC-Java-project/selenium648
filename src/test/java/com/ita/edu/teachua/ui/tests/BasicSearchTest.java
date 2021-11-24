package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.main_page.MainPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicSearchTest extends TestRunner {
    @DataProvider
    public Object[][] clubsNameSearchTestDataProvider() {
        return new Object[][]{
                {"American Gymnastics Club"},
                {"IT освіта: курси \"ГРАНД\""},
                {"Театральна Студія \"Зоряні Діти''"},
                {"Студія танцю \"Несамовиті\""},
                {"LESKIV-SCHOOL"},
                {"Професійний клуб Айкідо Йошинкан в Києві - MISOGI"},
                {"Школа танців Dream Team"}
        };
    }

    @Test(invocationCount = 1, dataProvider = "clubsNameSearchTestDataProvider")
    public void checkSearchWithNameOfClubsClipBoard(String data) {
        boolean isPresent = new MainPage(driver)
                .clickOnClubs()
                .pasteClipBoardStringInSearchField(data)
                .isClubPresent(data);
        Assert.assertTrue(isPresent);
    }

    @Test(
            //threadPoolSize = 4,
            invocationCount = 4, dataProvider = "clubsNameSearchTestDataProvider")
    public void checkSearchWithNameOfClubsTyping(String data) {
//        int attempts = 5;
        boolean isPresent = new MainPage(driver)
                .clickOnClubs()
                .inputStringInSearchField(data)
                .isClubPresent(data);
//        while (!actual && attempts != 0) {
//            attempts--;
//            actual = readAndCheckClubs(clubsPage, data);
//        }
        Assert.assertTrue(isPresent);
    }
}
