import emulation.CPU;

public class Start {

    public static void main(String[] args) {
        CPU cpu = new CPU(false);
        cpu.loadProgram();
        cpu.printRegisters();
        cpu.executeProgram();
        cpu.printRegisters();
        System.exit(0);
    }
}
