package com.sqs.weather;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest_2
{
    /**
     * Rigorous Test :-)
     */
  static WebDriver driver;

   @Before


   public void testSetup() {
        System.out.println("In setup");
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        String baseUrl = "http://www.weathersa.co.za/city-pages/Kimberley";
        String expectedTitle = "City Pages";
        driver.get(baseUrl);
        //  String actualTitle = driver.getTitle();
        // System.out.println("Actual title is: " +actualTitle);
        //  Assert.assertEquals(actualTitle, expectedTitle);

    }

   /* @Test
    public void shouldSelectCity() throws InterruptedException

    {

        driver.findElement(By.xpath("//*[@id=\"ctl00_WeatherContentHolder_ddlCity\"]")).click();

        searchcityObject CityPage;
        CityPage = new searchcityObject(driver);

       // CityPage.populateWeather("Kimberley");
       new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_WeatherContentHolder_ddlCity\"]"))).selectByVisibleText("Kimberley");
        driver.findElement(By.xpath("//*[@id=\"ctl00_WeatherContentHolder_btnGo\"]")).click();
              //  driver.findElement(By.id("citysearch")).sendKeys(Keys.RETURN);

       // driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
       
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen28\"]")).click();


   }
*/

    @Test
    public void getForecast() throws Exception {
        //shouldSelectCity();


        String Friday=driver.findElement(By.xpath("//*[@id=\"div7DayForecast\"]/div/div/div[2]")).getText();
        System.out.println(Friday);

        String Saturday=driver.findElement(By.xpath("//*[@id=\"div7DayForecast\"]/div/div/div[3]")).getText();
        System.out.println(Saturday);

        String Sunday=driver.findElement(By.xpath("//*[@id=\"div7DayForecast\"]/div/div/div[4]")).getText();
        System.out.println(Sunday);

        String Monday=driver.findElement(By.xpath("//*[@id=\"div7DayForecast\"]/div/div/div[5]")).getText();
        System.out.println(Monday);




        Thread.sleep(10000);


            }


    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
