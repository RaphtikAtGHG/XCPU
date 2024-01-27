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
     * @see CPU
     */
    public static void printCPU( CPU cpu) {
        System.out.println("A: " + cpu.A.get());
        System.out.println("D: " + cpu.C.get());
        System.out.println("E: " + cpu.E.get());
        System.out.println("G: " + cpu.G.get());
        System.out.println("PC: " + cpu.PC.get());
        System.out.println("SP: " + cpu.SP.get());
        System.out.println("FLAGS:" + cpu.flags.getFlags());
    }

}
