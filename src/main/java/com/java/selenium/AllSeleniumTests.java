package com.java.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllSeleniumTests {

    @Test
    public void allSeleniumTests(){
        WebDriver driver = new FirefoxDriver();
        driver.switchTo().alert();
}
