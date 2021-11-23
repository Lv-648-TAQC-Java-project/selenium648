package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddDropDownComponentLocators implements Locator {

    //ADD_CENTER(By.xpath("//ul[@class='ant-dropdown-menu ant-dropdown-menu-root ant-dropdown-menu-vertical ant-dropdown-menu-light']/li[@role='menuitem']/span/div[contains(text(),'Додати центр')]"));
    ADD_CLUB_BUTTON(By.xpath("//div[contains(text(),'Додати клуб')]")),
    //ADD_CENTER_BUTTON(By.xpath("//div[contains(text(),'Додати центр')]"));
    ADD_CENTER_BUTTON(By.xpath("//ul[@classname='menu']//div[contains(text(),'Додати центр')]"));

    private final By path;

    AddDropDownComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }

}
