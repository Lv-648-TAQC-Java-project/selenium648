package com.ita.edu.teachua.ui.pages.main_page;

import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.pageslocators.MainPageLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.clubs_page.ClubsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {
    LinkElement clubsLink;

    public MainPage(WebDriver driver) {
        super(driver);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        initSearchField();
    }

    public void initSearchField() {
        WebElement title = (new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(
                        MainPageLocators.MAIN_PAGE_TITLE.getPath())));
        clubsLink = new LinkElement(driver, MainPageLocators.CLUBS_LINK);
    }

    public ClubsPage clickOnClubs() {
        clubsLink.click();
        return new ClubsPage(driver);
    }
}
