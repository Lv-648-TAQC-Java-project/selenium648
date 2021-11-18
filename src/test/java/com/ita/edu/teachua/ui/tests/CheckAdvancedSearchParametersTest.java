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
        softAssert.assertTrue(advancedSearchPage.getCitiesDropdown().isDisplayed(), "Cities dropdown is not displayed");
        softAssert.assertTrue(advancedSearchPage.getDistrictLabel().isDisplayedLabel(), "District label is not displayed");
        softAssert.assertTrue(advancedSearchPage.getMetroStationLabel().isDisplayedLabel(), "Metro station label is not displayed");
        softAssert.assertTrue(advancedSearchPage.getRemoteLabel().isDisplayedLabel(), "Remote label is not displayed");
        softAssert.assertTrue(advancedSearchPage.getCategoriesLabel().isDisplayedLabel(), "Categories label is not displayed");
        softAssert.assertTrue(advancedSearchPage.getAgeLabel().isDisplayedLabel(), "Age label is not displayed");
        softAssert.assertAll();
    }
}
