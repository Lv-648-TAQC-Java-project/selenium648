package com.ita.edu.teachua.ui.pages.add_center_pop_up;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.DivElement;
import com.ita.edu.teachua.ui.elements.CheckBoxElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.AddCenterPopUpLocators;
import com.ita.edu.teachua.ui.pages.add_location_pop_up.AddLocationPopUp;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class AddCenterPopUp extends BasePage {
    private ButtonElement addLocation;
    private InputElement centerName;
    private ButtonElement nextStepButton;
    private DivElement errorBlock;
    private InputElement nameField;
    private CheckBoxElement locationCheckBox;
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
        nextStepButton = new ButtonElement(driver, AddCenterPopUpLocators.NEXT_STEP_BUTTON);
        phoneNumber = new InputElement(driver, AddCenterPopUpLocators.PHONE_NUMBER_FIELD);
        description = new InputElement(driver, AddCenterPopUpLocators.DESCRIPTION_FIELD);
        finishButton = new ButtonElement(driver, AddCenterPopUpLocators.FINISH_BUTTON);
    }

    public AddLocationPopUp clickOnAddLocation() {
        addLocation = new ButtonElement(driver, AddCenterPopUpLocators.ADD_LOCATION_BUTTON);
        addLocation.click();
        return new AddLocationPopUp(driver);
    }

    public AddCenterPopUp clearCenterName() {
        centerName = new InputElement(driver, AddCenterPopUpLocators.CENTER_NAME_INPUT);
        centerName.clear();
        return this;
    }

    public AddCenterPopUp clickOnNextStepButton() {
        nextStepButton = new ButtonElement(driver, AddCenterPopUpLocators.NEXT_STEP_BUTTON);
        nextStepButton.click();
        return this;
    }

    public boolean errorsIsDisplayed() {
        errorBlock = new DivElement(waitVisibilityOfElementLocated(AddCenterPopUpLocators.CENTER_NAME_ERROR_BLOCK, 15));
        return errorBlock.isDisplayed();
    }

    public ProfilePage clickOnFinishButton() {
        finishButton.click();
        return new ProfilePage(driver);
    }

    public AddCenterPopUp clickOnNextStep() {
        nextStepButton.click();
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
