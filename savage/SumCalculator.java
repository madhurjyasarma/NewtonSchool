package com.savage;

class SumCalculator {
    public int num1;
    public int num2;

    SumCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return this.num1 + this.num2;
    }

    public int sum2(int a,int b) {
        return a+b;
    }

    public int fromObject (SumCalculator obj1,SumCalculator obj2) {
        return obj1.sum() + obj2.sum();
    }


}