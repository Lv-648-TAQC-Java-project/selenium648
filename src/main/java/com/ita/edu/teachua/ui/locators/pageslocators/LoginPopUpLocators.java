package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum LoginPopUpLocators implements Locator {
    EMAIL_FIELD(By.id("basic_email")), // TODO
    PASSWORD_FIELD(By.id("basic_password")),// TODO
    LOG_IN_BUTTON(By.xpath("//span[contains(text(),'Увійти')]"));// TODO

    private final By path;

    LoginPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
