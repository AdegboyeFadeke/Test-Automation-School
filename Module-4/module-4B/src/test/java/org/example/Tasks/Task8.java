package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task8 {
    //Navigate to https://idorenyinankoh.github.io/loginPage/
    //check if the " create account" button is enabled"
    //fill all the fields
    //check if the "create account"is enabled
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        Thread.sleep(5000);
       Boolean state = driver.findElement(By.id("create")).isEnabled();
        System.out.println(state);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Testers");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bug");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testerbug@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='male']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testers");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='confirmPass']")).sendKeys("Testers");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='xpLevel']")).sendKeys("I am a tester");
        Thread.sleep(5000);
        Boolean state2 = driver.findElement(By.id("create")).isEnabled();
        System.out.println(state2);
        driver.quit();

    }
}
