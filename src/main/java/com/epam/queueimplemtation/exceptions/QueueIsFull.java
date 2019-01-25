
package com.epam.queueimplemtation.exceptions;

/**
 * @author Pavan_Mugathi
 *
 */
@SuppressWarnings("serial")
public class QueueIsFull extends RuntimeException {
    /**
     * message to show as exception.
     */
    private static final String MESSAGE = "Queue is Full";

    /**
     * constructor that call super class and throw excpeption.
     */
    public QueueIsFull() {
        super(MESSAGE);
    }
}
