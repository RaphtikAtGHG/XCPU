package com.github.raphtikatghg.XCPU.exceptions;

/**
 * The runtime throws this exception if the memory is out of reach
 * @since V3.0
 * @author Raphtik@GHG
 */
public class MemoryAccessViolation extends RuntimeException {
    public MemoryAccessViolation() {
        super();
    }

    public MemoryAccessViolation(String message) {
        super(message);
    }

    public MemoryAccessViolation(String message, Throwable cause) {
        super(message, cause);
    }

    public MemoryAccessViolation(Throwable cause) {
        super(cause);
    }

    protected MemoryAccessViolation(String message, Throwable cause,
                                      boolean enableSuppression,
                                      boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
