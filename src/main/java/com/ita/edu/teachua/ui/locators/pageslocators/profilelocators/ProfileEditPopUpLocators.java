package com.ita.edu.teachua.ui.locators.pageslocators.profilelocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum ProfileEditPopUpLocators implements Locator {
    PHONE_EDIT(By.xpath("//input[@id='edit_phone']")),
    MESSAGE_INVALID_INPUT(By.xpath("//div[@role='alert']")),
    LASTNAME_EDIT(By.xpath("//input[@id='edit_lastName']")),
    SAVE_BUTTON(By.xpath("//input[@id='edit_lastName']")),
    FIRSTNAME_EDIT(By.xpath("//input[@id='edit_firstName']"));

    private final By path;

    ProfileEditPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
