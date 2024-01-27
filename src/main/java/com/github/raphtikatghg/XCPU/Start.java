package com.github.raphtikatghg.XCPU;

import com.github.raphtikatghg.XCPU.components.CPU;
import com.github.raphtikatghg.XCPU.util.DbgUtil;

public class Start {

    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.reset();
        DbgUtil.printCPU(cpu);
    }
}
