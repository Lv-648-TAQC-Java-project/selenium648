package com.ita.edu.teachua.ui.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ita.edu.teachua.ui.pages.header.HeaderPage;

public class TUA140Tests extends TestRunner {

    /*
     * Verify that a 'Керівник' cannot add location to the list of locations after
     * leaving all mandatory and optional fields empty
     */
    @DataProvider
    public Object[][] TUA160Data() {
	return new Object[][] { { valueProvider.getAdminCredentials().split(",") } };
    }

    @Test(dataProvider="TUA160Data")
    public void TUA160(String[] adminCredentials) {
	HeaderPage header = new HeaderPage(driver);
	boolean actualResult = header
		.clickOnGuestDropdown()
		.clickOnLoginButton()
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
}
