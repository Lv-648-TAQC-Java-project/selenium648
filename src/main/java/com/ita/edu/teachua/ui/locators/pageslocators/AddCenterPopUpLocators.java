package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddCenterPopUpLocators implements Locator {
    NAME_FIELD(By.id("basic_name")),
    ADD_LOCATION_BUTTON(By.className("add-club-location")),
    NEXT_STEP_BUTTON(By.cssSelector("button[class='ant-btn next-btn'] span")),
    PHONE_NUMBER_FIELD(By.id("contacts_contactТелефон")),
    DESCRIPTION_FIELD(By.id("basic_description")),
    FINISH_BUTTON(By.xpath("//button[@class='finish-btn']"));

    private final By path;

    AddCenterPopUpLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
