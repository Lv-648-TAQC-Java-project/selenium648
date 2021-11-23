package com.ita.edu.teachua.ui.pages.main_page;

import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.locators.pageslocators.MainPageLocators;
import com.ita.edu.teachua.ui.pages.advanced_search.AdvancedSearchPage;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainPage extends BasePage {

    private ButtonElement advancedSearchButton;

    public MainPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        advancedSearchButton = new ButtonElement(driver, MainPageLocators.ADVANCED_SEARCH_BUTTON);
    }
    public MainPage verifyThatUserIsOnManePage(){
        String actual = driver.getCurrentUrl();
        String expected = "https://speak-ukrainian.org.ua/dev/";
        Assert.assertEquals(expected, actual);
        return this;
    }
    public AdvancedSearchPage clickAdvancedSearchButton() {
        advancedSearchButton.click();
        return new AdvancedSearchPage(driver);
    }


}
