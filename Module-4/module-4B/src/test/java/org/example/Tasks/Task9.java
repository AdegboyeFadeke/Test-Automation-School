package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task9 {
    //Navigate to saucedemo.com
    //Login with username and password
    //navigate back to login screen from the homepage
    //print out the Login button attribute "VALUE" to verify
    // that you are back on the login screen
    //navigate forward to the homepage, print out a name of a product
    // to verify that you are back on the homepage
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
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().back();
        String loginAttribute = driver.findElement(By.cssSelector("#login-button")).getAttribute("login");
        System.out.println(loginAttribute);
        Thread.sleep(5000);
        driver.navigate().forward();
        String homeAttribute = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]")).getAttribute("homepage");
        System.out.println(homeAttribute);
        driver.quit();
    }
}
