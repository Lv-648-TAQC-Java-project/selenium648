package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.CheckBoxElement;
import com.ita.edu.teachua.ui.elements.DivElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.profilelocators.AddClubPopUpComponentLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;

public class AddClubPopUpComponent extends BasePage {
    private InputElement clubNameInput;
    private CheckBoxElement sportSectionsCheckBox;
    private InputElement ageFromInput;
    private InputElement ageToInput;
    private InputElement phoneInput;
    private ButtonElement nextStepButton;
    private InputElement descriptionInput;
    private DivElement incorrectDescriptionAlert;

    public AddClubPopUpComponent(WebDriver driver) {
        super(driver);
    }

    public boolean incorrectDescriptionAlertIsDisplayed(){
        incorrectDescriptionAlert = new DivElement(waitVisibilityOfElementLocated(AddClubPopUpComponentLocators.INCORRECT_DESCRIPTION_ALERT, 5));
        return incorrectDescriptionAlert.isDisplayed();
    }

    public AddClubPopUpComponent sendKeysDescriptionInput(String input){
        descriptionInput = new InputElement(driver, AddClubPopUpComponentLocators.DESCRIPTION_INPUT);
        descriptionInput.sendKeys(input);
        return this;
    }

    public AddClubPopUpComponent clickNextStepButton(){
        nextStepButton = new ButtonElement(driver, AddClubPopUpComponentLocators.NEXT_STEP_BUTTON);
        nextStepButton.click();
        return this;
    }

    public AddClubPopUpComponent sendKeysClubNameInput(String name) {
        clubNameInput = new InputElement(driver, AddClubPopUpComponentLocators.CLUB_NAME_INPUT);
        clubNameInput.sendKeys(name);
        return this;
    }

    public AddClubPopUpComponent selectSportSectionsCheckBox(){
        sportSectionsCheckBox = new CheckBoxElement(driver, AddClubPopUpComponentLocators.SPORT_SECTIONS_CHECKBOX);
        sportSectionsCheckBox.click();
        return this;
    }

    public AddClubPopUpComponent sendKeysAgeFromInput(String age){
        ageFromInput = new InputElement(driver, AddClubPopUpComponentLocators.AGE_FROM_INPUT);
        ageFromInput.sendKeys(age);
        return this;
    }

    public AddClubPopUpComponent sendKeysAgeToInput(String age){
        ageToInput = new InputElement(driver, AddClubPopUpComponentLocators.AGE_TO_INPUT);
        ageToInput.sendKeys(age);
        return this;
    }

    public AddClubPopUpComponent sendKeysPhoneInput(String number){
        phoneInput = new InputElement(driver, AddClubPopUpComponentLocators.PHONE_INPUT);
        phoneInput.sendKeys(number);
        return this;
    }
}
