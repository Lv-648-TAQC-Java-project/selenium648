package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum ProfilePageLocators implements Locator {
    ADD_BUTTON(By.xpath("//span[contains(text(),'Додати')]"))
    ;

    private final By path;

    ProfilePageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
