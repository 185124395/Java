package com.southeast.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Exexutor管理多个异步任务的执行，而无需程序员显示的管理线程的生命周期。
 * （异步：表示多个任务执行不干扰，不需要进行同步操作。）
 *
 * 主要有三种Executor:
 * CachedThreadPool:一个任务创建一个线程；
 * FixedThreadPool:所有任务只能使用固定大小的线程；
 * SingleThreadExecutor:相当于大小为1的FixedThreadPool
 */
public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService service= Executors.newCachedThreadPool();
        //CachedThreadPool:一个任务创建一个线程；

        for(int i=0;i<5;i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("MyRunnable");
                }
            });
        }

        service.shutdown();
    }
}
