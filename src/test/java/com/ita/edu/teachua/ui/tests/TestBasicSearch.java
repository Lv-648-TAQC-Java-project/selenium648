package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.clubs_page.ClubsPage;
import com.ita.edu.teachua.ui.pages.main_page.MainPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class TestBasicSearch extends TestRunner {
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

    @Test(invocationCount = 10, dataProvider = "clubsNameSearchTestDataProvider")
    public void checkSearchWithNameOfClubs(String data) {
        int attempts = 5;
        ClubsPage clubsPage = new MainPage(driver)
                .clickOnClubs()
                .inputStringInSearchField(data);
        boolean actual = readAndCheckClubs(clubsPage, data);
        while (!actual && attempts != 0) {
            attempts--;
            actual = readAndCheckClubs(clubsPage, data);
        }
        Assert.assertTrue(actual);
    }

    public boolean readAndCheckClubs(ClubsPage clubsPage, String data) {
        List<WebElement> titles = clubsPage.getAllTitlesOfCards();
        boolean isPresent = false;
        String res = "";
        for (WebElement t : titles) {
            try {
                res = t.getText();
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                isPresent = readAndCheckClubs(clubsPage, data);
                break;
            }
            if (res.equals(data)) {
                isPresent = true;
            }
        }
        return isPresent;
    }
}
