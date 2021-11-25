package com.ita.edu.teachua.ui.pages.clubs_page;

import com.ita.edu.teachua.ui.locators.pageslocators.clubslocators.ClubsPageLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ClubsPage extends BasePage {

    public ClubsPage(WebDriver driver) {
        super(driver);
        WebElement title = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(
                        ClubsPageLocators.CLUBS_PAGE_TITLE.getPath())));
    }

    public List<WebElement> getAllTitlesOfCards() {
        return driver.findElements(ClubsPageLocators.CARD_TITLE.getPath());
    }

    public boolean isClubPresent(String title) {
        List<WebElement> titles = this.getAllTitlesOfCards();
        boolean isPresent = false;
        String res = "";
        for (WebElement t : titles) {
            try {
                res = t.getText();
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
                sleep(100);
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
