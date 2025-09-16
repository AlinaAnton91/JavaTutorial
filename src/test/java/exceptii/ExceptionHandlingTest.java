package exceptii;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExceptionHandlingTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();  // make sure chromedriver is on your PATH
        driver.manage().window().maximize();
    }

    @Test
    public void testWithExceptionHandling() {
        try {
            driver.get("https://www.example.com");

            // Try locating an element that doesn’t exist
            WebElement element = driver.findElement(By.xpath("//div/h1[text()='Example Domain']"));
            element.click();

            System.out.println("✅ Element clicked successfully!");

        } catch (NoSuchElementException e) {
            System.out.println("❌ Error: Element not found on the page.");
        } catch (TimeoutException e) {
            System.out.println("❌ Error: Operation timed out.");
        } catch (Exception e) {
            System.out.println("❌ A general exception occurred: " + e.getMessage());
        } finally {
            System.out.println("➡️  Finally block executed.");
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
