package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.header.Header;
import org.testng.annotations.Test;

public class TestOwnerProfilePage extends TestRunner{

    @Test
    public void testAddingLocationByOwner() {
        Header header = new Header(driver);
        header.clickOnGuestDropdown()
                .clickLogInButton()
                .clickEmailField()
                .sendKeysEmailField("admin@gmail.com")
                .clickPasswordField()
                .sendKeysPasswordField("admin")
                .clickLogInButton()
                .clickOnOwnerDropdown()
                .clickOnAddCenterButton()
                .clickOnNameField()
                .sendKeysNameField("Test_Center_Name")
                .clickOnAddLocation()
                .clickOnLocationNameField()
                .sendKeysLocationNameField("LocationTestName")
                .clickOnCityDropdown()
                .clickOnKyivButton()
                .clickOnDistrictDropdown()
                .clickOnDesnianskyiButton()
                .clickOnLocalityDropdown()
                .clickOnAkademmistechkoButton();
    }
}