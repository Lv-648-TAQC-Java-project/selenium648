package com.ita.edu.teachua.ui.pages.add_location_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.DropDownElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.AddLocationPopUpLocators;
import com.ita.edu.teachua.ui.pages.add_center_pop_up.AddCenterPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class AddLocationPopUp extends BasePage {
    private InputElement locationNameField;
    private DropDownElement cityDropdown;
    private DropDownElement districtDropdown;
    private DropDownElement localityDropdown;
    private InputElement addressField;
    private InputElement coordinatesField;
    private InputElement phoneField;
    private ButtonElement addButton;

    public AddLocationPopUp(WebDriver driver) {
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

    public AddLocationPopUp clickOnLocationNameField() {
        locationNameField.click();
        return this;
    }

    public AddLocationPopUp sendKeysLocationNameField(String locationName) {
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

    public AddLocationPopUp clickOnAddressField() {
        addressField.click();
        return this;
    }

    public AddLocationPopUp sendKeysAddressField(String address) {
        addressField.sendKeys(address);
        return this;
    }

    public AddLocationPopUp clickOnCoordinatesField() {
        coordinatesField.click();
        return this;
    }

    public AddLocationPopUp sendKeysCoordinatesField(String coordinates) {
        coordinatesField.sendKeys(coordinates);
        return this;
    }

    public AddLocationPopUp clickOnPhoneField() {
        phoneField.click();
        return this;
    }

    public AddLocationPopUp sendKeysPhoneField(String phoneNumber) {
        phoneField.sendKeys(phoneNumber);
        return this;
    }

    public AddCenterPopUp clickOnAddButton() {
        addButton = new ButtonElement(driver, AddLocationPopUpLocators.ADD_BUTTON);
        addButton.click();
        return new AddCenterPopUp(driver);
    }
}
