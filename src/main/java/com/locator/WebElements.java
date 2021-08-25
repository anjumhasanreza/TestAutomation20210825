package com.locator;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;

public class WebElements extends TestBase
{
    public static void main(String[] args)
    {
        chrome_launch();
        openUrl("https://demo.opencart.com/");
        OpenLoginPage();
        TestRegisterYes();
        //chrome_close();
        chrome_launch();
        openUrl("https://demo.opencart.com/");
        OpenLoginPage();
        TestRegisterNo();

    }

    public static void OpenLoginPage()
    {
        WebElement MyAccount = driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Register = driver.findElement(By.linkText("Register"));
        Register.click();
    }

    public static void TestRegisterYes()
    {
        WebElement FirstName = driver.findElement(By.name("firstname"));
        FirstName.sendKeys("Anjum Hasan");

        WebElement LastName = driver.findElement(By.name("lastname"));
        LastName.sendKeys("Reza");

        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("anjumhasanreza88@gmail.com");

        WebElement Telephone = driver.findElement(By.name("telephone"));
        Telephone.sendKeys("01678045810");

        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("01678045810");

        WebElement ConfirmPassword = driver.findElement(By.name("confirm"));
        ConfirmPassword.sendKeys("01678045810");

        WebElement Subscribe = driver.findElement(By.name("newsletter"));
        Subscribe.click();

//        WebElement Subscribe = driver.findElement(By.cssSelector("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input"));
//        Subscribe.click();

        WebElement PrivacyPolicy = driver.findElement(By.name("agree"));
        PrivacyPolicy.click();

//        WebElement SubmitBtn = driver.findElement(By.cssSelector("//*[@id=\"content\"]/form/div/div/input[2]"));
//        SubmitBtn.click();
    }

    public static void TestRegisterNo()
    {
        WebElement FirstName = driver.findElement(By.name("firstname"));
        FirstName.sendKeys("Anjum Hasan");

        WebElement LastName = driver.findElement(By.name("lastname"));
        LastName.sendKeys("Reza");

        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("anjumhasanreza88@gmail.com");

        WebElement Telephone = driver.findElement(By.name("telephone"));
        Telephone.sendKeys("01678045810");

        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("01678045810");

        WebElement ConfirmPassword = driver.findElement(By.name("confirm"));
        ConfirmPassword.sendKeys("01678045810");

        WebElement Subscribe = driver.findElement(By.name("newsletter"));
        Subscribe.click();

//        WebElement Subscribe = driver.findElement(By.cssSelector("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input"));
//        Subscribe.click();

        WebElement PrivacyPolicy = driver.findElement(By.name("agree"));
        PrivacyPolicy.click();

//        WebElement SubmitBtn = driver.findElement(By.cssSelector("//*[@id=\"content\"]/form/div/div/input[2]"));
//        SubmitBtn.click();
    }
}
