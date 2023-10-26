package org.example.Tasks.Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Task17a {
    //Run the following tests on https://demoqa.com   as a Testsuite
    // (All test must be in diffrent classes)
    //Navigate to the homepage and click on the Elements tile
    // Assert that you are on the Elements page
    //Navigate to the homepage and click on the Forms tile
    //Assert that you are on the Forms page
    //Navigate to the homepage and click on the Widgets tile
    //Assert that you are on the Widgets page
    //Navigate to the homepage and click on the Interactions tile
    //Assert that you are on the Interactions page

    WebDriver driver = null;


    @Test
    public  void window() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Thread.sleep(5000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
        String elementPage = driver.getCurrentUrl();
        System.out.println(elementPage);
        Assert.assertEquals(elementPage, "https://demoqa.com/");

    }
    @Test
    public  void element() throws InterruptedException {
        driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
        Thread.sleep(5000);
        String elementPage = driver.getCurrentUrl();
        System.out.println(elementPage);
        Assert.assertEquals(elementPage, "https://demoqa.com/elements");
    }

    @AfterTest
    public  void close(){
        driver.quit();

    }
}
