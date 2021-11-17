package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AdvancedSearchPageLocators implements Locator {
    CITIES_DROPDOWN(By.className("ant-select-selection-item")),
    DISTRICT_LABEL(By.xpath("//label[@for= 'basic_districtName']")),
    NEAREST_STATION_LABEL(By.xpath("//label[@for= 'basic_stationName']")),
    REMOTE_LABEL(By.xpath("//label[@for= 'basic_isOnline']")),
    CATEGORIES_LABEL(By.xpath("//label[@for= 'basic_categoriesName']")),
    AGE_LABEL(By.xpath("//label[@for= 'basic_age']"))
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
