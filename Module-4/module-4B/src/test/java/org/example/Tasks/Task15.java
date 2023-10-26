package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Task15 {
    //Structure your TestNG file to run Naviagte to google and search for testify.
    //close the browser
    //Naviagate to https://www.mcdonalds.com/us/en-us.html . print out the colour -
    // code of the order now button. All test should be done in one class and
    // utilize your knowldge of tesNG annotation)

    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify limited");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]")).click();
        Thread.sleep(5000);
        driver.manage().window().minimize();
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        Thread.sleep(5000);
       String color = driver.findElement(By.cssSelector("#button-ordernow")).getCssValue("color");
        System.out.println(color);




    }
}
