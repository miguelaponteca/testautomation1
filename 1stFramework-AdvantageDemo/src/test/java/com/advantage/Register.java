package com.advantage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Register {
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
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='usernameRegisterPage']")).sendKeys("test123");
        driver.findElement(By.xpath("//input[@name='emailRegisterPage']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@name='passwordRegisterPage']")).sendKeys("Test123");
        driver.findElement(By.xpath("//input[@name='confirm_passwordRegisterPage']")).sendKeys("Test123");
        driver.findElement(By.xpath("//input[@name='first_nameRegisterPage']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@name='last_nameRegisterPage']")).sendKeys("ing");
        driver.findElement(By.xpath("//input[@name='phone_numberRegisterPage']")).sendKeys("123456");
        driver.findElement(By.xpath("//select[@name='countryListboxRegisterPage']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[@label='Colombia']")).click();
        driver.findElement(By.xpath("//input[@name='cityRegisterPage']")).sendKeys("Cartagena");
        driver.findElement(By.xpath("//input[@name='addressRegisterPage']")).sendKeys("Av yes # 12 - 32");
        driver.findElement(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']")).sendKeys("y/n/122");
        driver.findElement(By.xpath("//input[@name='postal_codeRegisterPage']")).sendKeys("3321");
        driver.findElement(By.xpath("//input[@name='i_agree']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='register_btnundefined']")).click();
        Thread.sleep(2000);

    }

    @After
    public void close() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='menuUser']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ng-click='signOut($event)']")).click();
        Thread.sleep(2000);
        driver.close();
    }


}
