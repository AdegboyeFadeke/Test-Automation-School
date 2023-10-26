package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    //Navigate to https://jqueryui.com/
    //.click on the "resize" menu from the left pane
    //Drag the box to be bigger.(Resixe the box to be bigger)
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(5000);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        WebElement size = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
        Thread.sleep(5000);
        Actions drag = new Actions(driver);
        drag.clickAndHold(size).dragAndDropBy(size, 501, 288);
        Thread.sleep(5000);
        driver.quit();
    }
}
