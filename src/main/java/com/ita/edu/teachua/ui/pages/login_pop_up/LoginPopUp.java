package com.ita.edu.teachua.ui.pages.login_pop_up;

import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.elements.LinkElement;
import com.ita.edu.teachua.ui.locators.pageslocators.HeaderLocators;
import com.ita.edu.teachua.ui.locators.pageslocators.LoginPopUpLocators;
import com.ita.edu.teachua.ui.elements.ButtonElement;
import com.ita.edu.teachua.ui.elements.InputElement;
import com.ita.edu.teachua.ui.locators.pageslocators.LoginPopUpLocators;
import com.ita.edu.teachua.ui.pages.base_page.BasePage;
import com.ita.edu.teachua.ui.pages.header.HeaderPage;

import com.ita.edu.teachua.ui.pages.header.GuestDropdownComponent;
import com.ita.edu.teachua.ui.pages.header.Header;
import com.ita.edu.teachua.ui.pages.main_page.MainPage;
import com.ita.edu.teachua.ui.pages.profile_page.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPopUp extends BasePage {
    private InputElement emailField;
    private InputElement passwordField;
    private ButtonElement submitButton;
    public LoginPopUp(WebDriver driver) {
        super(driver);
        initElements();
    }
    private void initElements() {
	emailField = new InputElement(driver,LoginPopUpLocators.EMAIL_FIELD);
	passwordField = new InputElement(driver,LoginPopUpLocators.PASSWORD_FIELD);
	submitButton = new ButtonElement(driver,LoginPopUpLocators.SUBMIT_BUTTON);
    }
    public HeaderPage FillLoginFields(String eamil, String password) {
	emailField.clear();
	emailField.sendKeys(eamil);
	passwordField.clear();
	passwordField.sendKeys(password);
	submitButton.click();
	return new HeaderPage(driver);
    }
    public LoginPopUp inputData(String emailData, String passwordData){
        InputElement email=new InputElement(driver, LoginPopUpLocators.EMAIL);
        email.sendKeys(emailData);
        InputElement password=new InputElement(driver,LoginPopUpLocators.PASSWORD);
        password.sendKeys(passwordData);
        return this;
    }
    public Header clickSubmitButton() {
        LinkElement loginButton=new LinkElement(driver,LoginPopUpLocators.LOGIN_POP_UP_BUTTON);
        loginButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Вийти']")));
        return new Header(driver);
    }
}
