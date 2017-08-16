package net.hxert;

public final class Constants {
    private Constants(){
        
    }
    /* The value is used for initialization and judgment */
    public static final byte NONE = 0x00;//0000 0000
    
    /* The value is used to determine the position */
    public static final byte POSITION_ZERO = (byte)0x80;//1000 0000
    public static final byte POSITION_ONE = 0x40;//0100 0000
    public static final byte POSITION_TWO = 0x20;//0010 0000
    public static final byte POSITION_THREE = 0x10;//0001 0000
    public static final byte POSITION_FOUR = 0x8;//0000 1000
    public static final byte POSITION_FIVE = 0x4;//0000 0100
    public static final byte POSITION_SIX = 0x2;//0000 0010
    public static final byte POSITION_SEVEN = 0x1;//0000 0001
}
