package com.java.professsional.common;

import com.java.professsional.common.Result;

public class Test2 {

    public static Object solution(String s1,String s2){
        return s1.concat(s2);
    }


    public static void testSolution(String[] str1,String[] str2,String[] expectedRes,Result result){
        for (int index=0;index< str1.length;index++){
            System.out.print("input : "+str1[index]+","+ str2[index]+" ---> ");
            Object res = solution(str1[index],str2[index]);
            result.setExpected(expectedRes[index]);
            result.setActual(res);
            System.out.println(result);
        }
    }

    public static void setTestValuesForSolution(){
        Result result = new Result();
        String[] str1 = {"virat","rohit"};
        String[] str2 = {"kholi","sharma"};
        String[] expectedRes={"viratkholi","rohitsharma"};
        testSolution(str1,str2,expectedRes,result);
    }


    public static void main(String[] args) {
        setTestValuesForSolution();
    }
}
