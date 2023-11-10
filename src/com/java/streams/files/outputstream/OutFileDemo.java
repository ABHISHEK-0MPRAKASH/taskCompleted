package com.java.streams.files.outputstream;

import java.io.FileOutputStream;

public class OutFileDemo {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\Win11_T450\\Desktop\\testout.txt\\");
            String s="This is the file of the out-put file stream, it contains all the things related to the output of that program ";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}
