package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum ClubsPageLocators implements Locator {
    SEARCH_INPUT_FIELD(By.cssSelector("input[id^='rc_select']")),
    CARD_TITLE(By.cssSelector("div[class='name']")),
    CARD_CATEGORY(By.cssSelector("span[class='name']")),
    CLUBS_PAGE_TITLE(By.xpath("//h2[contains(text(),'Гуртки у місті Київ')]"));

    private final By path;

    ClubsPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
