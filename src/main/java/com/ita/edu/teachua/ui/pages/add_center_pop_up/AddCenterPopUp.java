package com.ita.edu.teachua.ui.pages.add_center_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.CheckBoxElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.AddCenterPopUpLocators;
import com.ita.edu.teachua.ui.pages.add_location_pop_up.AddLocationPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.profile_page.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCenterPopUp extends BasePage {

    private InputElement nameField;
    private ButtonElement addLocation;
    private CheckBoxElement locationCheckBox;
    private ButtonElement nextStep;
    private InputElement phoneNumber;
    private InputElement description;
    private ButtonElement finishButton;

    public AddCenterPopUp(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        nameField = new InputElement(driver, AddCenterPopUpLocators.NAME_FIELD);
        addLocation = new ButtonElement(driver, AddCenterPopUpLocators.ADD_LOCATION_BUTTON);
        nextStep = new ButtonElement(driver, AddCenterPopUpLocators.NEXT_STEP_BUTTON);
        phoneNumber = new InputElement(driver, AddCenterPopUpLocators.PHONE_NUMBER_FIELD);
        description = new InputElement(driver, AddCenterPopUpLocators.DESCRIPTION_FIELD);
        finishButton = new ButtonElement(driver, AddCenterPopUpLocators.FINISH_BUTTON);
    }

    public AddCenterPopUp clickOnNameField() {
        nameField.click();
        return this;
    }

    public AddCenterPopUp sendKeysNameField(String name) {
        nameField.sendKeys(name);
        return this;
    }

    public AddCenterPopUp clickOnPhoneNumberField() {
        phoneNumber.click();
        return this;
    }

    public AddCenterPopUp sendKeysPhoneNumberField(String number) {
        phoneNumber.sendKeys(number);
        return this;
    }

    public AddCenterPopUp clickOnDescriptionField() {
        description.click();
        return this;
    }

    public AddCenterPopUp sendKeysDescriptionField(String descr) {
        description.sendKeys(descr);
        return this;
    }

    public AddLocationPopUp clickOnAddLocation() {
        addLocation.click();
        return new AddLocationPopUp(driver);
    }

    public ProfilePage clickOnFinishButton() {
        finishButton.click();
        return new ProfilePage(driver);
    }

    public AddCenterPopUp clickOnNextStep() {
        nextStep.click();
        return this;
    }

    public CheckBoxElement getCheckBoxByName(String name) {
        return new CheckBoxElement(driver.findElement(By.xpath("//span[contains(text(),'" + name + "')]")));
    }

    public AddCenterPopUp clickOnCheckBoxByName(String name) {
        locationCheckBox = new CheckBoxElement(driver.findElement(By.xpath("//span[contains(text(),'" + name + "')]")));
        locationCheckBox.click();
        return this;
    }
}
