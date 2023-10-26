package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task4 {
    //Navigate to http://demo.guru99.com/
    //Click on the security Project menu.
    // Input any text in the email and password field.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[href='http://demo.guru99.com/Security/SEC_V1/index.php']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(1) td:nth-child(2) > input:nth-child(1)")).sendKeys("theuid34566");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("De34567yuu");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}



