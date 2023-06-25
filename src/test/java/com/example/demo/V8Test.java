package com.example.demo;

import com.eclipsesource.v8.V8;
import org.junit.Test;

public class V8Test {
    @Test
    public void test_runScript() {
        V8 v8 = V8.createV8Runtime();
        int result = v8.executeIntegerScript("1+1");
        System.out.println("Js run result = " + result);
        v8.release();
    }
}
