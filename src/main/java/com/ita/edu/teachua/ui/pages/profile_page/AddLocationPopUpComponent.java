package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.DivElement;
import com.ita.edu.teachua.ui.elements.DropDownElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.profilelocators.AddLocationPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public AddLocationPopUpComponent(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        locationNameField = new InputElement(driver, AddLocationPopUpLocators.LOCATION_NAME_FIELD);
        cityDropdown = new DropDownElement(driver, AddLocationPopUpLocators.CITY_DROPDOWN);
        districtDropdown = new DropDownElement(driver, AddLocationPopUpLocators.DISTRICT_DROPDOWN);
        localityDropdown = new DropDownElement(driver, AddLocationPopUpLocators.LOCALITY_DROPDOWN);
        addressField = new InputElement(driver, AddLocationPopUpLocators.ADDRESS_FIELD);
        coordinatesField = new InputElement(driver, AddLocationPopUpLocators.COORDINATES_FIELD);
        phoneField = new InputElement(driver, AddLocationPopUpLocators.PHONE_FIELD);
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
        locationNameField.click();
        return this;
    }

    public AddLocationPopUpComponent sendKeysLocationNameField(String locationName) {
        locationNameField.sendKeys(locationName);
        return this;
    }

    public CityDropdownComponent clickOnCityDropdown() {
        cityDropdown.click();
        return new CityDropdownComponent(driver);
    }


    public DistrictDropdownComponent clickOnDistrictDropdown() {
        districtDropdown.click();
        return new DistrictDropdownComponent(driver);
    }

    public LocalityDropdownComponent clickOnLocalityDropdown() {
        localityDropdown.click();
        return new LocalityDropdownComponent(driver);
    }

    public AddLocationPopUpComponent clickOnAddressField() {
        addressField.click();
        return this;
    }

    public AddLocationPopUpComponent sendKeysAddressField(String address) {
        addressField.sendKeys(address);
        return this;
    }

    public AddLocationPopUpComponent clickOnCoordinatesField() {
        coordinatesField.click();
        return this;
    }

    public AddLocationPopUpComponent sendKeysCoordinatesField(String coordinates) {
        coordinatesField.sendKeys(coordinates);
        return this;
    }

    public AddLocationPopUpComponent clickOnPhoneField() {
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
}
