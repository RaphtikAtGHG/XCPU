package com.github.raphtikatghg.XCPU.util;

import com.github.raphtikatghg.XCPU.components.CPU;

/**
 * Some Debug Utility.
 * @since V3.2
 * @see CPU
 * @author Raphtik@GHG
 */
public class DbgUtil {

    /**
     * Prints all the CPU Information
     * @since V3.2
     * @param cpu The CPU to print
     * @see CPU
     */
    public static void printCPU( CPU cpu) {
        System.out.println("A: " + String.format("0x%04X", cpu.A.get()));
        System.out.println("C: " + String.format("0x%04X", cpu.C.get()));
        System.out.println("E: " + String.format("0x%04X", cpu.E.get()));
        System.out.println("G: " + String.format("0x%04X", cpu.G.get()));
        System.out.println("PC: " + String.format("0x%04X", cpu.PC.get()));
        System.out.println("SP: " + String.format("0x%04X", cpu.SP.get()));
        System.out.println("FLAGS: " + cpu.flags.getFlags());
    }

}
