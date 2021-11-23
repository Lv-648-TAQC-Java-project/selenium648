package com.ita.edu.teachua.ui.locators.componentslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum GuestDropdownLocators implements Locator {
    REGISTER_BUTTON(By.xpath("//span/div[contains(text(),'Зареєструватися')]")),
    LOGIN_BUTTON(By.xpath("//div[contains(text(),'Увійти')]"));

    private final By path;

    GuestDropdownLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
