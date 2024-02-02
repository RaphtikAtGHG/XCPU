package com.github.raphtikatghg.XCPU.components.types;

/**
 * The Flags class used in the CPU
 * @see com.github.raphtikatghg.XCPU.components.CPU
 * @author Raphtik@GHG
 * @since V3.0
 */
public class Flags {

    /**
     * All the zero flags for all registers
     * @since V3.0
     */
    protected boolean ZeroA, ZeroC, ZeroE, ZeroG;

    /**
     * Constructor for the Flags class
     * @since V3.0
     */
    public Flags() {

    }

    /**
     * Resets all the flags.
     * <b>PLEASE ONLY USE IF YOU ARE RESETTING THE CPU TOO!!</b>
     * @since V3.0
     */
    public void reset() {
        ZeroA = false;
        ZeroC = false;
        ZeroE = false;
        ZeroG = false;
    }

    /**
     * Return the flags in the set in the CPU
     * @return The flags set in the CPU
     */
    public String getFlags() {
        return "ZA=" + ZeroA + " ZC=" + ZeroC + " ZE=" + ZeroE + " ZG=" + ZeroG;
    }
}
