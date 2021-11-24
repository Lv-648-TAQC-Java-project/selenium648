package com.ita.edu.teachua.ui.pages.clubs_page;

import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.clubslocators.ClubsPageLocators;
import com.ita.edu.teachua.ui.locators.pageslocators.mainpagelocators.MainPageLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
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
        search = new InputElement(driver, MainPageLocators.SEARCH_INPUT_FIELD);
    }

    public List<WebElement> getAllTitlesOfCards() {
        return driver.findElements(ClubsPageLocators.CARD_TITLE.getPath());
    }

    public ClubsPage inputStringInSearchField(String input) {
        search.sendKeys(input);
        return new ClubsPage(driver);
    }

    public ClubsPage pasteClipBoardStringInSearchField(String input) {
        StringSelection stringSelection = new StringSelection(input);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        search.sendKeys(Keys.CONTROL + "V");
        return new ClubsPage(driver);
    }

    public boolean isClubPresent(String title) {
        List<WebElement> titles = this.getAllTitlesOfCards();
        boolean isPresent = false;
        String res = "";
        for (WebElement t : titles) {
            try {
                res = t.getText();
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                isPresent = isClubPresent(title);
                break;
            }
            if (res.equals(title)) {
                isPresent = true;
            }
        }
        return isPresent;
    }

}
