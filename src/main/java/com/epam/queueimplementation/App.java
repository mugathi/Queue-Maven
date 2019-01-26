package com.epam.queueimplementation;

/**
 * entry level class.
 */
public final class App {
    /**
     * constructor not called.
     */
    private App() {
        // not called
    }
    /**
     * main class.
     * @param args command-line arguments.
     */
    public static void main(final String[] args) {
        Queue<Integer> queue = new Queue<Integer>(2);
        queue.enQueue(10);
        queue.enQueue(10);
        System.out.println(queue.deQueue());
        queue.enQueue(10);
        queue.deQueue();
        queue.deQueue();
        System.out.println(queue.size());
        queue.enQueue(10);
        System.out.println(queue.size());
    }
}
