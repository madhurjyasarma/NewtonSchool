package com.savage;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class StudentClass {
    public String name;
    public int rollNo;
    public int mark1;
    public int mark2;

    StudentClass(String name, int rollNo, int mark1, int mark2) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public void showDetails() {
        System.out.println("Name : " + name);
        System.out.println("RollNo  : " + rollNo);
        System.out.println("Marks1   : " + mark1);
        System.out.println("Marks2   : " + mark2);
        System.out.println();
        System.out.println();
    }
}

class Student {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        StudentClass[] students = new StudentClass[total];

        for (int i=0; i<total; i++) {
            String name = sc.nextLine();
            int rollNo = sc.nextInt();
            int mark1 = sc.nextInt();
            int mark2 = sc.nextInt();
            students[i] = new StudentClass(name,rollNo,mark1,mark2);

        }


        for (int i=0; i<total; i++){
            students[i].showDetails();
        }
    }
}
