package com.demo.test.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
/**
    @Test(groups="group1")
    public void test1() {
        System.out.println("test1 from group1");
        Assert.assertTrue(true);
    }

    @Test(groups="group1")
    public void test11() {
        System.out.println("test11 from group1");
        Assert.assertTrue(true);
    }

    @Test(groups="group2")
    public void test2()
    {
        System.out.println("test2 from group2");
        Assert.assertTrue(true);
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("afterTest");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite");
    }

    //只对group1有效，即test1和test11
    @BeforeGroups(groups="group1")
    public void beforeGroups()
    {
        System.out.println("beforeGroups");
    }

    //只对group1有效，即test1和test11
    @AfterGroups(groups="group1")
    public void afterGroups()
    {
        System.out.println("afterGroups");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("afterMethod");
    }
**/
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1 / 0;
        System.out.println("After division the value of i is :"+ i);
    }

    //有时候我们写的用例没准备好，或者该次测试不想运行此用例，那么删掉显然不明智，
    // 那么就可以通过注解@Test(enabled = false)来将其忽略掉，此用例就不会运行了，如下范例：
    @Test(enabled=false)
    public void TestNgLearn1() {
        System.out.println("this is TestNG test case1");
    }

    @Test
    public void TestNgLearn2() {
        System.out.println("this is TestNG test case2");
    }

}
