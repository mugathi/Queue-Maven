
package com.epam.queueimplemtation.exceptions;
/**
 * class to show QueueIsEmpty Exception.
 */
@SuppressWarnings("serial")
public class QueueIsEmpty extends RuntimeException {
    /**
     * message to show as exception.
     */
    private static final String MESSAGE = "Queue is empty";
    /**
     * constructor that call super class and throw excpeption.
     */
    public QueueIsEmpty() {
        super(MESSAGE);
    }
}
