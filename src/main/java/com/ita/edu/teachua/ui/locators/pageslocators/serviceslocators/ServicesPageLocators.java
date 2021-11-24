package com.ita.edu.teachua.ui.locators.pageslocators.serviceslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum ServicesPageLocators implements Locator {
    ;
    private final By path;

    ServicesPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
