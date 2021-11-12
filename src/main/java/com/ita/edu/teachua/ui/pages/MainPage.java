package com.ita.edu.teachua.ui.pages;

import com.ita.edu.teachua.ui.elements.LinkElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage {
    protected WebDriver driver;
    private WebDriverWait wait;




    public MainPage(WebDriver driver) {
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
