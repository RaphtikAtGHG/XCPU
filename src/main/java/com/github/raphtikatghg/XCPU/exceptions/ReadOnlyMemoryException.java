package com.github.raphtikatghg.XCPU.exceptions;

/**
 * The runtime throws this exception if memory is readonly
 * @author Raphtik@GHG
 * @see RuntimeException
 * @since V3.0
 */
public class ReadOnlyMemoryException extends RuntimeException {

    /**
     * Throws this exception if you try to write to memory if its read-only
     */
    public ReadOnlyMemoryException() {
        super();
    }

    /**
     * Throws this exception if you try to write to memory if its read-only
     * @param message Message to put the error
     */
    public ReadOnlyMemoryException(String message) {
        super(message);
    }

    /**
     * Throws this exception if you try to write to memory if its read-only
     * @param message Message to put the error
     * @param cause Why'd you do error?
     */
    public ReadOnlyMemoryException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Throws this exception if you try to write to memory if its read-only
     * @param cause Why'd you do error?
     */
    public ReadOnlyMemoryException(Throwable cause) {
        super(cause);
    }

    /**
     * Throws this exception if you try to write to memory if its read-only
     * @param message Message to put the error
     * @param cause Why'd you do error?
     * @param enableSuppression Is suppression enabled
     * @param writableStackTrace Is the stack trace writable
     */
    protected ReadOnlyMemoryException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
