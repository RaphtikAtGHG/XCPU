package com.github.raphtikatghg.XCPU.exceptions;

/**
 * The runtime throws this exception if the memory is out of reach
 * @since V3.0
 * @author Raphtik@GHG
 */
public class MemoryAccessViolation extends RuntimeException {

    /**
     * Throws this exception if memory is out of reach
     */
    public MemoryAccessViolation() {
        super();
    }

    /**
     * Throws this exception if memory is out of reach
     * @param message Message to put the error
     */
    public MemoryAccessViolation(String message) {
        super(message);
    }

    /**
     * Throws this exception if memory is out of reach
     * @param message Message to put the error
     * @param cause Why'd you do error?
     */
    public MemoryAccessViolation(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Throws this exception if memory is out of reach
     * @param cause Why'd you do error?
     */
    public MemoryAccessViolation(Throwable cause) {
        super(cause);
    }

    /**
     * Throws this exception if memory is out of reach
     * @param message Message to put the error
     * @param cause Why'd you do error?
     * @param enableSuppression Is suppression enabled
     * @param writableStackTrace Is the stack trace writable
     */
    protected MemoryAccessViolation(String message, Throwable cause,
                                      boolean enableSuppression,
                                      boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
