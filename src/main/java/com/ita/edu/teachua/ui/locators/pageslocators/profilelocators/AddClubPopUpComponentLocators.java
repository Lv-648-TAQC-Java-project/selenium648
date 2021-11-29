package com.ita.edu.teachua.ui.locators.pageslocators.profilelocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddClubPopUpComponentLocators implements Locator {
    /*Base info area*/
    CLUB_NAME_INPUT(By.id("basic_name")),
    SPORT_SECTIONS_CHECKBOX(By.cssSelector("input[value*='Спортивні секції']")),
    CHILD_AGE_FROM_INPUT(By.id("basic_ageFrom")),
    CHILD_AGE_TO_INPUT(By.id("basic_ageTo")),
    NEXT_STEP_BUTTON(By.cssSelector("button[type='submit']>span")),
    /*Base info area end*/
    /*Contacts area start*/
    ADD_LOCATION_BUTTON(By.className("add-club-location"))
    /*Contacts area end*/
    ;
    private final By path;

    AddClubPopUpComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}