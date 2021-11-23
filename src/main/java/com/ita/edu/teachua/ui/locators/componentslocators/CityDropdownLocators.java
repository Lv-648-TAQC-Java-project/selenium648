package com.ita.edu.teachua.ui.locators.componentslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum CityDropdownLocators implements Locator {

    KYIV_BUTTON(By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Київ')]"));

    private final By path;

    CityDropdownLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
