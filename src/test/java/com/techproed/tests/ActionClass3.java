package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass3 extends TestBase {
    /*



Send iPhone X prices => convert small letter capital vice versa.
Highlight the search box by double clicking
     */


    //Create test method : keysUpDown()
    @Test
    public void keysUpDown() throws InterruptedException {

        //Go to google
        driver.get("https://www.google.com/");

        WebElement searchBox=driver.findElement(By.name("q"));
        Actions actions=new Actions(driver);
        actions
                .keyDown(searchBox, Keys.SHIFT)
                .sendKeys("iphone X prices")
                .keyUp(searchBox, Keys.SHIFT)
                .perform();

        Thread.sleep(8000);



    }


    @Test
    public void keysUpDown1() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions
                .keyDown(searchBox, Keys.SHIFT)//Pressing shift on the search box element
                .sendKeys("iPhone X prices")//typing in the box
                .keyUp(searchBox,Keys.SHIFT)//we have to un press from the shift button
                .perform();// performing the action
        Thread.sleep(8000);
    }
}
