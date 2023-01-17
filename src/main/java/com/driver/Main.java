package com.driver;

public class Main {
    public static class A {
        public String meth() {
            String str = "Invoking method from class A";
            return str;
        }
    }
    public static class B extends A{
        @Override
        public String meth(){
            String str = "Method is overridden in Extendend class B";
            return str;
        }
    }
    public static void main(String args[]){
        B obj = new B();
        obj.meth();
    }
}
