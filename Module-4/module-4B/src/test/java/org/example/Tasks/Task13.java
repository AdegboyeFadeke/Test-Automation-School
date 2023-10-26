package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    //Go to https://selenium08.blogspot.com/
    // search for "Demo dropdown" form the search field.
    // on the drop down page, select Nigeria from the country list and
    // select january february and march from the moths list.
    // (image; https://i.imgur.com/sIgQwwG.png)
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/search/label/Selenium");
        Thread.sleep(5000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Demo Dropdown List')]")).click();
        Thread.sleep(5000);
        JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
        scroll2.executeScript("window.scrollBy(0,500)");
        WebElement selectCountry = driver.findElement(By.xpath("//select[@name='country']"));

        Select select = new Select(selectCountry);
        select.selectByVisibleText("Nigeria");
        WebElement selectMonth = driver.findElement(By.xpath("//select[@ name='Month']"));

        Select select2 = new Select(selectMonth);
        select2.selectByVisibleText("January");
        select2.selectByVisibleText("February");
        select2.selectByVisibleText("March");
        select2.getAllSelectedOptions();
        Thread.sleep(5000);
        driver.quit();

    }
}
