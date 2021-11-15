package com.ita.edu.teachua.ui.locators.componentslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum GuestDropdownLocators implements Locator {
    REGISTER_BUTTON(By.xpath("//span/div[contains(text(),'Зареєструватися')]"));

    private final By path;

    GuestDropdownLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
