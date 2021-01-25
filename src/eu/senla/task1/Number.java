package eu.senla.task1;

public class Number {
    private byte aByte;      // celie chisla-1 byte
    private short aShort;     // celie chisla-2 byte, -32768...32767
    private int anInt;         // celie chisla-4 byte, -2147483648...2147483647
    private long aLong;       // celie chisla-8 byte
    private float aFloat;     // veschestvennie chisla-4 byte
    private double aDouble;   // veschestvennie chisla-8 byte
    private char aChar;       // simvol Unicode-2 byte
    private boolean aBoolean; // znachenie istina/lozh-1 byte
//byte i short po umolchaniu preobrazuyutsia v int!!!

    public Number() {
    }
    //------
    public byte getaByte() {
        return aByte;
    }
    public void setaByte(byte aByte) {
        if (aByte >= -128 & aByte <= 127) { //proverka na pravilnost vvedennogo znacheniya
            this.aByte = aByte;
        } else {
            System.out.println("Invalid variable value! Inter up -128 to 127.");
        }
    }
    //------
    public short getaShort() {
        return aShort;
    }
    public void setaShort(short aShort) {
        if (aShort >= -32768 & aShort <= 32767) {
            this.aShort = aShort;
        } else {
            System.out.println("Invalid variable value! Inter up -32768 to 32767.");
        }
    }
    //------
    public int getanInt() {
        return anInt;
    }
    public void setanInt(int anInt) {
        if (anInt >= -2147483648 & anInt <= 2147483647) {
            this.anInt = anInt;
        } else {
            System.out.println("Invalid variable value! Inter up -2147483648 to 2147483647.");
        }
    }
    //-------
    public long getaLong() {
        return aLong;
    }
    public void setaLong(long aLong) {
        this.aLong = aLong;
    }
    //------
    public float getanFloat() {
        return aFloat;
    }
    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }
    //------
    public double getanDouble() {
        return aDouble;
    }
    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }
    //------
    public char getaChar() {
        return aChar;
    }
    public void setaChar(char aChar) {
        this.aChar = aChar;
    }
    //------
    public boolean getaBoolean() {
        return aBoolean;
    }
    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

   /*  public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", 5);

        Внутри него по факту произошло следующее:
        this.name = "Барсик";
        this.age = 5;

    */


}


