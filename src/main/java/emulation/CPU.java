package emulation;

import java.util.Arrays;

public class CPU {

    private final boolean clearOnExitInt;

    // Define CPUs registers
    private final int[] registers = new int[9]; // 9 total
    private final int[] memory = new int[1024 * 1024]; // 1MB memory
    private final int[] stack = new int[65536]; // 64 KB Stack


    // Define registers
    private static int X0 = 0;
    private static int X1 = 1;
    private static int X2 = 2;
    private static int X3 = 3;
    private static int X4 = 4;
    private static int X5 = 5;
    private static int X6 = 6;
    private static int X7 = 7;
    private static int SP = 8;


    public CPU(boolean clearOnExitInt) {
        this.clearOnExitInt = clearOnExitInt;
        Arrays.fill(memory, 0x0000);
        Arrays.fill(registers, 0x0000);
        Arrays.fill(stack, 0x0000);
    }

    // Load a simple program into memory
    public void loadProgram() {
        // Example: INT 0x20 (end of program)
        memory[8] = 0xCD; // Opcode for INT
        memory[9] = 0x20; // Interrupt vector
    }

    // Execute the program
    public void executeProgram() {
        int ip = 0; // Instruction pointer

        while (true) {
            int opcode = memory[ip];

            switch (opcode) {
                case 0x00: // NOP
                    ip += 1;

                case 0x08: // MOV X0, immediate
                    registers[X0] = memory[ip + 1];
                    ip += 2;
                    break;

                case 0x09: // MOV X1, immediate
                    registers[X1] = memory[ip + 1];
                    ip += 2;
                    break;

                case 0x0A: // MOV X2, immediate
                    registers[X2] = memory[ip + 1];
                    ip += 2;
                    break;

                case 0x0B: // MOV X3, immediate
                    registers[X3] = memory[ip + 1];
                    ip += 2;
                    break;

                case 0x0C: // MOV X4, immediate
                    registers[X4] = memory[ip + 1];
                    ip += 2;
                    break;

                case 0x0D: // MOV X5, immediate
                    registers[X5] = memory[ip + 1];
                    ip += 2;
                    break;

                case 0x0E: // MOV X6, immediate
                    registers[X6] = memory[ip + 1];
                    ip += 2;
                    break;

                case 0x0F: // MOV X7, immediate
                    registers[X7] = memory[ip + 1];
                    ip += 2;
                    break;

                // Stack Operations

                case 0x1A: // PUSH, register
                    registers[SP] = 0;
                    stack[registers[SP]] = registers[ip + 1];
                    registers[SP] += 1;
                    ip += 2;
                    break;

                case 0x1B: // POP, register
                    registers[ip + 1] = 0x0000;
                    registers[ip + 1] = stack[registers[SP]];
                    ip += 2;
                    stack[registers[SP]] = 0x0000;
                    registers[SP] -= 1;
                    break;

                // Interrupts

                case 0xCD: // INT
                    int interruptVector = memory[ip + 1];
                    ip += 2;
                    handleInterrupt(interruptVector);
                    return;



                default:
                    System.out.println("Unknown Opcode: " + opcode);
                    return;
            }
        }
    }

    public void printRegisters() {
        System.out.println("Registers:");
        System.out.printf("X0: %04X%n", registers[X0]);
        System.out.printf("X1: %04X%n", registers[X1]);
        System.out.printf("X2: %04X%n", registers[X2]);
        System.out.printf("X3: %04X%n", registers[X3]);
        System.out.printf("X4: %04X%n", registers[X4]);
        System.out.printf("X5: %04X%n", registers[X5]);
        System.out.printf("X6: %04X%n", registers[X6]);
        System.out.printf("X7: %04X%n", registers[X7]);
        System.out.printf("SP: %04X%n", registers[SP]);
    }

    // Handle software interrupts
    public void handleInterrupt(int interruptVector) {
        if (interruptVector == 0x20) {
            if (clearOnExitInt) {
                Arrays.fill(registers, 0x0000);
                Arrays.fill(memory, 0x0000);
            }
        } else if (interruptVector == 0x01) {
            System.out.println("Hi");
        } else {
            System.out.println("Unknown Interrupt:  " + interruptVector);
        }
    }


}
