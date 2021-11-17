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
        MainPage mainPage = new MainPage(driver);
        SoftAssert softAssert = new SoftAssert();
        AdvancedSearchPage advancedSearchPage = mainPage.clickAdvancedSearchButton();
        boolean cityDropdownIsDisplayed = advancedSearchPage.citiesDropdownIsDisplayed();
        boolean districtLabelIsDisplayed = advancedSearchPage.districtLabelIsDisplayed();
        boolean metroStationIsDisplayed = advancedSearchPage.metroStationIsDisplayed();
        boolean remoteLabelIsDisplayed = advancedSearchPage.remoteLabelIsDisplayed();
        boolean categoriesLabelIsDisplayed = advancedSearchPage.categoriesLabelIsDisplayed();
        boolean ageLabelIsDisplayed = advancedSearchPage.ageLabelIsDisplayed();
        softAssert.assertTrue(cityDropdownIsDisplayed);
        softAssert.assertTrue(districtLabelIsDisplayed);
        softAssert.assertTrue(metroStationIsDisplayed);
        softAssert.assertTrue(remoteLabelIsDisplayed);
        softAssert.assertTrue(categoriesLabelIsDisplayed);
        softAssert.assertTrue(ageLabelIsDisplayed);
        softAssert.assertAll();
    }
}
