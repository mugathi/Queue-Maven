
package com.epam.queueimplementation;

import com.epam.queueimplemtation.exceptions.QueueIsEmpty;
import com.epam.queueimplemtation.exceptions.QueueIsFull;
/**
 * Interface for Queue Data Structure.
 * @param <Type> type of specified data type.
 */
public interface QueueInterface<Type> {
    /**
     * checks if the queue is empty.
     * @return boolean.
     */
    boolean isEmpty();

    /**
     * adds the element to the queue.
     * @param value given value of specified type.
     * @throws QueueIsFull when queue is full.
     */
    void enQueue(Type value) throws QueueIsFull;

    /**
     * removes the element from the queue.
     * @return value is found else null.
     * @throws QueueIsEmpty when queue is empty
     */
    Type deQueue() throws QueueIsEmpty;

    /**
     * get the size of queue.
     * @return length;
     */
    int size();
    /**
     * checks if the queue is full.
     * @return boolean.
     */
    boolean isFull();
}
