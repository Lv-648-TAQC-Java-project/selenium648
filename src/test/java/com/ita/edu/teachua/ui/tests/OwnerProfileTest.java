package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.header.HeaderPage;
import com.ita.edu.teachua.ui.pages.profile_page.AddClubPopUpComponent;
import com.ita.edu.teachua.ui.pages.header.RegisterPopUpComponent;
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

    @Test(description = "TUA-160 This test case verifies that a 'Керівник' cannot add a location to the list of locations after leaving all mandatory and optional fields empty")
    public void VerifyThatOwnerCannotAddLocationToTheListOfLocationsAfterLeavingFieldsEmpty() {
        HeaderPage header = new HeaderPage(driver);
        boolean addLocationPopUpBlockIsDisplayed = header
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnOwnerDropdown()
                .clickOnAddCenterButton()
                .clickOnAddLocation()
                .addLocationPopUpBlockIsDisplayed();// check first expected condition
        Assert.assertTrue(addLocationPopUpBlockIsDisplayed);

        boolean addLocationButtonEnable = new AddLocationPopUpComponent(driver)
                .checkAddButton(); // check last expected condition

        Assert.assertFalse(addLocationButtonEnable);

    }
    @DataProvider
    public Object[][] addClubPopUpComponentData() {
        return new Object[][]{
                {"ValidName",
                        "2",
                        "18",
                        "ValidAddress",
                        "49.829104498711104, 24.005058710351314",
                        "0966666666",
                        "name,cityName,districtName,stationName,address,coordinates,phone"
                }
        };
    }
    @Test(dataProvider = "addClubPopUpComponentData",description = "TUA-237 This test case verifies that a 'Керівник' can add a location of a club that doesn't refer to any center after filling in mandatory fields with valid data.")
    public void VerifyThatOwnerCanAddLocationOfClub(String validName,
                                                    String ageFrom,
                                                    String ageTo,
                                                    String validAddress,
                                                    String validCoordinates,
                                                    String validPhone,
                                                    String addLocationPopUpComponentId) {
        String[] locationPopUpComponentId = addLocationPopUpComponentId.split(",");
        SoftAssert softAssert = new SoftAssert();
       AddLocationPopUpComponent addLocationPopUpComponent = new HeaderPage(driver)
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnOwnerDropdown()
                .clickOnProfile()
                .clickOnAddButton()
                .clickOnAddClubButton()
                .fillClubNameField(validName)
                .chooseSportSections()
                .fillChildAge(ageFrom,ageTo)
                .clickOnNextStepButton()
                .clickOnAddLocation();
        boolean addLocationPopUpBlockIsDisplayed = addLocationPopUpComponent
                .addLocationPopUpBlockIsDisplayed();
        softAssert.assertTrue(addLocationPopUpBlockIsDisplayed);


        boolean isDataAccepted = addLocationPopUpComponent
                .clickOnLocationNameField()
                .sendKeysLocationNameField(validName)
                .isDataAccepted(locationPopUpComponentId[0]);
        softAssert.assertTrue(isDataAccepted);

        isDataAccepted = addLocationPopUpComponent
                .clickOnCityDropdown()
                .clickOnKyivButton()
                .isDataAccepted(locationPopUpComponentId[1]);
        softAssert.assertTrue(isDataAccepted);

        isDataAccepted = addLocationPopUpComponent.clickOnDistrictDropdown()
                .clickOnDesnianskyiButton()
                .isDataAccepted(locationPopUpComponentId[2]);
        softAssert.assertTrue(isDataAccepted);

        isDataAccepted =addLocationPopUpComponent
                .clickOnLocalityDropdown()
                .clickOnAkademmistechkoButton()
                .isDataAccepted(locationPopUpComponentId[3]);
        softAssert.assertTrue(isDataAccepted);

        isDataAccepted =addLocationPopUpComponent
                .clickOnAddressField()
                .sendKeysAddressField(validAddress)
                .isDataAccepted(locationPopUpComponentId[4]);
        softAssert.assertTrue(isDataAccepted);

        isDataAccepted =addLocationPopUpComponent
                .clickOnCoordinatesField()
                .sendKeysCoordinatesField(validCoordinates)
                .isDataAccepted(locationPopUpComponentId[5]);
        softAssert.assertTrue(isDataAccepted);

        isDataAccepted =addLocationPopUpComponent
                .clickOnPhoneField()
                .sendKeysPhoneField(validPhone)
                .isDataAccepted(locationPopUpComponentId[6]);
        softAssert.assertTrue(isDataAccepted);

        softAssert.assertAll();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(description = "TUA-252 This test case verifies that user cannot create a center with invalid data in 'Назва' field")
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

    @Test
    public void checkLastVerifyEnteredDataInRegistrationRemembered() {
        HeaderPage header = new HeaderPage(driver);
        RegisterPopUpComponent registerCheck = header.clickOnGuestDropdown()
                .clickOnRegisterButton()
                .clickLastNameField()
                .fillLastName("Вайтович")
                .clickFirstNameField()
                .fillFirstName("Світлана")
                .clickPhoneNumberField()
                .fillPhoneNumber("0671234567")
                .clickEmailField()
                .fillEmail("svitlanawhite@gmail.com")
                .clickPasswordField()
                .fillPassword("12345678")
                .clickPasswordConfirmField()
                .fillPasswordConfirm("12345678")
                .clickCloseButton()
                .clickOnGuestDropdown()
                .clickOnRegisterButton();
        String actual1 = registerCheck.getLastNameText();
        String actual2 = registerCheck.getFirstNameText();
        String actual3 = registerCheck.getEmailText();
        String actual4 = registerCheck.getPasswordText();
        SoftAssert softassert=new SoftAssert();
        softassert.assertEquals(actual1, "Вайтович");
        softassert.assertEquals(actual2, "Світлана");
        softassert.assertEquals(actual3, "svitlanawhite@gmail.com");
        softassert.assertEquals(actual4, "12345678");


    }
    @DataProvider
    public Object[][] lastNameDataProvider() {
        return new Object[][]{
                {"AfBbCcDdEeFfGgHhIiJjKkLlMmNn", "Прізвище не може містити більше, ніж 25 символів"},
                {"AfBbCcDdEeFfGgHhIiJjKkLlMm", "Прізвище не може містити більше, ніж 25 символів"},
                {"", ""},
                {"1Admin", "Прізвище не може містити цифри"},
                {"2Admin", "Прізвище не може містити цифри"},
                {"3Admin", "Прізвище не може містити цифри"},
                {"4Admin", "Прізвище не може містити цифри"},
                {"-Lastname", "Прізвище повинно починатися та закінчуватися літерою"},
                {"< Lastname>", "Прізвище повинно починатися та закінчуватися літерою"},
                {"\'Lastname", "Прізвище повинно починатися та закінчуватися літерою"},
                {"Lastname-", "Прізвище повинно починатися та закінчуватися літерою"},
                {"<Lastname >", "Прізвище повинно починатися та закінчуватися літерою"},
                {"Lastname\'", "Прізвище повинно починатися та закінчуватися літерою"},
                {"!Admin", "Прізвище не може містити спеціальні символи"},
                {"@Admin", "Прізвище не може містити спеціальні символи"},
                {"#Admin", "Прізвище не може містити спеціальні символи"},
                {"$Admin", "Прізвище не може містити спеціальні символи"},
                {"%Admin", "Прізвище не може містити спеціальні символи"},
                {"^Admin", "Прізвище не може містити спеціальні символи"},
                {"&Admin", "Прізвище не може містити спеціальні символи"},
                {"*Admin", "Прізвище не може містити спеціальні символи"},
                {"(Admin", "Прізвище не може містити спеціальні символи"},
                {"_Admin", "Прізвище не може містити спеціальні символи"},
                {"+Admin", "Прізвище не може містити спеціальні символи"},
                {".Admin", "Прізвище не може містити спеціальні символи"},
                {":Admin", "Прізвище не може містити спеціальні символи"},
                {"", "Введіть прізвище"}
        };
    }

    @Test(dataProvider = "lastNameDataProvider")
    public void checkErrorMsWhenFillInvalidDataIntoLastNameField(String data,String expected){
        HeaderPage profile = new HeaderPage(driver);
        ProfileEditPopUpComponent edit = profile
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnUserLoginDropdown()
                .clickOnProfile()
                .clickEditProfile()
                .fillLastName(data);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(edit.getMessage(),expected);
    }

    @DataProvider
    public Object[][] firstNameDataProvider() {
        return new Object[][]{
                {"AfBbCcDdEeFfGgHhIiJjKkLlMmNn", "Ім'я не може містити більше, ніж 25 символів"},
                {"AfBbCcDdEeFfGgHhIiJjKkLlMm", "Ім'я не може містити більше, ніж 25 символів"},
                {"", ""},
                {"1Admin", "Ім'я не може містити цифри"},
                {"2Admin", "Ім'я не може містити цифри"},
                {"3Admin", "Ім'я не може містити цифри"},
                {"4Admin", "Ім'я не може містити цифри"},
                {"-Name", "Ім'я повинно починатися та закінчуватися літерою"},
                {"< Name>", "Ім'я повинно починатися та закінчуватися літерою"},
                {"\'Name", "Ім'я повинно починатися та закінчуватися літерою"},
                {"Name-", "Ім'я повинно починатися та закінчуватися літерою"},
                {"<Name >", "Ім'я повинно починатися та закінчуватися літерою"},
                {"Name\'", "Ім'я повинно починатися та закінчуватися літерою"},
                {"!Admin", "Ім'я не може містити спеціальні символи"},
                {"@Admin", "Ім'я не може містити спеціальні символи"},
                {"#Admin", "Ім'я не може містити спеціальні символи"},
                {"$Admin", "Ім'я не може містити спеціальні символи"},
                {"%Admin", "Ім'я не може містити спеціальні символи"},
                {"^Admin", "Ім'я не може містити спеціальні символи"},
                {"&Admin", "Ім'я не може містити спеціальні символи"},
                {"*Admin", "Ім'я не може містити спеціальні символи"},
                {"(Admin", "Ім'я не може містити спеціальні символи"},
                {"_Admin", "Ім'я не може містити спеціальні символи"},
                {"+Admin", "Ім'я не може містити спеціальні символи"},
                {".Admin", "Ім'я не може містити спеціальні символи"},
                {":Admin", "Ім'я не може містити спеціальні символи"},
                {"", "Введіть Ім'я"}
        };
    }

    @Test(dataProvider = "firstNameDataProvider")
    public void checkErrorMsWhenFillInvalidDataIntoFirstNameField(String data,String expected){
        HeaderPage profile = new HeaderPage(driver);
        ProfileEditPopUpComponent edit = profile
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnUserLoginDropdown()
                .clickOnProfile()
                .clickEditProfile()
                .fillFirstName(data);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(edit.getMessage(),expected);
    }
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


    /** 173-Verify that the ‘Опис’ text field is filled in with valid data **/
    @DataProvider
    public Object[][] data() {
        return new Object[][]{
                {"Education, students, Школа балетуee and so "}, //filled with URK and ENG letters
                {"12345678901234567890123456789012345678656"}, //filled with numbers
                {"!#$%&'()*+,-./:;<=>?@[]^_`{}~^&^%%^&***#"}, //filled with special characters
        };
    }

    @Test(dataProvider = "data")
    public void checkDescriptionFieldWithValidLettersAndSymbols(String input) {
        SoftAssert softAssert = new SoftAssert();
        boolean checkIfValidFiled = new HeaderPage(driver)
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnOwnerDropdown()
                .clickOnProfile()
                .clickOnAddButton()
                .clickOnAddClubButton()
                .enterNameOfClub("Танці, хореографія")
                .clickOnDancesCheckbox()
                .hoverToElement("basic_ageFrom")
                .severalClicksOnFromAgeUpperArrow()
                .hoverToElement("basic_ageTo")
                .severalClicksOnAgeToUpperArrow()
                .clickOnNextStepButton()
                .enterValidTelephoneNumber("9632548777")
                .clickOnNextStepButton()
                .inputInDescriptionField(input)
                .getTick().isDisplayedLabel();
        softAssert.assertTrue(checkIfValidFiled, "field is NOT valid");

        boolean checkEndButtonIsEnabled = new AddClubPopUpComponent(driver)
                .getEndButton().isActive();
        softAssert.assertTrue(checkEndButtonIsEnabled, "button is NOT enabled");
    }

    /** 176-Verify that error message ‘Опис гуртка закороткий’ appears when the user enters less than 40 symbols into the field **/
    @DataProvider
    public Object[][] data0() {
        return new Object[][]{
                {"Also known as the Mo", "Некоректний опис гуртка\n" +
                        "Опис гуртка може містити від 40 до 1500 символів."}, //20 symbols
                {"1", "Некоректний опис гуртка\n" +
                        "Опис гуртка може містити від 40 до 1500 символів."}, //1 symbol
                {"Also known as the Monastery of the ghfg", "Некоректний опис гуртка\n" +
                        "Опис гуртка може містити від 40 до 1500 символів."}, //39 symbols
        };
    }
    @Test(dataProvider = "data0")
    public void checkDescriptionFieldWithLessThan40Symbols(String input, String expected) {
        String actual = new HeaderPage(driver)
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnOwnerDropdown()
                .clickOnProfile()
                .clickOnAddButton()
                .clickOnAddClubButton()
                .enterNameOfClub("Танці, хореографія")
                .clickOnDancesCheckbox()
                .hoverToElement("basic_ageFrom")
                .severalClicksOnFromAgeUpperArrow()
                .hoverToElement("basic_ageTo")
                .severalClicksOnAgeToUpperArrow()
                .clickOnNextStepButton()
                .enterValidTelephoneNumber("9632548777")
                .clickOnNextStepButton()
                .inputInDescriptionField(input)
                .getError().getText();
        Assert.assertEquals(actual, expected);
    }


    /** 177-Verify that error message ‘Опис гуртка задовгий’ appears when the user enters more than 1500 symbols into the field **/
    @DataProvider
    public Object[][] data1() {
        return new Object[][]{
                {"Also known as the Monastery of the Caves, Pechersk Lavra is a historic Orthodox Christian monastery which gave its name to one of the biggest districts in Kiev. This incredibly beautiful complex started as a cave monastery nearly 1,000 years ago.\n" +
                        "Interestingly, while being a major tourist attraction in Kiev, Pechersk Lavra is also an active monastery, which means that over 100 monks live there. There are several churches within the complex, while a part of the monastery serves as a museum, where you can find many architectural relics of the past.Locally known as Maidan Nezalezhnosti, this square has been in the center of many important events in the modern history of Ukraine. The most recognizable monument on the square is the so-called Independence Monument, a 200ft tall victory column placed in the center of the square.\n" +
                        "On the top of the column stands a bronze figurine of a woman holding a rose branch. Since the beginning of the Ukrainian independence movement, this square has been used for political rallies and protests. Nowadays, the square hosts a number of cultural events, and is a place where many city tours begin.In the city of churches, the Golden Gate of Kiev strikes as a rather odd structure. Currently used as a museum, this was the main gate to the fortification of Kiev in the 11th century.The original structure was nearly completely dismantled, and only few vestiges remain. The rest was rebuilt in 1982 based on a speculation , since nobody knows how the originalv"}, //1500 symbols
                {"Also known as the Monastery of the Caves, Pechersk Lavra is a historic Orthodox Christian monastery which gave its name to one of the biggest districts in Kiev. This incredibly beautiful complex started as a cave monastery nearly 1,000 years ago.\n" +
                        "Interestingly, while being a major tourist attraction in Kiev, Pechersk Lavra is also an active monastery, which means that over 100 monks live there. There are several churches within the complex, while a part of the monastery serves as a museum, where you can find many architectural relics of the past.Locally known as Maidan Nezalezhnosti, this square has been in the center of many important events in the modern history of Ukraine. The most recognizable monument on the square is the so-called Independence Monument, a 200ft tall victory column placed in the center of the square.",}, //less than 1500 symbols
        };
    }
    @Test(dataProvider = "data1")
    public void checkDescriptionFieldWithLessThan1500Symbols(String input) {
        boolean checkIfValidFiled = new HeaderPage(driver)
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnOwnerDropdown()
                .clickOnProfile()
                .clickOnAddButton()
                .clickOnAddClubButton()
                .enterNameOfClub("Танці, хореографія")
                .clickOnDancesCheckbox()
                .hoverToElement("basic_ageFrom")
                .severalClicksOnFromAgeUpperArrow()
                .hoverToElement("basic_ageTo")
                .severalClicksOnAgeToUpperArrow()
                .clickOnNextStepButton()
                .enterValidTelephoneNumber("9632548777")
                .clickOnNextStepButton()
                .inputInDescriptionField(input)
                .getTick().isDisplayedLabel();
        Assert.assertTrue(checkIfValidFiled, "field is NOT valid");
    }

    @DataProvider
    public Object[][] data2() {
        return new Object[][]{
                {"Also known as the Monastery of the Caves, Pechersk Lavra is a historic Orthodox Christian monastery which gave its name to one of the biggest districts in Kiev. This incredibly beautiful complex started as a cave monastery nearly 1,000 years ago.\n" +
                        "Interestingly, while being a major tourist attraction in Kiev, Pechersk Lavra is also an active monastery, which means that over 100 monks live there. There are several churches within the complex, while a part of the monastery serves as a museum, where you can find many architectural relics of the past.Locally known as Maidan Nezalezhnosti, this square has been in the center of many important events in the modern history of Ukraine. The most recognizable monument on the square is the so-called Independence Monument, a 200ft tall victory column placed in the center of the square.\n" +
                        "On the top of the column stands a bronze figurine of a woman holding a rose branch. Since the beginning of the Ukrainian independence movement, this square has been used for political rallies and protests. Nowadays, the square hosts a number of cultural events, and is a place where many city tours begin.In the city of churches, the Golden Gate of Kiev strikes as a rather odd structure. Currently used as a museum, this was the main gate to the fortification of Kiev in the 11th century.The original structure was nearly completely dismantled, and only few vestiges remain. The rest was rebuilt in 1982 based on a speculation , since nobody knows how the originalfd",
                        "Опис гуртка може містити від 40 до 1500 символів."}, //1501 symbol
                {"Also known as the Monastery of the Caves, Pechersk Lavra is a historic Orthodox Christian monastery which gave its name to one of the biggest districts in Kiev. This incredibly beautiful complex started as a cave monastery nearly 1,000 years ago.\n" +
                        "Interestingly, while being a major tourist attraction in Kiev, Pechersk Lavra is also an active monastery, which means that over 100 monks live there. There are several churches within the complex, while a part of the monastery serves as a museum, where you can find many architectural relics of the past.Locally known as Maidan Nezalezhnosti, this square has been in the center of many important events in the modern history of Ukraine. The most recognizable monument on the square is the so-called Independence Monument, a 200ft tall victory column placed in the center of the square.\n" +
                        "On the top of the column stands a bronze figurine of a woman holding a rose branch. Since the beginning of the Ukrainian independence movement, this square has been used for political rallies and protests. Nowadays, the square hosts a number of cultural events, and is a place where many city tours begin.In the city of churches, the Golden Gate of Kiev strikes as a rather odd structure. Currently used as a museum, this was the main gate to the fortification of Kiev in the 11th century.The original structure was nearly completely dismantled, and only few vestiges remain. The rest was rebuilt in 1982 based on a speculation , since nobody knows how the originalfd. With its numerous parks and gardens, Kiev is perfect for picnics and outdoor activities.\n" +
                        "Hidropark is an island in the Dnieper River whose natural beaches are very popular during the summer. Besides swimming, you can also play beach volleyball, eat delicious street food or simply sunbathe.",
                        "Опис гуртка може містити від 40 до 1500 символів."} //more than 1500 symbols
        };
    }
    @Test(dataProvider = "data2")
    public void checkDescriptionFieldWithMoreThan1500(String input, String expected) {
        String actual = new HeaderPage(driver)
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnOwnerDropdown()
                .clickOnProfile()
                .clickOnAddButton()
                .clickOnAddClubButton()
                .enterNameOfClub("Танці, хореографія")
                .clickOnDancesCheckbox()
                .hoverToElement("basic_ageFrom")
                .severalClicksOnFromAgeUpperArrow()
                .hoverToElement("basic_ageTo")
                .severalClicksOnAgeToUpperArrow()
                .clickOnNextStepButton()
                .enterValidTelephoneNumber("9632548777")
                .clickOnNextStepButton()
                .inputInDescriptionField(input)
                .getError().getText();
        Assert.assertEquals(actual, expected);
    }


    /** 172-Verify that the ‘Опис’ text field is filled in with valid data when a user enters from 40 to 1500 symbols into the field **/
    @DataProvider
    public Object[][] data3() {
        return new Object[][]{
                {"Also known as the Monastery of the Caves, Pechersk Lavra is a historic Orthodox Christian monastery which gave its name to one of the biggest districts in Kiev. This incredibly beautiful complex started as a cave monastery nearly 1,000 years ago.\\n\" +\n" +
                        "\"Interestingly, while being a major tourist attraction in Kiev, Pechersk Lavra is also an active monastery, which means that over 100 monks live there. There are several churches within the complex, while a part of the monastery serves as a museum, where you can find many architectural relics of the past.Locally known as Maidan Nezalezhnosti, this square has been in the center of many important events in the modern history of Ukraine. The most recognizable monument on the square is the so-called Independence Monument, a 200ft tall victory column placed in the center of the square.\\n\" +\n" +
                        "\"On the top of the column stands a bronze figurine of a woman holding a whe are you so sad& i think that is",}, //1000 symbols
                {"Also known as the Monastery of the Caves"}, //40 symbols
                {"Also known as the Monastery of the Caves, Pechersk Lavra is a historic Orthodox Christian monastery which gave its name to one of the biggest districts in Kiev. This incredibly beautiful complex started as a cave monastery nearly 1,000 years ago.\\n\" +\n" +
                        "\"Interestingly, while being a major tourist attraction in Kiev, Pechersk Lavra is also an active monastery, which means that over 100 monks live there. There are several churches within the complex, while a part of the monastery serves as a museum, where you can find many architectural relics of the past.Locally known as Maidan Nezalezhnosti, this square has been in the center of many important events in the modern history of Ukraine. The most recognizable monument on the square is the so-called Independence Monument, a 200ft tall victory column placed in the center of the square.\\n\" +\n" +
                        "\"On the top of the column stands a bronze figurine of a woman holding a rose branch. Since the beginning of the Ukrainian independence movement, this square has been used for political rallies and protests. Nowadays, the square hosts a number of cultural events, and is a place where many city tours begin.In the city of churches, the Golden Gate of Kiev strikes as a rather odd structure. Currently used as a museum, this was the main gate to the fortification of Kiev in the 11th century.The original structure was nearly completely dismantled, and only few vestiges remain. The rest was rebuilt in 1982 b"}, //1500 symbols
        };
    }
    @Test(dataProvider = "data3")
    public void checkIfButtonIsEnabledWhenInputIsValid(String input) {
        boolean checkIfValidFiled = new HeaderPage(driver)
                .authorize(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickOnOwnerDropdown()
                .clickOnProfile()
                .clickOnAddButton()
                .clickOnAddClubButton()
                .enterNameOfClub("Танці, хореографія")
                .clickOnDancesCheckbox()
                .hoverToElement("basic_ageFrom")
                .severalClicksOnFromAgeUpperArrow()
                .hoverToElement("basic_ageTo")
                .severalClicksOnAgeToUpperArrow()
                .clickOnNextStepButton()
                .enterValidTelephoneNumber("9632548777")
                .clickOnNextStepButton()
                .inputInDescriptionField(input)
                .getEndButton().isActive();
        Assert.assertTrue(checkIfValidFiled, "button is NOT enabled");
    }
}


