package com.ita.edu.teachua.ui.locators.pageslocators.headerlocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum LoginPopUpComponentLocators implements Locator {
    EMAIL_FIELD(By.id("basic_email")),
    PASSWORD_FIELD(By.id("basic_password")),
    SUBMIT_BUTTON(By.cssSelector("button[type='submit']")),
    LOG_IN_BUTTON(By.xpath("//span[contains(text(),'Увійти')]")),
    FORGOT_PASSWORD(By.className("restore-password-button"));

    private final By path;

    LoginPopUpComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
