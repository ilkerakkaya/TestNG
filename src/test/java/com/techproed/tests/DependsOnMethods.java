package com.techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class DependsOnMethods {

    @Test
    public void logIn(){
        System.out.println("Log In Test");
    }

    @Test
    public void homePage(){
        System.out.println("Home Page");

       Assert.assertEquals(3,4);

    }

    @Test (dependsOnMethods = "homePage")
    public void searchTest(){
        System.out.println("Search Test");
    }

    @Test
    public void verifyTheResults(){
        System.out.println("Result Test");
    }
}
