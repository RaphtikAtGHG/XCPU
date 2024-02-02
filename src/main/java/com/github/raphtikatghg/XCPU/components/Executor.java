package com.github.raphtikatghg.XCPU.components;

import com.github.raphtikatghg.XCPU.components.types.InterruptHandler;
import com.github.raphtikatghg.XCPU.components.types.OpCodes;

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

    /**
     * Executes the code in the opcodeMemory
     * @param cpu The CPU that is used to execute
     * @param opcodeMemory The memory where the code is stored
     * @param dataMemory The memory for data like when using <i>STA</i>
     */
    public Executor(CPU cpu, Memory opcodeMemory, Memory dataMemory) {
        this.cpu = cpu;
        this.opcodeMemory = opcodeMemory;
        this.dataMemory = dataMemory;
        this.dataMemory.reset();
    }

    /**
     * Executes the code in opcode memory
     * @see OpCodes
     */
    public void execute() {
        while (true) {
            if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.NOP.OC) {
                cpu.PC.add();
            } else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.LDA.OC) {
                cpu.A.set(opcodeMemory.read(cpu.PC.get() + 1));
                cpu.PC.add();
                cpu.PC.add();
            } else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.LDC.OC) {
                cpu.C.set(opcodeMemory.read(cpu.PC.get() + 1));
                cpu.PC.add();
                cpu.PC.add();
            } else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.LDE.OC) {
                cpu.E.set(opcodeMemory.read(cpu.PC.get() + 1));
                cpu.PC.add();
                cpu.PC.add();
            } else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.LDG.OC) {
                cpu.G.set(opcodeMemory.read(cpu.PC.get() + 1));
                cpu.PC.add();
                cpu.PC.add();
            }  else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.STA.OC) {
                dataMemory.write(cpu.A.get(), cpu.PC.get() + 1);
                cpu.PC.add();
                cpu.PC.add();
            } else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.STC.OC) {
                dataMemory.write(cpu.C.get(), cpu.PC.get() + 1);
                cpu.PC.add();
                cpu.PC.add();
            } else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.STE.OC) {
                dataMemory.write(cpu.E.get(), cpu.PC.get() + 1);
                cpu.PC.add();
                cpu.PC.add();
            } else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.STG.OC) {
                dataMemory.write(cpu.G.get(), cpu.PC.get() + 1);
                cpu.PC.add();
                cpu.PC.add();
            } else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.JMP.OC) {
                int jmpAddress = cpu.PC.get() + 1;
                cpu.PC.add();
                cpu.PC.add();
                cpu.PC.set(jmpAddress);
            } else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.POP.OC) {

                switch (cpu.PC.get() + 1) {
                    case 0: cpu.stack.pop(cpu.A);
                    case 1: cpu.stack.pop(cpu.C);
                    case 2: cpu.stack.pop(cpu.E);
                    case 3: cpu.stack.pop(cpu.G);
                }


            } else if (opcodeMemory.getData()[cpu.PC.get()] == OpCodes.PUSH.OC) {

                switch (cpu.PC.get() + 1) {
                    case 0: cpu.stack.push(cpu.A);
                    case 1: cpu.stack.push(cpu.C);
                    case 2: cpu.stack.push(cpu.E);
                    case 3: cpu.stack.push(cpu.G);
                }

            } else if (opcodeMemory.getData()[cpu.PC.get()]  == OpCodes.INT.OC) {
                InterruptHandler ir = new InterruptHandler();

                if (ir.handle(opcodeMemory.read(cpu.PC.get() + 1), cpu.PC.get() + 2) == 1) {
                    dataMemory.reset();
                    opcodeMemory.reset();
                    cpu.PC.clear();
                    return;
                }
            } else {
                // Hmm We do not care
            }


        }
    }


}
