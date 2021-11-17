package com.ita.edu.teachua.ui.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ita.edu.teachua.ui.pages.header.HeaderPage;

public class TUA139Tests extends TestRunner {

    /*
     * Verify that error messages is displayed after user leaves fields empty and
     * clicks 'Наступний крок' button on 'Основна інформація' tab 252
     */
    @DataProvider
    public Object[][] TUA252Data() {
	return new Object[][] { { valueProvider.getAdminCredentials().split(",") } };
    }
    @Test(dataProvider="TUA252Data")
    public void TUA252(String[] adminCredentials) {
	boolean actualResult = new HeaderPage(driver).clickOnGuestDropdown()
	.clickOnLoginButton()
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
