package com.savage;

public class Constructor2 {
    // Attributes
    int modelYear;
    String modelName;

    public Constructor2(int year, String name){
        // Constructor of this class
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        // Multiple parameter
        Constructor2 myCar = new Constructor2(1969,"Mustang");

        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
