package com.thread.lesson3.c_3_1.c_3_1_5;

/**
 * Created by cch
 * 2018-04-10 16:38.
 */

public class ThreadA extends Thread{
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
