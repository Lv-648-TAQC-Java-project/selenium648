package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddCenterPopUpLocators implements Locator {
    NAME_FIELD(By.id("basic_name")),
    ADD_LOCATION_BUTTON(By.className("add-club-location"));

    private final By path;

    AddCenterPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
