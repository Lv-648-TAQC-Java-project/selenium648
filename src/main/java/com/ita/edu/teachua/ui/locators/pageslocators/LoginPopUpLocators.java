package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum LoginPopUpLocators implements Locator {
    EMAIL(By.xpath("//input[@id='basic_email']")),
    PASSWORD(By.xpath("//input[@id='basic_password']")),
    LOGIN_POP_UP_BUTTON(By.xpath("//button[@type='submit']"))
    ;

    private final By path;

    LoginPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
