package com.thread.lesson3.c_3_1.c_3_1_3;

/**
 * Created by cch
 * 2018-04-10 10:54.
 */

public class Test2 {
    public static void main(String[] args) {
        try{
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock){
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下的代码");
            }
            System.out.println("syn下面的代码");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
