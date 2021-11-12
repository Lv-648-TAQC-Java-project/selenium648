package com.ita.edu.teachua.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestDropdown extends BaseClass {

    private WebElement registerButton;
    private WebElement loginButton;

    public GuestDropdown() {

    }

    public GuestDropdown(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        loginButton = driver.findElement(By.xpath("//div[contains(text(),'Увійти')]"));
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public LoginForm clickLoginButton() {
        getLoginButton().click();
        return new LoginForm(driver);
    }
}
