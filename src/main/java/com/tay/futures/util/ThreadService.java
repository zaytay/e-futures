package com.tay.futures.util;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ThreadService {
    private ExecutorService executorService;
    private static ThreadService instance =new ThreadService();

    private ThreadService(){
        int size=Runtime.getRuntime().availableProcessors()+1;
        executorService = Executors.newFixedThreadPool(size);
        //executorService = Executors.newCachedThreadPool();
    }

    public static ThreadService getInstance(){
        return instance;
    }

    public void execute(Runnable runnable){
        executorService.execute(runnable);
    }

    public void shutdown(){
        executorService.shutdown();
    }


    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return executorService.awaitTermination(timeout,unit);
    }


}
