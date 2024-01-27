package com.github.raphtikatghg.XCPU.components.types;

/**
 * Register class. Very simple
 * @author Raphtik@GHG
 * @since V2.0
 */
public class Register {

    /**
     * The default value of the register
     * @since V2.0
     */
    private int value = 0x0000;

    public Register() {

    }

    /**
     * Set the value of the register.
     * @param value The value to set to.
     *              @since V2.0
     */
    public void set(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the register
     * @return The value of the register
     * @since V2.0
     */
    public int get() {
        return value;
    }

    /**
     * Clears the register
     * @since V2.0
     */
    public void clear() {
        value = 0x0000;
    }

    /**
     * Adds 1 to the value of the register.
     * @since V2.0
     */
    public void add() {
        value += 1;
    }

    /**
     * Subtracts 1 of the value of the register
     * @since V2.0
     */
    public void sub() {
        value -= 1;
    }

}
