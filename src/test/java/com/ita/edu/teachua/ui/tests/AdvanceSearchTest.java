package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.advanced_search.AdvancedSearchPage;
import com.ita.edu.teachua.ui.pages.header.HeaderPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdvanceSearchTest extends TestRunner {

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

}