package com.github.raphtikatghg.XCPU.components;

/**
 * Component Factory for all the components
 * @since V3.0
 * @author Raphtik@GHG
 */
public class ComponentFactory {

    /**
     * Create a new CPU to the caller
     * @return A new CPU
     * @see CPU
     */
    public static CPU getCPU() {
        return new CPU();
    }

    /**
     * Constructor of the ComponentFactory class.
     */
    public ComponentFactory() {

    }

    /**
     * Returns a new piece of memory to the user
     * @param Size The desired size of the memory
     * @param ReadOnly If the memory is read only
     * @return The new piece of memory
     * @see Memory
     */
    public static Memory getMemory(int Size, boolean ReadOnly) {
        return new Memory(ReadOnly, Size);
    }
}
