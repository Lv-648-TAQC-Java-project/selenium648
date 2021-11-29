package com.ita.edu.teachua.ui.pages.base_page;

import com.ita.edu.teachua.ui.locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        maximizeWindow();
//        setWait();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public WebElement waitVisibilityOf(WebElement element, int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOf(element));
    }
    public WebElement waitVisibilityOfElementLocated(Locator locator, int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator.getPath()));
    }
    public WebElement waitElementToBeClickable(Locator locator, int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(locator.getPath()));
    }
    public WebElement waitPresenceOfElementLocated(Locator locator, int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.presenceOfElementLocated(locator.getPath()));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void sleep(long ms) {
        try {
            Thread.sleep(ms); // For Presentation ONLY
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
