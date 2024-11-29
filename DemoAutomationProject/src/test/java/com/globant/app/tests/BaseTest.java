package com.globant.app.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {
    protected WebDriver driver;
    public static final Logger log = Logger.getLogger(BaseTest.class);

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        // Configurar opciones de Chrome para modo headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Para GitHub Actions
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        if (driver != null) {
            driver.quit();
        }
    }
}