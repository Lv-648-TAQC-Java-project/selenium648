package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.advanced_search.AdvancedSearchPage;
import com.ita.edu.teachua.ui.pages.header.Header;
import com.ita.edu.teachua.ui.pages.main_page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckAdvancedSearchParametersTest extends TestRunner{
    @Test
    public void verifyAllParametersActiveAdvancedSearch(){
        SoftAssert softAssert = new SoftAssert();
        AdvancedSearchPage advancedSearchPage = new MainPage(driver).clickAdvancedSearchButton();
        softAssert.assertTrue(advancedSearchPage.getClubsRadioButton().getAtribute("class").contains("checked"), "Clubs radio button is not selected");
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
}
