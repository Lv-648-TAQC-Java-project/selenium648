package com.ita.edu.teachua.ui.locators.pageslocators.headerlocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddDropdownComponentLocators implements Locator {

    ADD_CENTER_BUTTON(By.xpath("//div[contains(text(),'Додати центр')]"));

    private final By path;

    AddDropdownComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
