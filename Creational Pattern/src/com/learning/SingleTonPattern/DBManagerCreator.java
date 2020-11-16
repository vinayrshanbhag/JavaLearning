package com.learning.SingleTonPattern;


import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DBManager1 {

    private static DBManager1 instance;

    private DBManager1() throws InterruptedException {

        if(instance!=null){
            throw new RuntimeException ();
        }
        System.out.println("created...");

    }

    public String toString() {
        return String.format("%s %d", getClass().getName(), hashCode());
    }

    public static DBManager1 getInstance() throws InterruptedException {

        if(instance ==null){
            System.out.println("Checking again");
            synchronized (DBManager1.class) {
                if(instance == null){
                    instance = new DBManager1();
                }
            }
        }
        return  instance;
    }
}

public class DBManagerCreator {
    public static void main(String[] args) throws InterruptedException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
//        createDBInstance();
//        createDBInstance();
//        Constructor<DBManager> constructor=  DBManager.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		DBManager dbManager2 = (DBManager)constructor.newInstance();
//		System.out.println(dbManager2);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(DBManagerCreator::createDBInstance);
        executorService.submit(DBManagerCreator::createDBInstance);

        Thread.sleep(5000);

        executorService.shutdown();
    }


    public static void createDBInstance()  {

        try {
            System.out.println(DBManager1.getInstance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}






