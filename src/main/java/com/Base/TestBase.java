package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

public class TestBase
{
    public static WebDriver driver;


    public static void chrome_launch() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void chrome_close()
    {
        driver.close();
    }
    public static void openUrl(String URL)
    {
        driver.get(URL);
    }

    public static void firefox_launch()
    {
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public static void firefox_close() { driver.close();}

    public static void edge_launch()
    {
        System.setProperty("webdriver.msedge.driver","./src/main/resources/msedgedriver.exe");
        driver=new EdgeDriver();
        driver.manage().window().maximize();
    }
    public static void edge_close() { driver.close();}


}