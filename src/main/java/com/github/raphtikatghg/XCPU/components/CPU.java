package com.github.raphtikatghg.XCPU.components;

import com.github.raphtikatghg.XCPU.components.types.Flags;
import com.github.raphtikatghg.XCPU.components.types.Register;
import com.github.raphtikatghg.XCPU.components.types.Stack;

/**
 * Central Processing Unit of the System
 * The CPU class contains other datatype like: Registers, Flags and a Stack
 * @see com.github.raphtikatghg.XCPU.components.types.Register
 * @see com.github.raphtikatghg.XCPU.components.types.Flags
 * @see com.github.raphtikatghg.XCPU.components.types.Stack
 * @author Raphtik@GHG
 * @since V3.0
 */
public class CPU {

    /**
     * General Purpose Registers.
     * @see com.github.raphtikatghg.XCPU.components.types.Register
     * @since V3.0
     */
    public Register A, C, E, G;

    /**
     * Program Counter Register
     * @see com.github.raphtikatghg.XCPU.components.types.Register
     * @since V3.1
     */
    public Register PC = new Register();

    /**
     * Stack Pointer Register.
     * @see com.github.raphtikatghg.XCPU.components.types.Register
     * @since V3.2
     */
    public Register SP = new Register();

    /**
     * Flags for the CPU
     * @see com.github.raphtikatghg.XCPU.components.types.Flags
     * @since V3.2
     */
    public Flags flags = new Flags();

    /**
     * Stack of the CPU.
     * @see com.github.raphtikatghg.XCPU.components.types.Stack
     * @since V3.2
     */
    public Stack stack = new Stack(SP);

    /**
     * CPU Constructor
     * @see com.github.raphtikatghg.XCPU.components.types.Register
     * @since V3.0
     */
    public CPU() {
        A = new Register();
        C = new Register();
        E = new Register();
        G = new Register();
        reset();

    }

    /**
     * Reset function
     * @since V3.0
     */
    public void reset() {
        A.set(0);
        C.set(0);
        E.set(0);
        G.set(0);
        PC.set(0x000000);
        SP.set(0x0000);
        flags.reset();
        stack.reset();
    }
}
