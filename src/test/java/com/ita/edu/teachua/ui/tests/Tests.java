package com.ita.edu.teachua.ui.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ita.edu.teachua.ui.pages.header.HeaderPage;

public class Tests extends TestRunner {

    /*
     * Verify that a 'Керівник' cannot add location to the list of locations after
     * leaving all mandatory and optional fields empty 160
     */
    @DataProvider
    public Object[][] getAdminCredentials() {
	return new Object[][] { { valueProvider.getAdminCredentials().split(",") } };
    }

    @Test(dataProvider="getAdminCredentials")
    public void VerifyThatOwnerCannotAddLocationToTheListOfLocationsAfterLeavingFieldsEmpty(String[] adminCredentials) {
	boolean actualResult = new HeaderPage(driver)
		.authorize(adminCredentials)
		.clickOnOwnerDropdown()
		.clickOnAddCenter()
		.clickOnAddLocation()
		.checAddButton();
	
	
	Assert.assertFalse(actualResult);
	try {
	    Thread.sleep(5000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    @Test(dataProvider="getAdminCredentials")
    public void VerifyThatErrorMessagesIsDisplayedAfterUserLeavesFieldsEmptyAndClicksNextStepButton(String[] adminCredentials) {
	boolean actualResult = new HeaderPage(driver)
	.authorize(adminCredentials).clickOnOwnerDropdown()
	.clickOnProfile()
	.clickOnAddButton()
	.clickOnAddCenter()
	.clearCenterName()
	.clickOnNextStepButton().errorsIsDisplayed();
	Assert.assertTrue(actualResult);
	//System.out.println(actualResult);
	try {
	    Thread.sleep(5000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
