package com.ita.edu.teachua.ui.locators.pageslocators.challengelocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum ChallengeDropdownComponentLocators implements Locator {
    ;

    private final By path;

    ChallengeDropdownComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
