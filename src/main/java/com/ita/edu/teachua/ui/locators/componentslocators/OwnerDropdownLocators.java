package com.ita.edu.teachua.ui.locators.componentslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum OwnerDropdownLocators implements Locator {
    MY_PROFILE(By.xpath("//a[contains(text(),'Мій Профіль')]"))
    ;

    private final By path;

    OwnerDropdownLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
