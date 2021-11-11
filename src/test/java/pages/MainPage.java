package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.Main;

public class MainPage extends BaseClass {

    private WebElement aboutUsButton;
    private WebElement loginDropdown;
    private WebElement loginButton;

    public MainPage(){

    }

    public MainPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        // init elements
        aboutUsButton = driver.findElement(By.xpath("//a[text() = 'Про нас']"));
        loginDropdown = driver.findElement(By.xpath("//div[@class = 'ant-dropdown-trigger user-profile']/span[@role]"));

    }


    public WebElement getLoginDropdown(){
        return loginDropdown;
    }

    public GuestDropdown clickLoginDropdown() throws InterruptedException {
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(getLoginDropdown()));
        getLoginDropdown().click();
        return new GuestDropdown(driver);
    }

    public WebElement getAboutUsButton() {
        return aboutUsButton;
    }

    public AboutUsPage clickAboutUsButton() {
        getAboutUsButton().click();
        return new AboutUsPage(driver);
    }
}
