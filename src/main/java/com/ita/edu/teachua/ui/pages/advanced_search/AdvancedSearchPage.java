package com.ita.edu.teachua.ui.pages.advanced_search;

import com.ita.edu.teachua.ui.locators.pageslocators.AdvancedSearchPageLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvancedSearchPage extends BasePage {

    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
    }

    public boolean isAdvanceSearchFieldDisappear() {
        int searchFields = driver.findElements(AdvancedSearchPageLocators.ADVANCED_SEARCH_FIELD_TITLE.getPath()).size();
        return searchFields == 0;
    }

    public String getTitleOfAdvancedSearchField() {
        return driver.findElement(AdvancedSearchPageLocators.ADVANCED_SEARCH_FIELD_TITLE.getPath()).getText();
    }

}