package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task6 {
    //Navigate to https://www.saucedemo.com/
    //Login using username and password.
    //Click on the login button,
    //click on the "add to cart" button of any product (Add only one item)
    //click the cart icon on the top right.
    //Click on checkout.  USE ONLY CSS LOCATION STRATEGY

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#user-name")).sendKeys("visual_user");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container.visual_failure:nth-child(3) > a.shopping_cart_link")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#checkout")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
