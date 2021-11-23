package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum HeaderLocators implements Locator {
    CLUBS_LINK(By.xpath("//a[contains(text(),'Гуртки')]")),
    ABOUT_US_LINK(By.xpath("//a[contains(text(),'Про нас')]")),
    SERVICES_LINK(By.xpath("//a[contains(text(),'Послуги українською')]")),
    ADVANCED_SEARCH_BUTTON(By.xpath("//span[@title='Розширений пошук']")),
    GUEST_DROPDOWN(By.xpath("//div[@class = 'ant-dropdown-trigger user-profile']/span[@role]"))
    ;


    private final By path;

    HeaderLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
