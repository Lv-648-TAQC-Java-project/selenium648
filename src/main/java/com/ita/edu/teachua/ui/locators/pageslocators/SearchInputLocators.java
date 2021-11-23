package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum SearchInputLocators implements Locator {
    SEARCH_INPUT(By.cssSelector("#rc_select_9"));

    private final By path;

    SearchInputLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
