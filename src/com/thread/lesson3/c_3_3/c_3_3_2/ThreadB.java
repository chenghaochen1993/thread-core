package com.thread.lesson3.c_3_3.c_3_3_2;

/**
 * Created by cch
 * 2018-04-13 15:06.
 */

public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadB" + (i + 1));
                System.out.println("ThreadB get value"+Tools.t1.get());
                Thread.sleep(200);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
