package com.ita.edu.teachua.ui.pages.clubs_page;

import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.ClubsPageLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ClubsPage extends BasePage {
    InputElement search;

    public ClubsPage(WebDriver driver) {
        super(driver);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement title = (new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(
                        ClubsPageLocators.CLUBS_PAGE_TITLE.getPath())));
        init();
    }

    public void init() {
        search = new InputElement(driver, ClubsPageLocators.SEARCH_INPUT_FIELD);
    }

    public List<WebElement> getAllTitlesOfCards() {
        return driver.findElements(ClubsPageLocators.CARD_TITLE.getPath());
    }

    public ClubsPage inputStringInSearchField(String input) {
        search.sendKeys(input);
        return new ClubsPage(driver);
    }

}
