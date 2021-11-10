import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private final String BASE_URL = "https://speak-ukrainian.org.ua/";
    private final Long IMPLICITLY_WAIT_SECONDS = 10L;
    private final Long ONE_SECOND_DELAY = 1000L;
    private WebDriver driver;

    private void presentationSleep() {
        presentationSleep(1);
    }

    private void presentationSleep(int seconds) {
        try {
            Thread.sleep(seconds * ONE_SECOND_DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeSuite
    public void beforeSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        presentationSleep();
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(BASE_URL);
        presentationSleep();
    }

    @AfterMethod
    public void afterMethod() {
        presentationSleep();
    }


    @Test
    public void loadMainPageTest() {
        String actualResult = driver.findElement(By.cssSelector("h2[class = 'city-name']")).getText();
        Assert.assertEquals(actualResult, "Ініціатива “Навчай українською”");
    }

    @Test
    public void redirectToInstagramPageTest() {
        driver.findElement(By.xpath("//a[text() = 'Про нас']")).click();
        driver.findElement(By.xpath("//div[@class = 'social-info']//a[@href = 'https://www.instagram.com/teach.in.ukrainian/']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("instagram"));
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, "https://www.instagram.com/teach.in.ukrainian/");
        boolean isDisplayed = driver.findElement(By.xpath("//h2[text() = 'teach.in.ukrainian']")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }
}
