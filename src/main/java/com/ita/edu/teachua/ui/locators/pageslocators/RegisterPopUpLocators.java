package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum RegisterPopUpLocators implements Locator {
    LAST_NAME_FIELD(By.id("lastName")),
    FIRST_NAME_FIELD(By.id("firstName")),
    PHONE_NUMBER_FIELD(By.id("phone")),
    EMAIL_FIELD(By.id("email")),
    PASSWORD_FIELD(By.id("password")),
    PASSWORD_CONFIRM_FIELD(By.id("confirm")),
    REGISTER_BUTTON(By.xpath("//span[contains(text(),'Зареєструватися')]"));

    private final By path;

    RegisterPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
