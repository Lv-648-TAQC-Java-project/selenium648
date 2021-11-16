package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddLocationPopUpLocators implements Locator {
    LOCATION_NAME_FIELD(By.id("name")),
    CITY_DROPDOWN(By.id("cityName")),
    DISTRICT_DROPDOWN(By.id("districtName")),
    LOCALITY_DROPDOWN(By.id("stationName"));

    private final By path;

    AddLocationPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
