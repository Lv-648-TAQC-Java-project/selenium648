package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum RestoringPopUpLocators implements Locator {
    EDIT_EMAIL_FIELD(By.id("edit_email")),
    RESTORE(By.cssSelector("form[id='edit'] button[type='submit']"));

    private final By path;

    RestoringPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
