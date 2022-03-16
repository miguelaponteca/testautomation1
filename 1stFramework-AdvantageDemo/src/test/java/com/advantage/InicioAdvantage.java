package com.advantage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InicioAdvantage {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webchromedriver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://advantageonlineshopping.com/#/");
        driver.manage().window().maximize();
    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='menuUser']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("miguel");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='sign_in_btnundefined']")).click();

    }

    @After
    public void close() {
        //driver.close();
    }
}
