
package com.epam.queueimplementation;

import com.epam.queueimplemtation.exceptions.QueueIsEmpty;
import com.epam.queueimplemtation.exceptions.QueueIsFull;

/**
 * class for queue data structure.
 * @param <Type> type of specified data type.
 */
public class Queue<Type> implements QueueInterface<Type> {
    /**
     * first Node in queue.
     */
    private Node<Type> first;
    /**
     * last Node in queue.
     */
    private Node<Type> last;
    /**
     * length of queue.
     */
    private int length = 0;
    /**
     * maximum size of queue.
     */
    private int size = 0;
    /**
     * constructor to fix the maximum size of queue.
     * @param givenSize size of queue.
     */
    Queue(final int givenSize) {
        size = givenSize;
    }
    /**
     * checks if the queue is empty.
     * @return boolean.
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * adds the element to the queue.
     * @param value given value of specified type.
     * @throws QueueIsFull when queue is full.
     */
    public void enQueue(final Type value) throws QueueIsFull {
        if (isFull()) {
            throw new QueueIsFull();
        } else {
            Node<Type> newNode = new Node<Type>(value);
            if (isEmpty()) {
                first = newNode;
                last = first;
            } else {
                last.setNext(newNode);
                last = last.getNext();
            }
            length++;
        }
    }

    /**
     * removes the element from the queue.
     * @return value is found else null.
     * @throws QueueIsEmpty when queue is empty
     */
    public Type deQueue() throws QueueIsEmpty {
        Type value = null;
        if (isEmpty()) {
            throw new QueueIsEmpty();
        } else {
            value = first.getValue();
            first = first.getNext();
            if (isEmpty()) {
                last = null;
            }
            length--;
        }
        return value;
    }

    /**
     * get the size of queue.
     * @return length;
     */
    public int size() {
        return length;
    }

    /**
     * checks if the queue is full.
     * @return boolean.
     */
    public boolean isFull() {
        return length == size;
    }
}

