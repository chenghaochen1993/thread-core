package com.thread.lesson6.c_6_2.c_6_2_4;

/**
 * Created by cch
 * 2018-04-24 10:46.
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance());
    }
}
