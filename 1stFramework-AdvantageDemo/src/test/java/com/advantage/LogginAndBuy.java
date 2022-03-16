package com.advantage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LogginAndBuy {
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
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='menuUser']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test123");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123");
        driver.findElement(By.xpath("//*[@id='sign_in_btnundefined']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='tabletsImg']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//img[@id='16']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class=\"rabbit productColor ng-scope GRAY\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"quantity\"]")).sendKeys("10");
        driver.findElement(By.xpath("//button[@name=\"save_to_cart\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='checkOutPopUp']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//button[@id='next_btn']")).click();
        driver.findElement(By.xpath("//input[@name='masterCredit']")).click();
        driver.findElement(By.xpath("//input[@id='creditCard']")).sendKeys("457483234567");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='cvv_number']")).sendKeys("676");
        driver.findElement(By.xpath("//select[@name='mmListbox']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[@label='01']")).click();
        driver.findElement(By.xpath("//select[@name='yyyyListbox']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[@label='2024']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='cardholder_name']")).sendKeys("test2");
        Thread.sleep(8000);
        driver.findElement(By.xpath("//input[@name='save_master_credit']")).click();
        driver.findElement(By.xpath("//button[@id='pay_now_btn_MasterCredit']")).click();
        Thread.sleep(8000);
    }

    @After
    public void close() throws InterruptedException {
        driver.close();
    }
}

