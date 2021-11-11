import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class test {
     WebDriver driver;
    @Test
   public void testTitle() {
         System.setProperty("webdriver.chrome.driver", "F:\\Material\\chromedriver.exe");
          driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://speak-ukrainian.org.ua/");
         String first_title=driver.getTitle();
         WebElement gurtok=driver.findElement(By.xpath("//*[@id=\"root\"]/section/header/div[2]/ul/li[1]/span/a"));
         gurtok.click();
         String second_title= driver.getTitle();
         Assert.assertEquals(first_title, "Навчай українською");
        Assert.assertEquals(second_title, "Навчай українською");
    }
    @AfterClass
     public void quit(){
         driver.quit();
     }

}





