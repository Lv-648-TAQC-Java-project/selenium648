package com.ita.edu.teachua.ui.pages.add_location_pop_up;

import com.ita.edu.teachua.ui.elements.DropDownElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.AddLocationPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class AddLocationPopUp extends BasePage {
    private InputElement locationNameField;
    private DropDownElement cityDropdown;
    private DropDownElement districtDropdown;
    private DropDownElement localityDropdown;

    public AddLocationPopUp(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        locationNameField = new InputElement(driver, AddLocationPopUpLocators.LOCATION_NAME_FIELD);
        cityDropdown = new DropDownElement(driver, AddLocationPopUpLocators.CITY_DROPDOWN);
        districtDropdown = new DropDownElement(driver, AddLocationPopUpLocators.DISTRICT_DROPDOWN);
        localityDropdown = new DropDownElement(driver, AddLocationPopUpLocators.LOCALITY_DROPDOWN);
    }

    public AddLocationPopUp clickOnLocationNameField() {
        locationNameField.click();
        return new AddLocationPopUp(driver);
    }

    public AddLocationPopUp sendKeysLocationNameField(String locationName) {
        locationNameField.sendKeys(locationName);
        return new AddLocationPopUp(driver);
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
}
