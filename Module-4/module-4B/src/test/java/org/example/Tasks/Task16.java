package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task16 {
    //Navigate to https://testifyltd.com/ .
    //Assert that the Our contact column at the footer of the homepeage has the follwing
    // correct details, EMAIL: info@testifyltd.co.uk
    //LOCATION: Nigeria
    //PHONE: (+234)904-882-

    @Test
    public void assertTest() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://testifyltd.com/");
        Thread.sleep(5000);
        String info = driver.findElement(By.xpath("//p[contains(text(),' (+234)905-882-0971')]")).getText();
        System.out.println(info);
        Assert.assertEquals(info,"info@testifyltd.com   .   (+234)905-882-0971" );
        Thread.sleep(5000);
//        String email = driver.findElement(By.xpath("///p[contains(text(),'From Nigeria to the world')]')]")).getText();
//        System.out.println(email);
//        Assert.assertEquals(email,"info@testifyltd.co.uk" );
//        Thread.sleep(5000);
        String location = driver.findElement(By.xpath("//p[contains(text(),'From Nigeria to the world')]")).getText();
        System.out.println(location);
        Assert.assertEquals(location,"Nigeria" );
        Thread.sleep(5000);
        driver.quit();

    }


}
