package com.thread.lesson3.c_3_4.c_3_4_1;

/**
 * 使用InheritableThreadLocal类可以让子线程从父线程中取得值
 * Created by cch
 * 2018-04-13 15:42.
 */

public class Run
{
    public static void main(String[] args) {
        try{
            for(int i=0;i<10;i++){
                System.out.println("main get value"+Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
