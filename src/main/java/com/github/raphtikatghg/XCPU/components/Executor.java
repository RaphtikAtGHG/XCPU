package com.github.raphtikatghg.XCPU.components;

/**
 * Executes code written in Memory.
 * @see Memory
 * @see CPU
 * @since V3.0
 * @author Raphtik@GHG
 */
public class Executor {

    /**
     * The CPU is just the CPU.
     * @see CPU
     * @since V3.0
     */
    private CPU cpu;

    /**
     * The memory where the instructions are stored-
     * @since V3.0
     * @see Memory
     */
    private Memory opcodeMemory;

    /**
     * The memory which is used to store data
     * @see Memory
     * @since V3.0
     */
    private Memory dataMemory;


}
