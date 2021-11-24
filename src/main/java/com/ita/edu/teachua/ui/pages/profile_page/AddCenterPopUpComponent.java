package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.CheckBoxElement;
import com.ita.edu.teachua.ui.elements.DivElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.profilelocators.AddCenterPopUpComponentLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCenterPopUpComponent extends BasePage {
    private ButtonElement addLocation;
    private InputElement centerName;
    private ButtonElement nextStepButton;
    private DivElement errorBlock;
    private InputElement nameField;
    private CheckBoxElement locationCheckBox;
    private InputElement phoneNumber;
    private InputElement description;
    private ButtonElement finishButton;

    public AddCenterPopUpComponent(WebDriver driver) {
        super(driver);
    }


        //nameField = new InputElement(driver, AddCenterPopUpComponentLocators.NAME_FIELD);
        //phoneNumber = new InputElement(driver, AddCenterPopUpComponentLocators.PHONE_NUMBER_FIELD);
        //description = new InputElement(driver, AddCenterPopUpComponentLocators.DESCRIPTION_FIELD);



    public AddLocationPopUpComponent clickOnAddLocation() {
        addLocation = new ButtonElement(driver, AddCenterPopUpComponentLocators.ADD_LOCATION_BUTTON);
        addLocation.click();
        return new AddLocationPopUpComponent(driver);
    }

    public AddCenterPopUpComponent clearCenterName() {
        centerName = new InputElement(driver, AddCenterPopUpComponentLocators.CENTER_NAME_INPUT);
        centerName.clear();
        return this;
    }

    public AddCenterPopUpComponent clickOnNextStepButton() {
        nextStepButton = new ButtonElement(driver, AddCenterPopUpComponentLocators.NEXT_STEP_BUTTON);
        nextStepButton.click();
        return this;
    }

    public boolean errorsIsDisplayed() {
        errorBlock = new DivElement(waitVisibilityOfElementLocated(AddCenterPopUpComponentLocators.CENTER_NAME_ERROR_BLOCK, 15));
        return errorBlock.isDisplayed();
    }

    public ProfilePage clickOnFinishButton() {
        finishButton = new ButtonElement(driver, AddCenterPopUpComponentLocators.FINISH_BUTTON);
        finishButton.click();
        return new ProfilePage(driver);
    }

    public AddCenterPopUpComponent clickOnNextStep() {
        nextStepButton = new ButtonElement(driver, AddCenterPopUpComponentLocators.NEXT_STEP_BUTTON);
        nextStepButton.click();
        return this;
    }

    public CheckBoxElement getCheckBoxByName(String name) {
        return new CheckBoxElement(driver.findElement(By.xpath("//span[contains(text(),'" + name + "')]")));
    }

    public AddCenterPopUpComponent clickOnCheckBoxByName(String name) {
        getCheckBoxByName(name).click();
        return this;
    }

}
