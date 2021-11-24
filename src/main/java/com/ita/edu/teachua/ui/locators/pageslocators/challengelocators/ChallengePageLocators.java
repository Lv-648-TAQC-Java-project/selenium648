package com.ita.edu.teachua.ui.locators.pageslocators.challengelocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum ChallengePageLocators implements Locator {
    ;

    private final By path;

    ChallengePageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
