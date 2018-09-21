package com.sqs.weather;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
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
        String baseUrl = "http://weather.news24.com";
        String expectedTitle = "http://weather.news24.com/";
        driver.get(baseUrl);
      //  String actualTitle = driver.getTitle();
       // System.out.println("Actual title is: " +actualTitle);
      //  Assert.assertEquals(actualTitle, expectedTitle);

    }


    @Test
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



   }


    @Test
    public void getForecast() throws Exception {
        shouldSelectCity();

        driver.findElement(By.xpath("//*[@id=\"ext-gen28\"]")).click();

        WebElement table = driver.findElement(By.xpath("//*[@id=\"sa_weather\"]/div[1]/div[3]/div[2]/div/div/table"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
       // List<WebElement> column = table.findElements(By.tagName("td"));
       System.out.println("No of rows:" +rows.size());

        List<String> value = new ArrayList<String>();


      for (int i = 0; i < rows.size(); i++) {
            List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
            System.out.println("No of columns:" +column.size());
            for (int j = 0; j < column.size(); j++) {
                //String text = column.get(j).getText();
                System.out.println(column.get(1).getText());


                Thread.sleep(10000);

            }
        }
    }
    // String value1 = driver.findElement(By.xpath("//*[@id=\"forecastContent\"]/table/tbody/tr[3]/td[5]")).getText();
    //  System.out.println(By.xpath(value1));


    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
