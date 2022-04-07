package com.savage;

public class PublicStatic {
    static void myStaticMethod(){
        System.out.println("Static method can use without creating an object");
    }

    public void myPublicMethod(){
        System.out.println("Public method can be used only by creating an object");
    }

    public static void main(String args[]){
        myStaticMethod();
        PublicStatic myObj = new PublicStatic();
        myObj.myPublicMethod();
    }
}
