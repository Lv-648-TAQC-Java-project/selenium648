package com.ita.edu.teachua.ui.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ita.edu.teachua.ui.pages.add_location_pop_up.AddLocationPopUp;
import com.ita.edu.teachua.ui.pages.header.HeaderPage;

public class Tests extends TestRunner {

    /*
     * Verify that a 'Керівник' cannot add location to the list of locations after
     * leaving all mandatory and optional fields empty 160
     */
    @DataProvider
    public Object[][] getAdminCredentials() {
	return new Object[][] { { valueProvider.getAdminCredentials() } };
    }

    @Test(dataProvider="getAdminCredentials")
    public void VerifyThatOwnerCannotAddLocationToTheListOfLocationsAfterLeavingFieldsEmpty(String adminCredentials) {
	String email = adminCredentials.split(",")[0];
	String password = adminCredentials.split(",")[1];
	HeaderPage header = new HeaderPage(driver);
	boolean addLocationPopUpBlockIsDisplayed = header
		                                 .authorize(email, password)
		                                 .clickOnOwnerDropdown()
		                                 .clickOnAddCenter()
		                                 //----------------------
		                                 //preconditions^
		                                 .clickOnAddLocation()
		                                 .addLocationPopUpBlockIsDisplayed();// check first expected condition
	Assert.assertTrue(addLocationPopUpBlockIsDisplayed);
	
	boolean addLocationButtonEnable = new AddLocationPopUp(header.getDriver())
		                                  .checkAddButton(); // check last expected condition
	
	Assert.assertFalse(addLocationButtonEnable);
	
    }
    @Test(dataProvider="getAdminCredentials")
    public void VerifyThatErrorMessagesIsDisplayedAfterUserLeavesFieldsEmptyAndClicksNextStepButton(String adminCredentials) {
	String email = adminCredentials.split(",")[0];
	String password = adminCredentials.split(",")[1];
	boolean actualResult = new HeaderPage(driver)
	                       .authorize(email, password).clickOnOwnerDropdown()
	                       .clickOnProfile()
	                       .clickOnAddButton()
	                       .clickOnAddCenter()
	                       .clearCenterName()
	                       .clickOnNextStepButton()
	                       .errorsIsDisplayed();
	Assert.assertTrue(actualResult);
	
    }
}
