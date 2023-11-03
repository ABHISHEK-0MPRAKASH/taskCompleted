package com.java.datatypes.primitive;

public class DataTypesDemo {
    //non-initialized

    //false
    static boolean b1;
    //0
    static byte by1;
    //u0000
    static char c1;
    //0
    static short s1;
    //0
    static int i1;
    //0l
    static long l1;
    //0.0f
    static float f1;
    //0.0d
    static double d1;
    public static void displayTypes(){
        //initialized

        //true or false
        //1byte
        boolean b = true;
        //from -128 to 127
        //1 byte
        byte by = 10;
        //2 byte
        char c = 'A';
        //2 byte
        short s = 0;
        //2,147,483,648 to 2,147,483,647
        // 4byte
        int i = 10;
        //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // 8byte
        long l = 10000000l;
        //4 byte
        float f = 2.33f;
        //8 byte
        double d = 123.4d;


        System.out.println("Initialized values");
        System.out.println("Initialized boolean is " + b);
        System.out.println("Initialized byte is " + by);
        System.out.println("Initialized char is " + c);
        System.out.println("Initialized short is "+ s);
        System.out.println("Initialized int is "+ i);
        System.out.println("Initialized long is "+ l);
        System.out.println("Initialized float is "+f);
        System.out.println("Initialized double is "+d);

        System.out.println("");

        System.out.println("Not-Initialized values");
        System.out.println("NOT-Initialized boolean is " + b1);
        System.out.println("NOT-Initialized byte is " + by1);
        System.out.println("NOT-Initialized char is " + c1);
        System.out.println("NOT-Initialized short is "+ s1);
        System.out.println("NOT-Initialized int is "+ i1);
        System.out.println("NOT-Initialized long is "+ l1);
        System.out.println("NOT-Initialized float is "+f1);
        System.out.println("NOT-Initialized double is "+d1);
    }

    public static void main(String[] args) {
        DataTypesDemo types = new DataTypesDemo();
        types.displayTypes();
    }
}
