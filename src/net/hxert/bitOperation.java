package net.hxert;

/**
 * Use Byte instead of your Boolean.
 * @author Hxert
 * @version 1
 * time Aug 16, 2017
 */

public class bitOperation{

    private bitOperation(){
        
    }
    
    private byte bits = Constants.NONE;    //INIT 0000 0000
    
    /**
     * Set the value of a bit.
     * @param position
     *      The position of the Bit to be modified.
     * @param bool 
     *      The value to be assigned.
     */
    public void set(byte position, boolean bool){
        if(bool){
            bits |= position;
            /*
                E.g:            1010 0000
                POSITION_FIVE = 0000 0100
                |=              1010 0100
            */
        }else{
            bits &= ~position;
            /*
                E.g:             0101 0000
                POSITION_THREE = 0001 0000
                ~=               1110 1111
                &=               0100 0000
            */
        }
    }
    
    /**
     * Get the value of a bit.
     * @param position
     *      The position of the bit to get.
     * @return The value of a bit.
     */
    public boolean get(byte position){
        return !((bits&position) == Constants.NONE);
        /*
            E.g:           0100 0110
            POSITION_ONE = 0100 0000
            &=             0100 0000
            Constants.NONE 0000 0000
            == : false
            ! : true
        
            return true;
        
            E.g:           0100 0110
            POSITION_TWO = 0010 0000
            &=             0000 0000
            Constants.NONE 0000 0000
            == : true
            ! : false
        
            return false;
        */
    }
    
    /**
     * Use the new Byte to override Bits.
     * @param newBits 
     *      The value to be assigned.
     */
    public void setAll(byte newBits){
        this.bits = newBits;
    }
    
    /**
     * Output as a String.
     * @return String.
     */
    @Override
    public final String toString(){
        /*
            E.g:
                bits = 0x8(0000 1000)
                toString: 0000 1000(String)
        */
        return
            (byte)((this.bits >> 7) & 0x1)+
            (byte)((this.bits >> 6) & 0x1)+
            (byte)((this.bits >> 5) & 0x1)+
            (byte)((this.bits >> 4) & 0x1)+
            " "+
            (byte)((this.bits >> 3) & 0x1)+
            (byte)((this.bits >> 2) & 0x1)+
            (byte)((this.bits >> 1) & 0x1)+
            (byte)((this.bits) & 0x1);
    }
}
