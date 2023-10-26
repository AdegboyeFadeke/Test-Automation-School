package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Task14 {
    // //Navigate to https://www.toolsqa.com/
    //    //close the dialogue box that pops up after a few seconds
    //    //Click on the tutorial button on the top left corner of the page


    public static void main(String[] args)  {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/search/label/Selenium");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='accept-cookie-policy']")).click();
//        Wait hold = new WebDriverWait(driver,  5);
//       hold.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Tutorials')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]")).click();
        driver.quit();

    }
}
