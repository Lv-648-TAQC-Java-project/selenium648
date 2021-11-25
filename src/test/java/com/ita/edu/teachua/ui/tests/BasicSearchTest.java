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
                {"Онлайн-школа точних наук YOUSTUD"},
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
                .pasteClipBoardStringInSearchField(data)
                .isClubPresent(data);
        Assert.assertTrue(isPresent);
    }

    @Test(invocationCount = 1, dataProvider = "clubsNameSearchTestDataProvider")
    public void checkSearchWithNameOfClubsTyping(String data) {
        boolean isPresent = new MainPage(driver)
                .inputStringInSearchField(data)
                .isClubPresent(data);
        Assert.assertTrue(isPresent);
    }
}
