package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass1 extends TestBase {


    @Test
    public void contextClickMethod() throws InterruptedException {
        //contextClick=right click
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //When u use right click on the box
        //Creating actions object so actions control the driver
        Actions actions=new Actions(driver);

        //Locate the Box
        WebElement box=driver.findElement(By.id("hot-spot"));

        //Right click on the alert. Dont forget to use perform
        actions.contextClick(box).perform();
        Thread.sleep(5000);

        //Then verify the alert message is “You selected a context menu”
        String actualAlertMessage=driver.switchTo().alert().getText();
        String expectedAlertMessage="You selected a context menu";
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);

        //    Then accept the alert
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

    }

}
