package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.*;
import com.ita.edu.teachua.ui.locators.Locator;
import com.ita.edu.teachua.ui.locators.pageslocators.profilelocators.AddLocationPopUpDynamicLocators;
import com.ita.edu.teachua.ui.locators.pageslocators.profilelocators.AddLocationPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AddLocationPopUpComponent extends BasePage {
    private ButtonElement addButton;
    private DivElement addLocationPopUpBlock;
    private InputElement locationNameField;
    private DropDownElement cityDropdown;
    private DropDownElement districtDropdown;
    private DropDownElement localityDropdown;
    private InputElement addressField;
    private InputElement coordinatesField;
    private InputElement phoneField;
    private LabelElement fieldAcceptLabel;

    public AddLocationPopUpComponent(WebDriver driver) {
        super(driver);
    }
    public boolean checkAddButton() {
        addButton = new ButtonElement(driver, AddLocationPopUpLocators.ADD_BUTTON_DISABLED);
        return addButton.isActive();
    }

    public boolean addLocationPopUpBlockIsDisplayed() {

        try {
            addLocationPopUpBlock = new DivElement(driver, AddLocationPopUpLocators.ADD_LOCATION_BLOCK_HEADER);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public AddLocationPopUpComponent clickOnLocationNameField() {
        locationNameField = new InputElement(driver, AddLocationPopUpLocators.LOCATION_NAME_FIELD);
        locationNameField.click();
        return this;
    }

    public AddLocationPopUpComponent sendKeysLocationNameField(String locationName) {
        locationNameField.sendKeys(locationName);
        return this;
    }

    public CityDropdownComponent clickOnCityDropdown() {
        cityDropdown = new DropDownElement(driver, AddLocationPopUpLocators.CITY_DROPDOWN);
        cityDropdown.click();
        return new CityDropdownComponent(driver);
    }

    public DistrictDropdownComponent clickOnDistrictDropdown() {
        districtDropdown = new DropDownElement(driver, AddLocationPopUpLocators.DISTRICT_DROPDOWN);
        districtDropdown.click();
        return new DistrictDropdownComponent(driver);
    }

    public LocalityDropdownComponent clickOnLocalityDropdown() {
        localityDropdown = new DropDownElement(driver, AddLocationPopUpLocators.LOCALITY_DROPDOWN);
        localityDropdown.click();
        return new LocalityDropdownComponent(driver);
    }

    public AddLocationPopUpComponent clickOnAddressField() {
        addressField = new InputElement(driver, AddLocationPopUpLocators.ADDRESS_FIELD);
        addressField.click();
        return this;
    }

    public AddLocationPopUpComponent sendKeysAddressField(String address) {
        addressField.sendKeys(address);
        return this;
    }

    public AddLocationPopUpComponent clickOnCoordinatesField() {
        coordinatesField = new InputElement(driver, AddLocationPopUpLocators.COORDINATES_FIELD);
        coordinatesField.click();
        return this;
    }

    public AddLocationPopUpComponent sendKeysCoordinatesField(String coordinates) {
        coordinatesField.sendKeys(coordinates);
        return this;
    }

    public AddLocationPopUpComponent clickOnPhoneField() {
        phoneField = new InputElement(driver, AddLocationPopUpLocators.PHONE_FIELD);
        phoneField.click();
        return this;
    }

    public AddLocationPopUpComponent sendKeysPhoneField(String phoneNumber) {
        phoneField.sendKeys(phoneNumber);
        return this;
    }

    public AddCenterPopUpComponent clickOnAddButton() {
        addButton = new ButtonElement(driver, AddLocationPopUpLocators.ADD_BUTTON);
        addButton.click();
        return new AddCenterPopUpComponent(driver);
    }

    public boolean isDataAccepted(String id) {

        try {
            fieldAcceptLabel = new LabelElement(driver,new AddLocationPopUpDynamicLocators().byId(id));
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }

    }
}
