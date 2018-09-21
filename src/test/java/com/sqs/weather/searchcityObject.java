package com.sqs.weather;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchcityObject {

    WebDriver driver;


    private By cityLocator = By.name("ct100$WeatherContentHolder$ddlCity");
    private By bodyTextLocator = By.tagName("body");
    private String weathersa1Header = "weather.news24.com";
    private String weathersaHeader = "Kimberley Weather | News24";




    public searchcityObject(WebDriver driver) {

        this.driver = driver;
    }


    public void weathersa1Header(){
        String bodyText = driver.findElement(bodyTextLocator).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(weathersa1Header));
    }
    public void assertWeatherSaHeader(){
        String bodyText = driver.findElement(bodyTextLocator).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(weathersaHeader));
    }



    public void populateWeather(String ct100$WeatherContentHolder$ddlCity){

        weathersa1Header();

        driver.findElement(cityLocator).sendKeys(ct100$WeatherContentHolder$ddlCity);

       // clickBook(driver);
        assertWeatherSaHeader();
    }
}

