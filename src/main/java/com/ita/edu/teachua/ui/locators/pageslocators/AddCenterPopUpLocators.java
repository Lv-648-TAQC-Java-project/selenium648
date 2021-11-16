package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddCenterPopUpLocators implements Locator {
    ADD_LOCATION_BUTTON(By.cssSelector("button.add-location-btn"));

    private final By path;

    AddCenterPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
