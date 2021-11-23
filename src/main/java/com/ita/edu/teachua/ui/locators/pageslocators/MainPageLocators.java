package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum MainPageLocators implements Locator {

    ADVANCED_SEARCH_BUTTON(By.xpath("//span[@title='Розширений пошук']")),
    SEARCH_INPUT(By.xpath("//*[@id='rc_select_0']"));


    private final By path;

    MainPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }

}
