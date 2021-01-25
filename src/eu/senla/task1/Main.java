package eu.senla.task1;

public class Main {
    private byte aByte;      // celie chisla-1 byte
    private short aShort;     // celie chisla-2 byte, -32768...32767
    private int anInt;         // celie chisla-4 byte, -2147483648...2147483647
    private long aLong;       // celie chisla-8 byte
    private float aFloat;     // veschestvennie chisla-4 byte
    private double aDouble;   // veschestvennie chisla-8 byte
    private char aChar;       // simvol Unicode-2 byte
    private boolean aBoolean; // znachenie istina/lozh-1 byte
//byte i short po umolchaniu preobrazuyutsia v int!!!

    public static void main(String[] args) {
        Number number = new Number();
        number.setaByte((byte) 12);
        System.out.println(number.getaByte());



        int a = 123;
        // byte e = 456;-----so much value, more then 1 byte
        Integer g = 13;

        String s = "Java beginner";
        Character c = 's';

        String s2 = "12345";
        double d2 = Double.parseDouble(s2);


        boolean b = true;
        // Boolean bBoolean = (int) 1; ----nesovmestimost tipov peremennih

        System.out.println(s2);
        System.out.println(d2);
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(a);
        // System.out.println(e);
        System.out.println(g);
    }
}
// ne zamorachivalsia na kolichestve variatsii s prisvoeniem odnogo tipa k drugomu-tut vse
// poniatno, 4to 1 byte mozhno vpisat v 2 i bolee byte, v obratnom zhe poriadke bufer obrezhet
//lishnie byti i poluchitsya menchee znachenie
// s char i boolean tozhe vse poniatno

// zasada poka s get i set

