package com.github.raphtikatghg.XCPU.components.types;

import java.util.Arrays;


/**
 * The CPUs Stack, which is 64MB big in this case
 * @author Raphtik@GHG
 * @see Register
 * @since V3.2
 */
public class Stack {

    /**
     * Stack Pointer Integer Variable
     * @since V3.2
     */
    private int sp;

    /**
     * The size of the stack in Bytes
     * @since V3.2
     */
    private final int STACK_SIZE = 65536;

    /**
     * Main data array. Every value can be 32-Bit
     * @since V3.2
     */
    private final int[] data = new int[STACK_SIZE];

    /**
     * The constructor of the stack
     * @param SP The stack pointer declared in the CPU
     * @see com.github.raphtikatghg.XCPU.components.types.Register
     * @see com.github.raphtikatghg.XCPU.components.CPU
     * @since V3.2
     */
    public Stack( Register SP) {
        sp = SP.get();
        reset();
    }

    /**
     * Clears all the data in the stack
     * @since V3.2
     */
    private void clearAll() {
        Arrays.fill(data, 0x0000);
    }

    /**
     * Clears the stack at a specified index.
     * @param addr Index in the data array
     * @since V3.2
     */
    private void clearAddr(int addr) {
        data[addr] = 0x0000;
    }

    /**
     * Pushes a register to the stack
     * @param register The register to push
     * @see com.github.raphtikatghg.XCPU.components.types.Register
     * @since V3.2
     */
    public void push( Register register) {
        data[sp] = register.get();
        sp += 1;
    }

    /**
     * Pops the latest value on the stack into a register
     * @param register The Register to pop into.
     * @see com.github.raphtikatghg.XCPU.components.types.Register
     * @since V3.2
     */
    public void pop( Register register) {
        register.set(data[sp]);
        clearAddr(sp);
        sp -= 1;
    }

    /**
     * Resets the stack
     * @since V3.2
     */
    public void reset() {
        sp = 0;
        clearAll();
    }

}
