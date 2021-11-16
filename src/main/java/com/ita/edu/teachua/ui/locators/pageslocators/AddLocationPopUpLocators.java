package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddLocationPopUpLocators implements Locator {
    ADD_BUTTON(By.cssSelector("button[disabled]"));

    private final By path;

    AddLocationPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
