package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.ui.pages.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeader extends TestRunner {

    @Test
    public void checkAboutUsLink() {
        Header header = new Header(driver);
        header.clickOnAboutUs();
        Assert.assertEquals(driver.getCurrentUrl(), "https://speak-ukrainian.org.ua/about");
    }

    @Test
    public void checkClubsLink() {
        Header header = new Header(driver);
        header.clickOnClubs();
        Assert.assertEquals(driver.getCurrentUrl(), "https://speak-ukrainian.org.ua/clubs");
    }

    @Test
    public void checkServicesLink() {
        Header header = new Header(driver);
        header.clickOnServices();
        Assert.assertEquals(driver.getCurrentUrl(), "https://speak-ukrainian.org.ua/service");
    }
}
