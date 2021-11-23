package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum LoginPopUpLocators implements Locator {
    EMAIL_FIELD(By.id("basic_email")),
    PASSWORD_FIELD(By.id("basic_password")),
    SUBMIT_BUTTON(By.cssSelector("button[type='submit']"));

    private final By path;

    LoginPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
