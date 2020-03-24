package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecthelloworld {

        ProjecthelloworldDelegate projecthelloworldDelegate = new ProjecthelloworldDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecthelloworldDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}