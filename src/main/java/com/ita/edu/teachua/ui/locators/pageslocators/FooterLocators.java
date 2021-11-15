package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum FooterLocators implements Locator {
    ;

    private final By path;

    FooterLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
