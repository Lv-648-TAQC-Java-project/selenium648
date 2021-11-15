package com.ita.edu.teachua.ui.locators.componentslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum ClubCardComponentLocators implements Locator {
    ;

    private final By path;

    ClubCardComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
