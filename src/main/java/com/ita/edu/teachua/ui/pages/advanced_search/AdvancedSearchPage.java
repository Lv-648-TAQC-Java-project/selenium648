package com.ita.edu.teachua.ui.pages.advanced_search;

import com.ita.edu.teachua.ui.elements.*;
import com.ita.edu.teachua.ui.locators.pageslocators.AdvancedSearchPageLocators;
import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.AdvancedSearchPageLocators;
import com.ita.edu.teachua.ui.locators.pageslocators.HeaderLocators;
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
    private CheckBoxElement sportSectionsCheckBox;
    private CheckBoxElement danceChoreographyCheckBox;
    private CheckBoxElement earlyDevelopStudiesCheckBox;
    private CheckBoxElement programmingStemCheckBox;
    private CheckBoxElement artDesignCheckBox;
    private CheckBoxElement vocalMusicCheckBox;
    private CheckBoxElement actorsTheaterCheckBox;
    private CheckBoxElement personalDevelopmentCheckBox;
    private CheckBoxElement journalismEditVideoCheckBox;
    private CheckBoxElement developCenterCheckBox;
    private CheckBoxElement otherCheckBox;
    private LabelElement ageLabel;
    private InputElement ageInput;

    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    public AdvancedSearchPage setValueAgeInput(String input) {
        ageInput = new InputElement(driver, AdvancedSearchPageLocators.AGE_INPUT);
        ageInput.sendKeys(input);
        return this;
    }


    private void initElements() {
        clubsRadioButton = new RadioButtonElement(driver, AdvancedSearchPageLocators.CLUB_RADIOBUTTON);
        cityLabel = new LabelElement(driver, AdvancedSearchPageLocators.CITY_LABEL);
        citiesDropdown = new DropDownElement(driver, AdvancedSearchPageLocators.CITIES_DROPDOWN);
        districtLabel = new LabelElement(driver, AdvancedSearchPageLocators.DISTRICT_LABEL);
        districtDropdown = new DropDownElement(driver, AdvancedSearchPageLocators.DISTRICT_DROPDOWN);
        metroStationLabel = new LabelElement(driver, AdvancedSearchPageLocators.NEAREST_STATION_LABEL);
        metroDropdown = new DropDownElement(driver, AdvancedSearchPageLocators.NEAREST_STATION_DROPDOWN);
        remoteLabel = new LabelElement(driver, AdvancedSearchPageLocators.REMOTE_LABEL);
        availableOnlineCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.AVAILABLE_ONLINE_RADIOBUTTON);
        categoriesLabel = new LabelElement(driver, AdvancedSearchPageLocators.CATEGORIES_LABEL);
        sportSectionsCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.SPORT_SECTIONS_RADIOBUTTON);
        danceChoreographyCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.DANCE_CHOREOGRAPHY_RADIOBUTTON);
        earlyDevelopStudiesCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.EARLY_DEVELOPMENT_STUDIES_RADIOBUTTON);
        programmingStemCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.PROGRAMING_STEM_RADIOBUTTON);
        artDesignCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.ART_DESIGN_RADIOBUTTON);
        vocalMusicCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.VOCAL_MUSIC_RADIOBUTTON);
        actorsTheaterCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.ACTORS_THEATER_RADIOBUTTON);
        personalDevelopmentCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.PERSONAL_DEVELOPMENT_RADIOBUTTON);
        journalismEditVideoCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.JOURNALISM_EDITING_VIDEO_RADIOBUTTON);
        developCenterCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.DEVELOPMENT_CENTER_RADIOBUTTON);
        otherCheckBox = new CheckBoxElement(driver, AdvancedSearchPageLocators.OTHER_RADIOBUTTON);
        ageLabel = new LabelElement(driver, AdvancedSearchPageLocators.AGE_LABEL);
        ageInput = new InputElement(driver, AdvancedSearchPageLocators.AGE_INPUT);
    }

    public CheckBoxElement getVocalMusicCheckBox() {
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

    public CheckBoxElement getSportSectionsCheckBox() {
        return sportSectionsCheckBox;
    }

    public CheckBoxElement getDanceChoreographyCheckBox() {
        return danceChoreographyCheckBox;
    }

    public CheckBoxElement getEarlyDevelopStudiesCheckBox() {
        return earlyDevelopStudiesCheckBox;
    }

    public CheckBoxElement getProgrammingStemCheckBox() {
        return programmingStemCheckBox;
    }

    public CheckBoxElement getArtDesignCheckBox() {
        return artDesignCheckBox;
    }

    public CheckBoxElement getActorsTheaterCheckBox() {
        return actorsTheaterCheckBox;
    }

    public CheckBoxElement getPersonalDevelopmentCheckBox() {
        return personalDevelopmentCheckBox;
    }

    public CheckBoxElement getJournalismEditVideoCheckBox() {
        return journalismEditVideoCheckBox;
    }

    public CheckBoxElement getDevelopCenterCheckBox() {
        return developCenterCheckBox;
    }

    public CheckBoxElement getOtherCheckBox() {
        return otherCheckBox;
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
