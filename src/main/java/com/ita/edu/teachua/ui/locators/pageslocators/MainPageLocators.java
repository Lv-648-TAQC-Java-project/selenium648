package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum MainPageLocators implements Locator {

    ADVANCED_SEARCH_BUTTON(By.xpath("//span[@title='Розширений пошук']"));
    ;


    private final By path;

    MainPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
