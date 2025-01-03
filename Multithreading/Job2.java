package com.tka.dec30;



class Task1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task 1 is running...");
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Task 1 completed.");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task 2 is running...");
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Task 2 completed.");
    }
}

public class Job2 {
    public static void main(String[] args) {
        // Creating Runnable objects
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        
        // Creating threads for each task
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Starting t1 first
        t1.start();
        try {
            // Ensuring t1 completes before starting t2
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Starting t2 after t1 completes
        t2.start();
        
        // Main thread waits for t2 to finish (optional)
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Both tasks completed.");
    }
}

