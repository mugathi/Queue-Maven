
package com.epam.queueimplementation;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.epam.queueimplemtation.exceptions.QueueIsEmpty;
import com.epam.queueimplemtation.exceptions.QueueIsFull;

/**
 * @author Pavan_Mugathi
 *
 */
class QueueTest {
    /**
     * creates an instance of queue.
     */
    private static Queue<Integer> queue = new Queue<Integer>(2);

    /**
     * test for removing from empty queue.
     */
    @Test
    void removeFromEmptyQueueTest() {
        Assertions.assertThrows(QueueIsEmpty.class, () -> queue.deQueue());
    }

    /**
     * test for order of removing elements from the queue.
     * @throws Exception when removing from empty queue.
     */
    @Test
    void deQueueOrderTest() throws QueueIsEmpty {
        queue.enQueue(10);
        queue.enQueue(20);
        assertEquals(Integer.valueOf(10), queue.deQueue());
        assertEquals(Integer.valueOf(20), queue.deQueue());
    }

    /**
     * when elements are added and removed test for removing from empty queue .
     * @throws Exception when removing from empty queue.
     */
    @Test
    void emptyQueuewhenElementsRemovedTest() throws QueueIsEmpty {
        queue.enQueue(10);
        assertEquals(Integer.valueOf(10), queue.deQueue());
        Assertions.assertThrows(QueueIsEmpty.class, () -> queue.deQueue());
    }

    /**
     * To test for size of queue.
     * @throws QueueIsEmpty when removing from empty queue.
     */
    @Test
    void queueSizeTest() throws QueueIsEmpty {
        queue.enQueue(40);
        queue.deQueue();
        assertEquals(0, queue.size());
    }

    /**
     * test for the empty Queue.
     */
    @Test
    void isQueueEmptyTest() {
        assertTrue(queue.isEmpty());
    }

    /**
     * test for the queue when  not empty.
     * @throws QueueIsEmpty when removing from empty queue.
     */
    @Test
    void queueNotEmptyTest() throws QueueIsEmpty {
        queue.enQueue(10);
        assertFalse(queue.isEmpty());
        queue.deQueue();
    }
    
    /**
     * test for the queue when full.
     * @throws QueueIsFull when queue is full.
     * @throws QueueIsEmpty when queue is empty.
     */
    @Test
    void queueIsFullTest() throws QueueIsFull,QueueIsEmpty{
      queue.enQueue(10);
      queue.enQueue(20);
      Assertions.assertThrows(QueueIsFull.class, () -> queue.enQueue(20));
      queue.deQueue();
      queue.deQueue();
    }
    /**
     * App class Test.
     */
    @Test
    void appTest() {
    	App.main(null);	
    }
}

