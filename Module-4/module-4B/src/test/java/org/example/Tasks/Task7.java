package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task7 {
    //Navigate to https://worldweather.wmo.int/en/home.html.
    //Search for your city in the search field. When the result loads,
    // print the days and weather description for each of the days
    // shown in a readable and understandable manner.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Fadeke Adeboye\\Desktop\\quality-assurance\\Test-Automation-School\\Module-4\\module-4B\\src\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://worldweather.wmo.int/en/home.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='q_search']")).sendKeys("Lagos");
        driver.findElement(By.cssSelector("#q_search")).click();
        Thread.sleep(5000);
        String texts = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]")).getText();
//        System.out.println(texts);
           String theDate = texts.substring(0,7);
           String theDay = texts.substring(7,13);
          String  theDegrees = texts.substring(13,25);
        String theweather = texts.substring(25, 38);
        String Wednesday = theDate.concat(theDay).concat(theDegrees).concat(theweather);
        System.out.println("These are the weather forecast for the rest of the week: ");
        System.out.println(Wednesday.replaceAll("\\s",""));
        String theDate2 = texts.substring(38,44);
        String theDay2 = texts.substring(44,49);
        String  theDegrees2 = texts.substring(49,60);
        String theweather2 = texts.substring(60, 77);
        String Thursday = theDate2.concat(theDay2).concat(theDegrees2).concat(theweather2);
        System.out.println(Thursday.replaceAll("\\s",""));
        String theDate3 = texts.substring(77,86);
        String theDay3 = texts.substring(86,89);
        String  theDegrees3 = texts.substring(89,101);
        String theweather3 = texts.substring(101, 116);
        String Friday =theDate3.concat(theDay3).concat(theDegrees3).concat(theweather3);
        System.out.println(Friday.replaceAll("\\s",""));
        String theDate4 = texts.substring(116,126);
        String theDay4 = texts.substring(126,131);
        String  theDegrees4 = texts.substring(131,143);
        String theweather4 = texts.substring(143, 156);
        String Saturday =theDate4.concat(theDay4).concat(theDegrees4).concat(theweather4);
        System.out.println(Saturday.replaceAll("\\s",""));
        String theDate5 = texts.substring(156,163);
        String theDay5 = texts.substring(163,171);
        String  theDegrees5 = texts.substring(171,183);
        String theweather5 = texts.substring(183);
        String Sunday = theDate5+theDay5+theDegrees5+theweather5;
        System.out.println(Sunday.replaceAll("\\s",""));
        driver.quit();


    }
}
