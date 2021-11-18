package com.ita.edu.teachua.ui.locators.pageslocators;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.By;

public enum AdvancedSearchPageLocators implements Locator {
    CLUB_RADIOBUTTON(By.xpath("//span[text() = 'Гурток']/..")),
    CITY_LABEL(By.xpath("//label[@for= 'basic_cityName']")),
    CITIES_DROPDOWN(By.className("ant-select-selection-item")),
    DISTRICT_LABEL(By.xpath("//label[@for= 'basic_districtName']")),
    DISTRICT_DROPDOWN(By.xpath("//input[@id='basic_districtName']/..")),
    NEAREST_STATION_LABEL(By.xpath("//label[@for= 'basic_stationName']")),
    NEAREST_STATION_DROPDOWN(By.xpath("//input[@id='basic_stationName']/..")),
    REMOTE_LABEL(By.xpath("//label[@for= 'basic_isOnline']")),
    AVAILABLE_ONLINE_RADIOBUTTON(By.xpath("//span[contains(text(),'Доступний онлайн')]")),
    CATEGORIES_LABEL(By.xpath("//label[@for= 'basic_categoriesName']")),
    SPORT_SECTIONS_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Спортивні секції')]")),
    DANCE_CHOREOGRAPHY_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Танці, хореографія')]")),
    EARLY_DEVELOPMENT_STUDIES_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Студії раннього розвитку')]")),
    PROGRAMING_STEM_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Програмування, робототехніка, STEM')]")),
    ART_DESIGN_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Художня студія, мистецтво, дизайн')]")),
    VOCAL_MUSIC_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Вокальна студія, музика, музичні інструменти')]")),
    ACTORS_THEATER_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Акторська майстерність, театр')]")),
    PERSONAL_DEVELOPMENT_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Особистісний розвиток')]")),
    JOURNALISM_EDITING_VIDEO_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Журналістика, дитяче телебачення, монтаж відео, влогів')]")),
    DEVELOPMENT_CENTER_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Центр розвитку')]")),
    OTHER_RADIOBUTTON(By.xpath("//label[contains(@class,'ant-checkbox-wrapper')]//span[contains(text(),'Інше')]")),
    AGE_LABEL(By.xpath("//label[@for= 'basic_age']")),
    AGE_INPUT(By.cssSelector("input[role='spinbutton']"));

    private final By path;

    AdvancedSearchPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}