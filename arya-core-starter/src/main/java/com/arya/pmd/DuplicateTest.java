package com.arya.pmd
        ;

public class DuplicateTest {


    public void f1(){

        String s = "" + 123;
        System.out.println(s);
        System.out.println("PrintHelloworld");
        System.out.println("PrintHelloworld");
    }
    public void f2(){
        System.out.println("PrintHelloworld");
        System.out.println("PrintHelloworld");
    }

}
