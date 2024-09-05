package org.example.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServicesTest {

    //test method of addTwoNumbers

    int counter= 0;

    @BeforeClass
    public static void init(){
        System.out.println("Before all test cases:");
        System.out.println("Started Test : "+new Date());
//        connection open|file open
    }

    @Test(timeout = 2000)
    public void addTwoNumbersTest() throws InterruptedException {
        for(int i= 0;i<=20;i++){
            counter+=i;
        }
        Thread.sleep(3000 );
        System.out.println("Add Two Numbers");
        int result= CalculatorService.addTwoNumbers(12, 45);
        int expected= 57;
        System.out.println("Counter in First Test Case"+counter);
        Assert.assertEquals(expected, result);
    }
        // actual result

    @Test
    public void sumAnyNumber(){
        for(int i= 0;i<=100;i++){
            counter+=i;
        }
        System.out.println("Second Test Case"+counter);
        System.out.println("Sum Any Two Numbers");
        int result= CalculatorService.sumAnyNumbers(12, 17, 35, 10);
        int expected= 74;
        Assert.assertEquals(expected, result);
    }

    @Before
    public void beforeEach(){
        System.out.println("Before");
        counter= 0;
    }


    @AfterClass
    public static void cleanup(){
        System.out.println("After all test cases");
        System.out.println("End Test cases : " +new Date());
    }

        // expected result

}
