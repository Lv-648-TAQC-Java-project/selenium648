package com.ita.edu.teachua.ui.pages.advanced_search;

import com.ita.edu.teachua.ui.elements.DropDownElement;
import com.ita.edu.teachua.ui.elements.LabelElement;
import com.ita.edu.teachua.ui.locators.pageslocators.AdvancedSearchPageLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class AdvancedSearchPage extends BasePage {

    private DropDownElement citiesDropdown;
    private LabelElement districtLabel;
    private LabelElement metroStationLabel;
    private LabelElement remoteLabel;
    private LabelElement categoriesLabel;
    private LabelElement ageLabel;

    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        citiesDropdown = new DropDownElement(driver, AdvancedSearchPageLocators.CITIES_DROPDOWN);
        districtLabel = new LabelElement(driver, AdvancedSearchPageLocators.DISTRICT_LABEL);
        metroStationLabel = new LabelElement(driver, AdvancedSearchPageLocators.NEAREST_STATION_LABEL);
        remoteLabel = new LabelElement(driver, AdvancedSearchPageLocators.REMOTE_LABEL);
        categoriesLabel = new LabelElement(driver, AdvancedSearchPageLocators.CATEGORIES_LABEL);
        ageLabel = new LabelElement(driver, AdvancedSearchPageLocators.AGE_LABEL);
    }

    public DropDownElement getCitiesDropdown(){
        return citiesDropdown;
    }

    public LabelElement getDistrictLabel(){
        return districtLabel;
    }

    public LabelElement getMetroStationLabel() {
        return metroStationLabel;
    }

    public LabelElement getRemoteLabel() {
        return remoteLabel;
    }

    public LabelElement getCategoriesLabel() {
        return categoriesLabel;
    }

    public LabelElement getAgeLabel() {
        return ageLabel;
    }
}
