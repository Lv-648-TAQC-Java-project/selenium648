package com.ita.edu.teachua.ui.pages.profile_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.CheckBoxElement;
import com.ita.edu.teachua.ui.elements.DivElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.profilelocators.AddCenterPopUpComponentLocators;
import com.ita.edu.teachua.ui.locators.pageslocators.profilelocators.AddClubPopUpComponentLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddClubPopUpComponent extends BasePage {


    public AddClubPopUpComponent(WebDriver driver) {
        super(driver);
    }

    private InputElement clubNameInput;
    private CheckBoxElement sportSectionsCheckBox;
    private InputElement childAgeFromInput;
    private InputElement childAgeToInput;
    private ButtonElement nextStepButton;
    private ButtonElement addLocation;
    /*Base info area start*/
    public AddClubPopUpComponent fillClubNameField(String clubName){
        clubNameInput = new InputElement(driver, AddClubPopUpComponentLocators.CLUB_NAME_INPUT);
        clubNameInput.clear();
        clubNameInput.sendKeys(clubName);
        return this;
    }
    public AddClubPopUpComponent chooseSportSections(){
        sportSectionsCheckBox = new CheckBoxElement(driver,AddClubPopUpComponentLocators.SPORT_SECTIONS_CHECKBOX);
        sportSectionsCheckBox.click();
        return this;
    }
    public AddClubPopUpComponent fillChildAge(String ageFrom, String ageTo){
        childAgeFromInput = new InputElement(driver, AddClubPopUpComponentLocators.CHILD_AGE_FROM_INPUT);
        childAgeToInput = new InputElement(driver, AddClubPopUpComponentLocators.CHILD_AGE_TO_INPUT);
        childAgeFromInput.clear();
        childAgeFromInput.sendKeys(ageFrom);
        childAgeToInput.clear();
        childAgeToInput.sendKeys(ageTo);
        return this;

    }
    public AddClubPopUpComponent clickOnNextStepButton() {
        nextStepButton = new ButtonElement(driver, AddClubPopUpComponentLocators.NEXT_STEP_BUTTON);
        nextStepButton.click();
        return this;
    }
    /*Base info area end*/

    /*Contacts area start*/
    public AddLocationPopUpComponent clickOnAddLocation() {
        addLocation = new ButtonElement(driver, AddClubPopUpComponentLocators.ADD_LOCATION_BUTTON);
        addLocation.click();
        return new AddLocationPopUpComponent(driver);
    }
    /*Contacts area end*/

}
