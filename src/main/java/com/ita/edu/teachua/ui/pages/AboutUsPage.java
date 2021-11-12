package com.ita.edu.teachua.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class AboutUsPage extends BaseClass {

    private WebElement instagramLogoButton;

    public AboutUsPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        instagramLogoButton = driver.findElement(By.xpath("//div[@class = 'social-info']//a[@href = 'https://www.instagram.com/teach.in.ukrainian/']"));
    }

    public WebElement getInstagramLogoButton() {
        return instagramLogoButton;
    }

    public AboutUsPage clickInstagramLogoButton() {
        getInstagramLogoButton().click();
        return this;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public AboutUsPage switchWindowToInstagram() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("instagram"));
        return this;
    }
}
