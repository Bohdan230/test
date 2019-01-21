import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo {

    public static final String URL = "https://www.google.com";

    public static void main(String[] args) throws Exception {

        System.getProperty("chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("TestingBot");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();
    }
    }
