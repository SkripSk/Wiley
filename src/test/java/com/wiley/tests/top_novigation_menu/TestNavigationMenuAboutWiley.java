package com.wiley.tests.top_novigation_menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNavigationMenuAboutWiley {

    public WebDriver driver;

    @BeforeMethod
    public  void start(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://www.wiley.com/WileyCDA/");
        driver.manage().window().maximize();
        goToHome();
    }

    @Test
    public void goToHome(){

        driver.findElement(By.cssSelector("#links-site > ul > li:nth-child(3) > a")).click();
    }

    @AfterMethod
    public void stop(){
        driver.quit();
    }
}
