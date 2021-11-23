package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AdvancedSearchPageLocators implements Locator {
    ADVANCED_SEARCH_FIELD_TITLE(By.xpath("//*[@class='club-list-label']")),
    IS_ONLINE_CHECKBOX(By.id("basic_isOnline")),
    AGE_INPUT(By.xpath("//*[@id='basic_age']//input")),
    REGION_DROPDOWN(By.xpath("//*[@id='basic_districtName']")),
    ;

    private final By path;

    AdvancedSearchPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}