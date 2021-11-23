package com.ita.edu.teachua.ui.locators.componentslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum LocalityDropdownLocators implements Locator {

    AKADEMMISTECHKO_BUTTON(By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Академмістечко')]"));

    private final By path;

    LocalityDropdownLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
