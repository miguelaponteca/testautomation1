package com.advantage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cloud {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webchromedriver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://sta-cloud-react.gpstrackit.com/login/SM/04919415b0b449ac521da1521d6ce9f13f4827b1");
        driver.manage().window().maximize();
    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='id_appContainer']/div[2]/ul/li[11]/a/div")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='heading-subusers']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//div[@id='heading-subusers']")).click();

    }

    @After
    public void close() {
        //driver.close();
    }
}

