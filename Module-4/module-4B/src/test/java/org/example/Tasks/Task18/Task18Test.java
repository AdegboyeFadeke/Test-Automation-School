package org.example.Tasks.Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task18Test {
    WebDriver driver = null;

    @Test
    public void TestTask18() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        String elementPage2 = driver.getCurrentUrl();
        System.out.println(elementPage2);
        Assert.assertEquals(elementPage2, "https://www.saucedemo.com/");
    }


    @Test
    public void TaskTest() {

        Task18login login = new Task18login(driver);
        login.getUsername().sendKeys("visual_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLogin().click();

        Task18Cart cart = new Task18Cart(driver);
        cart.getBackpack().click();
        cart.getTshirt().click();
        cart.getBike().click();
        cart.getCart().click();
        String tshirt1 = cart.getCheckTshirt().getText();
        String backpack1 = cart.getCheckBackpack().getText();
        String bike1 = cart.getCheckBike().getText();

        Task18checkout checkout = new Task18checkout(driver);
        String tshirt = checkout.getCheckTshirt().getText();
        String backpack = checkout.getCheckBackpack().getText();
        String bike = checkout.getCheckBike().getText();
        Assert.assertEquals(tshirt1, tshirt);
        Assert.assertEquals(backpack1, backpack);
        Assert.assertEquals(bike1, bike);
        checkout.getCheckout().click();
        checkout.getCheckoutFirstName().sendKeys("sauce");
        checkout.getCheckoutLastName().sendKeys("secret");
        checkout.getCheckoutPostal().sendKeys("1100005");
        checkout.getCheckoutCont().click();

        Task18FinalCheckout finalCheckout = new Task18FinalCheckout(driver);
        String tshirt2 = finalCheckout.getCheckoutele1().getText();
        String bike2 = finalCheckout.getCheckoutele2().getText();
        String backpack2 = finalCheckout.getCheckoutele3().getText();
        Assert.assertEquals(tshirt2, tshirt);
        Assert.assertEquals(backpack2, backpack);
        Assert.assertEquals(bike2, bike);
        finalCheckout.getCheckoutfinish().click();
        driver.quit();


    }

}
