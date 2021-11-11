package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm extends BaseClass{

    private WebElement loginField;
    private WebElement passwordField;
    private WebElement submitButton;

    public LoginForm(){

    }

    public LoginForm(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements(){
        loginField = driver.findElement(By.id("basic_email"));
        passwordField = driver.findElement(By.id("basic_password"));
        submitButton = driver.findElement(By.xpath("//span[contains(text(),'Увійти')]"));
    }

    public WebElement getSubmitButton(){
        return submitButton;
    }

    public LoginForm clickSubmitButton(){
        getSubmitButton().click();
        return this;
    }

    public WebElement getLoginField() {
        return loginField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public LoginForm clickLoginField(){
        getLoginField().click();
        return this;
    }

    public LoginForm enterValueLoginField(String login){
        clickLoginField();
        getLoginField().clear();
        getLoginField().sendKeys(login);
        return this;
    }

    public LoginForm clickPasswordField(){
        getPasswordField().click();
        return this;
    }

    public LoginForm enterValuePasswordField(String password){
        clickPasswordField();
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
        return this;
    }

    public LoginForm enterValidData(String login, String password){
        enterValueLoginField(login);
        enterValuePasswordField(password);
        return this;
    }

    public boolean errorMessage(){
        boolean actual = driver.findElement(By.cssSelector(".ant-message-error")).isDisplayed();
        return actual;
    }
}
