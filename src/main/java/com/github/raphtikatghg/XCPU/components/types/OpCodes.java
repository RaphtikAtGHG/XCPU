package com.github.raphtikatghg.XCPU.components.types;

import com.github.raphtikatghg.XCPU.components.Executor;

/**
 * The OpCode enum for the Executor
 * @author Raphtik@GHG
 * @since V3.0
 * @see Executor
 */
public enum OpCodes {

    /**
     * Loads the value in <i>PC + 1</i> into the <i>A</i> Register
     * @since V3.0
     */
    LDA(0x0001),

    /**
     * Loads the value in <i>PC + 1</i> into the <i>c</i> Register
     * @since V3.0
     */
    LDC(0x0002),

    /**
     * Loads the value in <i>PC + 1</i> into the <i>E</i> Register
     * @since V3.0
     */
    LDE(0x0003),

    /**
     * Loads the value in <i>PC + 1</i> into the <i>G</i> Register
     * @since V3.0
     */
    LDG(0x0004),


    /**
     * Stores the value in the <i>A</i> Register into the data-memory at <i>PC + 1</i>
     * @since V3.0
     */
    STA(0x000A),

    /**
     * Stores the value in the <i>C</i> Register into the data-memory at <i>PC + 1</i>
     * @since V3.0
     */
    STC(0x000B),

    /**
     * Stores the value in the <i>E</i> Register into the data-memory at <i>PC + 1</i>
     * @since V3.0
     */
    STE(0x000C),

    /**
     * Stores the value in the <i>G</i> Register into the data-memory at <i>PC + 1</i>
     * @since V3.0
     */
    STG(0x000D),

    /**
     * Interrupt OpCode
     * @since V3.0
     */
    INT(0x1000),


    /**
     * NOP OpCode: Does nothing
     * @since V3.0
     */
    NOP(0x2000),

    /**
     * Jumps to the address <i>PC + 1</i>
     * @since V3.0
     */
    JMP(0x3000),

    /**
     * Pushes the register <i>PC + 1</i> to the stack
     */
    PUSH(0x4000),

    /**
     * Pops the value at <i>SP</i> into the register in <i>PC + 1</i>
     */
    POP(0x5000);

    /**
     * OpCode variable
     */
    public final int OC;

    /**
     * Main constructor
     * @param oc Used to get the data
     */
    OpCodes(int oc) {
        this.OC = oc;
    }

}
