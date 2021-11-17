package com.ita.edu.teachua.ui.pages.base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ita.edu.teachua.ui.elements.BaseElement;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        maximazeWindow();
//        setWait();
    }

    public void maximazeWindow() {
        driver.manage().window().maximize();
    }

    public WebElement waitVisibilityOfElementLocated(BaseElement element, int seconds) {
	return new WebDriverWait(driver,seconds).until(ExpectedConditions.visibilityOfElementLocated(element.getPath()));
    }


}
