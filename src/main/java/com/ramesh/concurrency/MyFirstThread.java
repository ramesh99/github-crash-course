package com.ramesh.concurrency;

import java.util.concurrent.TimeUnit;

/**
 *  1. Introduction of thread programing
 */

public class MyFirstThread {

    public static void main(String[] args) {

        // create the task
        Task task = new Task();

        // create the thread
        Thread thread = new Thread(task); // New State

        // start the thread
        thread.start();
        //thread.start();

        // Q: Why would be needed a sleep here? What is the purpose of this sleep?
        // Example: web crawler
        // A web crawler starts with a URL and downloads the corresponding webpage.
        // It extracts all the links from the webpage.
        // It downloads each linked webpage.
        // Every downloaded page may contain more links.
        // The crawler continues this process recursively.
        // Sending too many HTTP requests can overload the web server.
        // A small delay should be inserted between successive requests.
        // Thread.sleep() is commonly used to introduce this delay.
        // Thread.sleep() is also useful for running background tasks at regular intervals.
        // Thread.sleep() pauses only the current thread, not the entire Java application.

        try {
            // Thread.sleep(3000); // disavantages: 1. It blocks the current thread, preventing it from doing any work during the sleep period. 2. It can lead to unresponsiveness in applications if used excessively. 3. It can make the application less efficient by wasting CPU cycles.
            TimeUnit.SECONDS.sleep(3); // advantages: 1. It improves code readability by clearly indicating the intended sleep duration. 2. It allows for more precise control over the sleep duration, as it can handle different time units (e.g., milliseconds, seconds, minutes). 3. It can make the code more maintainable by allowing for easy adjustments to the sleep duration without changing the underlying logic.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Inside main...........");
    }
}
