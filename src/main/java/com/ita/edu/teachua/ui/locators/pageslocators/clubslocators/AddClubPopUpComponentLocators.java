package com.ita.edu.teachua.ui.locators.pageslocators.clubslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddClubPopUpComponentLocators implements Locator {
    ;

    private final By path;

    AddClubPopUpComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
