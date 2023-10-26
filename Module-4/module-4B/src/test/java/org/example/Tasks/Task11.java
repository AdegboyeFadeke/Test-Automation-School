package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task11 {
    //Go to google.
    //search for "testify ltd"
    //Click on the search that result with www.testifyltd.com
    //scroll down the testify website and click on the linkedIn icon.
    //Get the description text on the userpage.(image; https://i.imgur.com/PmrWDXa.png )
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify limited");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]")).click();
        Thread.sleep(5000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,300)");
        Thread.sleep(5000);
       driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")).click();
       Thread.sleep(5000);
       String testify = driver.findElement(By.xpath("//span[@class='line-clamp-2']")).getText();
       System.out.println(testify);
        driver.quit();

    }
}
