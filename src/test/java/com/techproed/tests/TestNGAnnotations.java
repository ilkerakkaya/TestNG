package com.techproed.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGAnnotations {

    /*



   4. Skip test2
   5. print the test in this order: Test3, Test4, Test1
     */


   // 1. create a method: setUp using @BeforeMethod annotation and print "This is BeforeMethod"
    @BeforeMethod
    public void setUp(){
        System.out.println("this is before method");
    }

    //2. Create a method: tearDown using @AfterMethod annotation and print "This is @AfterMethod"

    @AfterMethod
    public void tearDown(){
        System.out.println("This is @aftermethod");
    }

    // 3. Create 3 TEST METHODS: test1,test2,test3,test4 and print "Test1", "Test2", "Test3","Test4" respectively

    @Test(priority = 10)
    public void test1(){
        System.out.println("This1");
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("This2 ");
    }
    @Test(priority = 6)
    public void test3(){
        System.out.println("This3");
    }
    @Test(priority = 8)
    public void test4(){
        System.out.println("This4");
    }


}
