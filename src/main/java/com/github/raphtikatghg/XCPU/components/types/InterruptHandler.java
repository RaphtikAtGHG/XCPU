package com.github.raphtikatghg.XCPU.components.types;

import java.util.Objects;

/**
 * The interrupt handler. This class handles the interrupts.
 * @see Interrupts
 */
public class InterruptHandler {

    /**
     * The interrupt handler. This class handles the interrupts.
     * @see Interrupts
     */
    public InterruptHandler() {

    }

    /**
     * Main handle function that well handles the interrupts
     * @param interrupt The interrupt to handle
     * @param nextByteInMemory The next byte. Used for information
     * @return 1 If the interrupt is EXIT, 0 if its any other and 0x0060 if its empty
     */
    public int handle(int interrupt, int nextByteInMemory) {
        if (interrupt == Interrupts.EXIT.interrupt) {
            return 1;
        } else if (interrupt == Interrupts.PRINT.interrupt) {
            System.out.println(Objects.toString(nextByteInMemory));
            return 0;
        } else {
            return 0x0060;
        }
    }

}
