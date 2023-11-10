package com.java.streams.files.inputstream;

import java.io.FileInputStream;

public class InputFileDemo {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("C:\\Users\\Win11_T450\\Desktop\\testout.txt\\");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
