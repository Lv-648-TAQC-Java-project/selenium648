package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddCenterPopUpLocators implements Locator {
    ADD_LOCATION_BUTTON(By.cssSelector("button.add-location-btn")),
    NEXT_STEP_BUTTON(By.cssSelector("button.next-btn[type='submit']")),
    CENTER_NAME_INPUT(By.id("basic_name")),
    CENTER_NAME_ERROR_BLOCK(By.cssSelector("div[role='alert']"));
    private final By path;

    AddCenterPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
