package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.header.HeaderPage;
import com.ita.edu.teachua.ui.pages.profile_page.AddLocationPopUpComponent;
import com.ita.edu.teachua.ui.pages.profile_page.ProfileEditPopUpComponent;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OwnerProfileTest extends TestRunner {
    @DataProvider
    public Object[][] phoneDataProvider() {
        return new Object[][]{
                {"6895", "Телефон не відповідає вказаному формату"},
                {"65987458", "Телефон не відповідає вказаному формату"},
                {"6593859632586", "Телефон не відповідає вказаному формату"},
                {"6598521475", "Телефон не відповідає вказаному формату"},
                {"jngeoлщшогнеп", "Телефон не може містити літери"},
                {"!96397180", "Телефон не може містити спеціальні символи"},
                {"@96397180", "Телефон не може містити спеціальні символи"},
                {"#96397180", "Телефон не може містити спеціальні символи"},
                {"$96397180", "Телефон не може містити спеціальні символи"},
                {"%96397180", "Телефон не може містити спеціальні символи"},
                {"^96397180", "Телефон не може містити спеціальні символи"},
                {"&96397180", "Телефон не може містити спеціальні символи"},
                {"*96397180", "Телефон не може містити спеціальні символи"},
                {"(96397180", "Телефон не може містити спеціальні символи"},
                {"_96397180", "Телефон не може містити спеціальні символи"},
                {"+96397180", "Телефон не може містити спеціальні символи"},
                {".96397180", "Телефон не може містити спеціальні символи"},
                {":96397180", "Телефон не може містити спеціальні символи"},
                {"", "Будь ласка введіть Ваш номер телефону"}
        };
    }

    @Test(dataProvider = "phoneDataProvider")
    public void TestUserCheckInvalidDataForFieldPhone(String data, String expected) {
        HeaderPage profile = new HeaderPage(driver);
        ProfileEditPopUpComponent edit = profile
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnUserLoginDropdown()
                .clickOnProfile()
                .clickEditProfile();
        String actual = edit
                .fillPhone(data)
                .getMessage();
        Assert.assertEquals(actual, expected);

    }

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

        boolean addLocationButtonEnable = new AddLocationPopUpComponent(header.getDriver())
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

    @Test(description = "TUA-359 Verify that error messages are shown while leaving empty any field in the 'Змінити пароль' pop-up")
    public void getErrorMessageInChangePasswordPopUpTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        ProfileEditPopUpComponent editProfile = new ProfileEditPopUpComponent(driver);
        SoftAssert softAssert = new SoftAssert();
        headerPage.authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnOwnerDropdown()
                .clickOnProfile()
                .clickEditProfile()
                .clickOnChangePasswordCheckBox()
                .fillInCurrentPasswordInput(valueProvider.getAdminPassword())
                .fillInNewPasswordInput("NewPassword101!")
                .fillInConfirmPasswordInput("")
                .clickOnSaveChangeButton();
        softAssert.assertEquals(editProfile.getErrorMessageConfirmPasswordInput(), "Будь ласка, підтвердіть пароль");
        softAssert.assertEquals(editProfile.getConfirmPasswordInputBorderColor(), "rgb(255, 77, 79)", "Confirm password input isn't red");
        editProfile.fillInCurrentPasswordInput("")
                .fillInNewPasswordInput("NewPassword101!")
                .fillInConfirmPasswordInput("NewPassword101!")
                .clickOnSaveChangeButton();
        softAssert.assertEquals(editProfile.getErrorMessageCurrentPasswordInput(), "Введіть старий пароль");
        softAssert.assertEquals(editProfile.getCurrentPasswordInputBorderColor(), "rgb(255, 77, 79)", "Current password input isn't red");
        editProfile.fillInCurrentPasswordInput(valueProvider.getAdminPassword())
                .fillInNewPasswordInput("")
                .fillInConfirmPasswordInput("NewPassword101!")
                .clickOnSaveChangeButton();
        softAssert.assertEquals(editProfile.getErrorMessageNewPasswordInput(), "Будь ласка, введіть новий пароль");
        softAssert.assertEquals(editProfile.getNewPasswordInputBorderColor(), "rgb(255, 77, 79)", "New password input isn't red");
        softAssert.assertAll();
    }

}