package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.header.HeaderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOwnerProfilePage extends TestRunner{

    @Test
    public void testAddLocationByOwner() {
        HeaderPage header = new HeaderPage(driver);
        /*boolean actual = header.clickOnGuestDropdown()
                .clickLogInButton()
                .clickEmailField()
                .sendKeysEmailField("admin@gmail.com")
                .clickPasswordField()
                .sendKeysPasswordField("admin")
                .clickLogInButton()
                .clickOnOwnerDropdown()
                .clickOnAddCenterButton()
                .clickOnAddLocation()
                .clickOnLocationNameField()
                .sendKeysLocationNameField("LocationTestName")
                .clickOnCityDropdown()
                .clickOnKyivButton()
                .clickOnDistrictDropdown()
                .clickOnDesnianskyiButton()
                .clickOnLocalityDropdown()
                .clickOnAkademmistechkoButton()
                .clickOnAddressField()
                .sendKeysAddressField("SomeAddress")
                .clickOnCoordinatesField()
                .sendKeysCoordinatesField("50.46403522497495, 30.36469393119765")
                .clickOnPhoneField()
                .sendKeysPhoneField("432143210")
                .clickOnAddButton()
                .getCheckBoxByName("LocationTestName")
                .isDisplayed();
        Assert.assertTrue(actual);*/
    }

    @Test
    public void testAddLocationFromProfilePage() {
        /*HeaderPage header = new HeaderPage(driver);// TODO create dropDown element from profile page
        header.clickOnGuestDropdown()
                .clickLogInButton()
                .clickEmailField()
                .sendKeysEmailField("admin@gmail.com")
                .clickPasswordField()
                .sendKeysPasswordField("admin")
                .clickLogInButton()
                .clickOnOwnerDropdown()
                .clickOnProfile()
                .clickOnAddButton()
                .clickOnAddCenterButton()
                .clickOnNameField()
                .sendKeysNameField("TestCenter1")
                .clickOnAddLocation()
                .clickOnLocationNameField()
                .sendKeysLocationNameField("Test1")
                .clickOnCityDropdown()
                .clickOnKyivButton()
                .clickOnDistrictDropdown()
                .clickOnDesnianskyiButton()
                .clickOnLocalityDropdown()
                .clickOnAkademmistechkoButton()
                .clickOnAddressField()
                .sendKeysAddressField("SomeAddress")
                .clickOnCoordinatesField()
                .sendKeysCoordinatesField("50.46403522497495, 30.36469393119765")
                .clickOnPhoneField()
                .sendKeysPhoneField("432143210")
                .clickOnAddButton()
                .clickOnCheckBoxByName("Test1")
                .clickOnNextStep()
                .clickOnPhoneNumberField()
                .sendKeysPhoneNumberField("432143210")
                .clickOnNextStep()
                .clickOnDescriptionField()
                .sendKeysDescriptionField("!@#$%^ dfdgdfhfgjhjgh 1232443545 fghghghj")
                .clickOnNextStep()
                .clickOnCheckBoxByName("testABCD")
                .clickOnFinishButton();*/
    }

    @Test
    public void testPasswordRecovery() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnGuestDropdown();
    }
}