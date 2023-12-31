package org.example.Tasks.Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task18login {
    // Using your knowledge of POM, organize your order item test case below:
    //Navigate to saucedemo.com
    //Login with the username and password on the Login screen.
    //Add to items to cart. Click on the cart icon on the top right.
    //assert that the items you clicked and added to cart are what are
    // displayed on the "YOUR CART" page.
    //Click on the checkout button. 6. Input first name last name and
    // postal code and click on continue.
    //Assert that the item showed on the CHECKOUT: OVERVIEW page is
    // the item that was added to cart from the first page.
    //Click on the "Finish" button. Assert that user sees an
    // success message "THANK YOU FOR YOUR ORDER".

    WebDriver Pdriver=null;


    public Task18login(WebDriver driver){
        Pdriver = driver;
        PageFactory.initElements(Pdriver, this);

    }
    @FindBy(css = "#user-name")
    private WebElement username;
    public WebElement  getUsername(){
        return username;

    }
    @FindBy(css = "#password")
    private WebElement password;
    public WebElement  getPassword(){
        return password;

    }

    @FindBy(css = "#login-button")
    private WebElement login;
    public WebElement  getLogin(){
        return login;

    }

//    public void poms () throws InterruptedException {
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
//
//        this.driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.saucedemo.com/");
//        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("#user-name")).sendKeys("visual_user");
//        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("#login-button")).click();
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
//        Thread.sleep(5000);
//        String firstElement = driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).getText();
//        Assert.assertEquals(firstElement, "Test.allTheThings() T-Shirt (Red)");
//        Thread.sleep(2000);
//        String secondElement = driver.findElement(By.xpath("//a[@id='item_0_title_link']")).getText();
//        Assert.assertEquals(secondElement, "Sauce Labs Bike Light");
//        Thread.sleep(2000);
//        String thirdElement = driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText();
//        Assert.assertEquals(thirdElement, "Sauce Labs Backpack");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@id='checkout']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("sauce");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("sally");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("110002");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='continue']")).click();
//        Thread.sleep(2000);
//        String ele1 = driver.findElement(By.cssSelector("#item_3_title_link")).getText();
//        Assert.assertEquals(firstElement, ele1);
//        String ele2 = driver.findElement(By.xpath("//a[(@id='item_0_title_link')]")).getText();
//        Assert.assertEquals(secondElement, ele2);
//        String ele3 = driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText();
//        Assert.assertEquals(thirdElement, ele3);
//        driver.findElement(By.xpath("//button[@id='finish']")).click();
//        driver.quit();
//
//
//
//
//
//
//    }
}
