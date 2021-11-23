package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.edit_profile_pop_up.ProfileEditPopUp;
import com.ita.edu.teachua.ui.pages.header.Header;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestUserChanges extends TestRunner {
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
        Header profile = new Header(driver);
        ProfileEditPopUp edit = profile
                .clickOnLoginDropdown()
                .clickLoginPopUp()
                .inputData(valueProvider.getAdminEmail(), valueProvider.getAdminPassword())
                .clickSubmitButton()
                .clickOnUserLoginDropdown()
                .clickMyProfile()
                .clickEditProfile();
        String actual = edit
                .fillPhone(data)
                .getMessage();
        Assert.assertEquals(actual, expected);

    }

}
