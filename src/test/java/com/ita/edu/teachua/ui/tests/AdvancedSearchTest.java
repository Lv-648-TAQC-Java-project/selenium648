package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.advanced_search.AdvancedSearchPage;
import com.ita.edu.teachua.ui.pages.header.HeaderPage;
import com.ita.edu.teachua.ui.pages.main_page.MainPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdvancedSearchTest extends TestRunner {

    @Test(description = "TUA-224 Advanced search button opens Розширений пошук section", groups = {"advanced search"})
    public void openAdvancedSearchFieldTest() {
        SoftAssert softAssert = new SoftAssert();
        HeaderPage header = new HeaderPage(driver);
        header.clickAdvancedSearchButton();
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
        String title = advancedSearchPage.getTitleOfAdvancedSearchField();
        header.clickAdvancedSearchButton();
        softAssert.assertEquals(title, "Розширений пошук");
        softAssert.assertTrue(advancedSearchPage.isAdvanceSearchFieldDisappear());
        softAssert.assertAll();
    }

    @DataProvider
    public Object[][] checkByAgeDataProvider() {
        return new Object[][]{
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

    @Test
    public void verifyAllParametersActiveAdvancedSearch() {
        SoftAssert softAssert = new SoftAssert();
        AdvancedSearchPage advancedSearchPage = new MainPage(driver).clickAdvancedSearchButton();
        softAssert.assertTrue(advancedSearchPage.getClubsRadioButton().getAttribute("class").contains("checked"), "Clubs radio button is not selected");
        softAssert.assertTrue(advancedSearchPage.getCityLabel().isDisplayedLabel(), "City label is not displayed");
        softAssert.assertTrue(advancedSearchPage.getCitiesDropdown().isDisplayed(), "Cities dropdown is not displayed");
        softAssert.assertTrue(advancedSearchPage.getDistrictLabel().isDisplayedLabel(), "District label is not displayed");
        softAssert.assertTrue(advancedSearchPage.getDistrictDropdown().isDisplayed(), "District dropdown is not displayed");
        softAssert.assertTrue(advancedSearchPage.getMetroStationLabel().isDisplayedLabel(), "Metro station label is not displayed");
        softAssert.assertTrue(advancedSearchPage.getMetroDropdown().isDisplayed(), "Metro station dropdown is not displayed");
        softAssert.assertTrue(advancedSearchPage.getRemoteLabel().isDisplayedLabel(), "Remote label is not displayed");
        softAssert.assertTrue(advancedSearchPage.getAvailableOnlineCheckBox().isDisplayed(), "Available online checkbox is not displayed");
        softAssert.assertTrue(advancedSearchPage.getCategoriesLabel().isDisplayedLabel(), "Categories label is not displayed");
        softAssert.assertTrue(advancedSearchPage.getSportSectionsCheckBox().isDisplayed(), "Sport sections checkbox is not displayed");
        softAssert.assertTrue(advancedSearchPage.getDanceChoreographyCheckBox().isDisplayed(), "Dance checkbox check box is not displayed");
        softAssert.assertTrue(advancedSearchPage.getEarlyDevelopStudiesCheckBox().isDisplayed(), "Early development studies checkbox check box is not displayed");
        softAssert.assertTrue(advancedSearchPage.getProgrammingStemCheckBox().isDisplayed(), "Programming, STEM checkbox check box is not displayed");
        softAssert.assertTrue(advancedSearchPage.getArtDesignCheckBox().isDisplayed(), "Art studio, design checkbox check box is not displayed");
        softAssert.assertTrue(advancedSearchPage.getVocalMusicCheckBox().isDisplayed(), "Vocal studio, music checkbox check box is not displayed");
        softAssert.assertTrue(advancedSearchPage.getActorsTheaterCheckBox().isDisplayed(), "Actors, theater checkbox check box is not displayed");
        softAssert.assertTrue(advancedSearchPage.getPersonalDevelopmentCheckBox().isDisplayed(), "Personal development checkbox check box is not displayed");
        softAssert.assertTrue(advancedSearchPage.getJournalismEditVideoCheckBox().isDisplayed(), "Journalism, editing video checkbox check box is not displayed");
        softAssert.assertTrue(advancedSearchPage.getDevelopCenterCheckBox().isDisplayed(), "Develop center checkbox check box is not displayed");
        softAssert.assertTrue(advancedSearchPage.getOtherCheckBox().isDisplayed(), "Other checkbox check box is not displayed");
        softAssert.assertTrue(advancedSearchPage.getAgeLabel().isDisplayedLabel(), "Age label is not displayed");
        softAssert.assertAll();
    }

    @Test
    public void checkIfCentersAreDisplayedAsAList() {
        MainPage mainPage = new MainPage(driver);
        boolean checkIfCentersAreDisplayedAsAList = mainPage
                .verifyThatUserIsOnManePage()
                .clickAdvancedSearchButton()
                .verifyThatUserIsOnAdvancedSearchPage()
                .verifyThatWorkshopRadioButtonIsChosenByDefault()
                .clickOnCenterRadioButton()
                .verifyThatCenterRadioButtonIsChosen()
                .clickOnListIcon()
                .checkThatCentersAreDisplayedAsAList();
        Assert.assertTrue(checkIfCentersAreDisplayedAsAList);
    }

}