package com.ita.edu.teachua.ui.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected WebDriver driver;

    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }


}
