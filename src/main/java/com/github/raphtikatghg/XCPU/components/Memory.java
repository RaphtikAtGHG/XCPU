package com.github.raphtikatghg.XCPU.components;


import com.github.raphtikatghg.XCPU.exceptions.MemoryAccessViolation;
import com.github.raphtikatghg.XCPU.exceptions.ReadOnlyMemoryException;

/**
 * The memory class
 * @since V3.0
 * @author Raphtik@GHG
 */
public class Memory {

    /**
     * Maybe the memory is ReadOnly
     * @since V3.0
     */
    private boolean RO = false;

    /**
     * Checks if the memory was written to.
     * @since V3.0
     */
    private boolean HasBeenWrittenTo = false;

    /**
     * Main Data Variable
     * @since V3.0
     */
    private final int[] data;

    /**
     * Main Constructor of the Memory class
     * @param ReadOnly Defines if the memory can be only written to only once
     * @param size Size of the Memory in Bytes
     * @since V3.0
     */
    public Memory(boolean ReadOnly, int size) {
        this.RO = ReadOnly;
        data = new int[size];
    }

    /**
     * Writes the value to the address
     * @param address The address to write to
     * @param value The value to write to the address
     */
    public void write(int address, int value) {

        if (RO && HasBeenWrittenTo) {
            throw new ReadOnlyMemoryException("The memory is read-only and has been written to once!");
        } else if (RO) {
            System.out.println("This is the only time you can write to this memory!");
            HasBeenWrittenTo = true;
        } else if (HasBeenWrittenTo) {
            data[address] = value;
        } else {
            data[address] = value;
        HasBeenWrittenTo = true;
    }

    }

    /**
     * Reads data from the address
     * @param address Address to read from
     * @return Data at address
     */
    public int read(int address) {
        return data[address];
    }

    /**
     * Makes the memory read-only
     */
    public void makeReadOnly() {
        RO = true;
    }
}
