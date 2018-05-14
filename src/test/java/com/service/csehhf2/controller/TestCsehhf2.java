package com.service.csehhf2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCsehhf2 {

        Csehhf2Delegate csehhf2Delegate = new Csehhf2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = csehhf2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}