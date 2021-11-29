package com.ita.edu.teachua.ui.locators.pageslocators.profilelocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AddClubPopUpComponentLocators implements Locator {
    CLUB_NAME_INPUT(By.xpath("//div/input[@id = 'basic_name']")),
    SPORT_SECTIONS_CHECKBOX(By.xpath("//label[@class='ant-checkbox-wrapper']//span[contains(text(),'Спортивні секції')]")),
    AGE_FROM_INPUT(By.id("basic_ageFrom")),
    AGE_TO_INPUT(By.id("basic_ageTo")),
    PHONE_INPUT(By.id("basic_contactТелефон")),
    NEXT_STEP_BUTTON(By.xpath("//span[contains(text(),'Наступний крок')]")),
    DESCRIPTION_INPUT(By.id("basic_description")),
    INCORRECT_DESCRIPTION_ALERT(By.xpath("//div[contains(text(),'Некоректний опис гуртка')]"))
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
