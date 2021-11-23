package com.ita.edu.teachua.ui.pages.main_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.pageslocators.MainPageLocators;
import com.ita.edu.teachua.ui.pages.advanced_search.AdvancedSearchPage;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.clubs_page.ClubsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPage extends BasePage {

    LinkElement clubsLink;
    private ButtonElement advancedSearchButton;
    private InputElement searchInput;

    public MainPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        advancedSearchButton = new ButtonElement(driver, MainPageLocators.ADVANCED_SEARCH_BUTTON);

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

    public MainPage verifyThatUserIsOnManePage() {
        String actual = driver.getCurrentUrl();
        String expected = "https://speak-ukrainian.org.ua/dev/";
        Assert.assertEquals(expected, actual);
        return this;

    }

    public AdvancedSearchPage clickAdvancedSearchButton() {
        advancedSearchButton.click();
        return new AdvancedSearchPage(driver);
    }

    public void clickSearchInput(InputElement searchInput) {
        this.searchInput = searchInput;
    }

    public ClubsPage clickOnClubs() {
        clubsLink.click();
        return new ClubsPage(driver);
    }
}
