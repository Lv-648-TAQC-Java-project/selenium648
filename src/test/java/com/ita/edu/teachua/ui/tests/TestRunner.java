package com.ita.edu.teachua.ui.tests;

import com.ita.edu.teachua.utils.ValueProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

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

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(valueProvider.getBaseUrl());

    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }

}
