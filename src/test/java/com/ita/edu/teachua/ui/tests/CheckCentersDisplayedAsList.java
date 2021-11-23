package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.main_page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckCentersDisplayedAsList extends TestRunner {
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
