package com.ita.edu.teachua.ui.pages.base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void setWait() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


}
