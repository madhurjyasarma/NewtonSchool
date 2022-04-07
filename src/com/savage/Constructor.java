package com.savage;

// Constructor Overloading eg also+++

public class Constructor {
        // Class Attribute
        int initNum;

        // Constructor of Main class
        public Constructor(){
            // This will be called when object is created
            initNum = 808;
        }

        // Parameterized Construct
        public Constructor(int y){
            initNum = y;
        }

        public static void main(String[] args) {
            // Object of constructor class (No param)
            Constructor myObj1 = new Constructor();

            // Parameterized constructor will call with y as param
            Constructor myObj2 = new Constructor(909);

            // initNum will be 808
            System.out.println(myObj1.initNum);

            // init will become  y
            System.out.println(myObj2.initNum);

        }
}
