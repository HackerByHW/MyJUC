package com.hw.myjuc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: St
 * Package: com.hw.myjuc
 * Description:
 *线程 操作 资源类**
 * 1. 创建资源类
 * 2. 资源类里创建同步方法、同步代码块
 * 3. 多线程调用
 * @Author Hacker by HW
 * @Create 2024/8/5 18:33
 * @Version 1.0
 */

class Ti{
    int tikNum = 50;

//    public synchronized void sale(){
//        if (tikNum > 0){
//            System.out.println(Thread.currentThread().getName() + "卖出了第" + (tikNum--) + "张票" + "还剩下第:" + tikNum + "张票");
//        }
//    }
    private final Lock lock = new ReentrantLock();
    public void sale(){
        lock.lock();
        try{
            if (tikNum > 0){
            System.out.println(Thread.currentThread().getName() + "卖出了第" + (tikNum--) + "张票" + "还剩下第:" + tikNum + "张票");
        }
        }finally {
            lock.unlock();

        }

    }

}
public class St {
    public static void main(String[] args) {
        Ti ti = new Ti();

        new Thread(() -> {for (int i = 0; i < 51; i++) ti.sale();},"t1").start();
        new Thread(() -> {for (int i = 0; i < 51; i++) ti.sale();},"t2").start();
        new Thread(() -> {for (int i = 0; i < 51; i++) ti.sale();},"t3").start();


        System.out.println("====================== ");
//        new Thread(() -> {for (int i = 0; i < 51; i++) ti.sale();},"t4").start();

    }
}
