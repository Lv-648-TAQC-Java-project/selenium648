package com.ita.edu.teachua.ui.locators;

import org.openqa.selenium.By;

public enum MainMenuHeaderLocators implements Locator{
    CLUBS_LINK(By.xpath("//a[contains(text(),'Гуртки')]")),
    ABOUT_US_LINK(By.xpath("//a[contains(text(),'Про нас')]")),
    SERVICES_LINK(By.xpath("//a[contains(text(),'Послуги українською')]"))
    ;

    private final By path;

    MainMenuHeaderLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
