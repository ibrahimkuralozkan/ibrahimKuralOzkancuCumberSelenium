package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){

        System.out.println("\tit is coming from BEFORE");

            }

            @After
    public void tearDown(){

                System.out.println("\tit is coming from AFTER");


            }

    @Before ("@Db")
    public void setUpDb(){

        System.out.println("\tit is coming from BEFORE***DB***");

    }

    @After("@Db")
    public void tearDownDb(){

        System.out.println("\tit is coming from AFTER***DB***");


    }

}
