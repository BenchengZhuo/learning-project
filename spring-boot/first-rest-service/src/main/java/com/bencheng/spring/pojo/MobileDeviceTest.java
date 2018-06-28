package com.bencheng.spring.pojo;


import org.junit.Test;

/**
 * Created by Bencheng on 2018/5/10.
 */
public class MobileDeviceTest {

    @Test
    public void test() {
        MobileDevice mobileDevice = new MobileDevice();
        mobileDevice.setIMEI("123123");
        System.out.println(mobileDevice.toString());
    }


}