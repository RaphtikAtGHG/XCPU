package com.github.raphtikatghg.XCPU.exceptions;

/**
 * The runtime throws this exception if memory is readonly
 * @author Raphtik@GHG
 * @see RuntimeException
 * @since V3.0
 */
public class ReadOnlyMemoryException extends RuntimeException {
    public ReadOnlyMemoryException() {
        super();
    }

    public ReadOnlyMemoryException(String message) {
        super(message);
    }

    public ReadOnlyMemoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadOnlyMemoryException(Throwable cause) {
        super(cause);
    }

    protected ReadOnlyMemoryException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
