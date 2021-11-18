package com.ita.edu.teachua.ui.pages.advanced_search;

import com.ita.edu.teachua.ui.elements.*;
import com.ita.edu.teachua.ui.locators.pageslocators.AdvancedSearchPageLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class AdvancedSearchPage extends BasePage {

    private RadioButtonElement clubsRadioButton;
    private LabelElement cityLabel;
    private DropDownElement citiesDropdown;
    private LabelElement districtLabel;
    private DropDownElement districtDropdown;
    private LabelElement metroStationLabel;
    private DropDownElement metroDropdown;
    private LabelElement remoteLabel;
    private CheckBoxElement availableOnlineCheckBox;
    private LabelElement categoriesLabel;
    private RadioButtonElement sportSectionsCheckBox;
    private RadioButtonElement danceChoreographyCheckBox;
    private RadioButtonElement earlyDevelopStudiesCheckBox;
    private RadioButtonElement programmingStemCheckBox;
    private RadioButtonElement artDesignCheckBox;
    private RadioButtonElement vocalMusicCheckBox;
    private RadioButtonElement actorsTheaterCheckBox;
    private RadioButtonElement personalDevelopmentCheckBox;
    private RadioButtonElement journalismEditVideoCheckBox;
    private RadioButtonElement developCenterCheckBox;
    private RadioButtonElement otherCheckBox;
    private LabelElement ageLabel;
    private InputElement ageInput;

    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        clubsRadioButton = new RadioButtonElement(driver,AdvancedSearchPageLocators.CLUB_RADIOBUTTON);
        cityLabel = new LabelElement(driver, AdvancedSearchPageLocators.CITY_LABEL);
        citiesDropdown = new DropDownElement(driver, AdvancedSearchPageLocators.CITIES_DROPDOWN);
        districtLabel = new LabelElement(driver, AdvancedSearchPageLocators.DISTRICT_LABEL);
        districtDropdown = new DropDownElement(driver, AdvancedSearchPageLocators.DISTRICT_DROPDOWN);
        metroStationLabel = new LabelElement(driver, AdvancedSearchPageLocators.NEAREST_STATION_LABEL);
        metroDropdown = new DropDownElement(driver, AdvancedSearchPageLocators.NEAREST_STATION_DROPDOWN);
        remoteLabel = new LabelElement(driver, AdvancedSearchPageLocators.REMOTE_LABEL);
        availableOnlineCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.AVAILABLE_ONLINE_RADIOBUTTON);
        categoriesLabel = new LabelElement(driver, AdvancedSearchPageLocators.CATEGORIES_LABEL);
        sportSectionsCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.SPORT_SECTIONS_RADIOBUTTON);
        danceChoreographyCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.DANCE_CHOREOGRAPHY_RADIOBUTTON);
        earlyDevelopStudiesCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.EARLY_DEVELOPMENT_STUDIES_RADIOBUTTON);
        programmingStemCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.PROGRAMING_STEM_RADIOBUTTON);
        artDesignCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.ART_DESIGN_RADIOBUTTON);
        vocalMusicCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.VOCAL_MUSIC_RADIOBUTTON);
        actorsTheaterCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.ACTORS_THEATER_RADIOBUTTON);
        personalDevelopmentCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.PERSONAL_DEVELOPMENT_RADIOBUTTON);
        journalismEditVideoCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.JOURNALISM_EDITING_VIDEO_RADIOBUTTON);
        developCenterCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.DEVELOPMENT_CENTER_RADIOBUTTON);
        otherCheckBox = new RadioButtonElement(driver, AdvancedSearchPageLocators.OTHER_RADIOBUTTON);
        ageLabel = new LabelElement(driver, AdvancedSearchPageLocators.AGE_LABEL);
        ageInput = new InputElement(driver, AdvancedSearchPageLocators.AGE_INPUT);
    }

    public RadioButtonElement getVocalMusicCheckBox() {
        return vocalMusicCheckBox;
    }

    public RadioButtonElement getClubsRadioButton() {
        return clubsRadioButton;
    }

    public LabelElement getCityLabel() {
        return cityLabel;
    }

    public DropDownElement getDistrictDropdown() {
        return districtDropdown;
    }

    public DropDownElement getMetroDropdown() {
        return metroDropdown;
    }

    public CheckBoxElement getAvailableOnlineCheckBox() {
        return availableOnlineCheckBox;
    }

    public RadioButtonElement getSportSectionsCheckBox() {
        return sportSectionsCheckBox;
    }

    public RadioButtonElement getDanceChoreographyCheckBox() {
        return danceChoreographyCheckBox;
    }

    public RadioButtonElement getEarlyDevelopStudiesCheckBox() {
        return earlyDevelopStudiesCheckBox;
    }

    public RadioButtonElement getProgrammingStemCheckBox() {
        return programmingStemCheckBox;
    }

    public RadioButtonElement getArtDesignCheckBox() {
        return artDesignCheckBox;
    }

    public RadioButtonElement getActorsTheaterCheckBox() {
        return actorsTheaterCheckBox;
    }

    public RadioButtonElement getPersonalDevelopmentCheckBox() {
        return personalDevelopmentCheckBox;
    }

    public RadioButtonElement getJournalismEditVideoCheckBox() {
        return journalismEditVideoCheckBox;
    }

    public RadioButtonElement getDevelopCenterCheckBox() {
        return developCenterCheckBox;
    }

    public RadioButtonElement getOtherCheckBox() {
        return otherCheckBox;
    }

    public AdvancedSearchPage setValueAgeInput(String age) {
        ageInput.sendKeys(age);
        return this;
    }

    public InputElement getAgeInput() {
        return ageInput;
    }

    public AdvancedSearchPage pressEnterAgeInput() {
        ageInput.pressEnter();
        return this;
    }

    public DropDownElement getCitiesDropdown() {
        return citiesDropdown;
    }

    public LabelElement getDistrictLabel() {
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
