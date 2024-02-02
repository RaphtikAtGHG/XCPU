package com.github.raphtikatghg.XCPU;


import com.github.raphtikatghg.XCPU.components.CPU;
import com.github.raphtikatghg.XCPU.components.ComponentFactory;
import com.github.raphtikatghg.XCPU.components.Executor;
import com.github.raphtikatghg.XCPU.components.Memory;
import com.github.raphtikatghg.XCPU.components.types.OpCodes;
import com.github.raphtikatghg.XCPU.util.DbgUtil;

import static com.github.raphtikatghg.XCPU.components.types.OpCodes.LDA;
import static com.github.raphtikatghg.XCPU.components.types.OpCodes.LDC;

/**
 * Idk why javadoc wants that
 */
public class Start {

    /**
     * Idk why javadoc wants that
     * @param args args
     */
    public static void main(String[] args) {
        CPU cpu = ComponentFactory.getCPU();
        Memory ocMem = ComponentFactory.getMemory(100, false);
        Memory dataMem = ComponentFactory.getMemory(100, false);
        Executor executor = new Executor(cpu, ocMem, dataMem);

        dataMem.write(1, LDC.OC);
        dataMem.write(2, 0x0002);
        dataMem.write(3, 0x5432);

        executor.execute();

        DbgUtil.printCPU(cpu);
    }
    /**
     * Idk why javadoc wants that
     */
    public Start() {

    }
}
