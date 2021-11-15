package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.utils.ValueProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestRunner {

    protected WebDriver driver;
    protected static ValueProvider valueProvider;

    @BeforeSuite
    public void beforeSuite() throws IOException {
        WebDriverManager.chromedriver().setup();
        valueProvider = new ValueProvider();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(valueProvider.getBaseUrl());
    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }

}
