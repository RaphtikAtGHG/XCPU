package com.github.raphtikatghg.XCPU.components.types;

/**
 * The interrupts enum. Here all the interrupts are stored
 */
public enum Interrupts {
    /**
     * The exit interrupt
     */
    EXIT(0x0001),

    /**
     * The print interrupt
     */
    PRINT(0x0002);

    /**
     * The interrupt variable used to access the interrupt number
     */
    public final int interrupt;

    /**
     * The interrupts enum. Here all the interrupts are stored
     */
    Interrupts(int interrupt) {
        this.interrupt = interrupt;
    }
}
