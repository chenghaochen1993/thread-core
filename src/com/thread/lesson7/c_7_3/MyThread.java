package com.thread.lesson7.c_7_3;

/**
 * 使 线程有序
 * Created by cch
 * 2018-05-03 12:48.
 */

public class MyThread extends Thread {

    private Object lock;
    private String showChar;
    private int showNumPosition;
    private int printCount =0;//统计打印了多少个字母
    volatile private static int addNumber =1;

    public MyThread(Object lock, String showChar, int showNumPosition) {
        this.lock = lock;
        this.showChar = showChar;
        this.showNumPosition = showNumPosition;
    }

    @Override
    public void run() {
        try{
            synchronized (lock){
                while(true){
                    if(addNumber%3 ==showNumPosition){
                        System.out.println("ThreadName= "
                        +Thread.currentThread().getName()
                        +" runConnt= "+addNumber+" "+showChar);
                        lock.notifyAll();
                        addNumber++;
                        printCount++;
                        if(printCount==3){
                            break;
                        }
                    }else{
                        lock.wait();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
