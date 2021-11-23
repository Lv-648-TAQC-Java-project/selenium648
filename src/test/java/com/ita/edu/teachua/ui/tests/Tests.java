package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.add_location_pop_up.AddLocationPopUp;
import com.ita.edu.teachua.ui.pages.header.HeaderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends TestRunner {


    @Test()
    public void VerifyThatOwnerCannotAddLocationToTheListOfLocationsAfterLeavingFieldsEmpty() {
        HeaderPage header = new HeaderPage(driver);
        boolean addLocationPopUpBlockIsDisplayed = header
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnOwnerDropdown()
                .clickOnAddCenterButton()
                //----------------------
                //preconditions^
                .clickOnAddLocation()
                .addLocationPopUpBlockIsDisplayed();// check first expected condition
        Assert.assertTrue(addLocationPopUpBlockIsDisplayed);

        boolean addLocationButtonEnable = new AddLocationPopUp(header.getDriver())
                .checkAddButton(); // check last expected condition

        Assert.assertFalse(addLocationButtonEnable);

    }

    @Test()
    public void VerifyThatErrorMessagesIsDisplayedAfterUserLeavesFieldsEmptyAndClicksNextStepButton() {
        boolean actualResult = new HeaderPage(driver)
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnOwnerDropdown()
                .clickOnProfile()
                .clickOnAddButton()
                .clickOnAddCenterButton()
                .clearCenterName()
                .clickOnNextStepButton()
                .errorsIsDisplayed();
        Assert.assertTrue(actualResult);

    }
}
