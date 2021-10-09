/*
*Created date: Oct 09, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab5;

public class Cowtestdrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow(5.5);
        System.out.println("Cân nặng: "+cow.weigth);
        cow = new Cow();
        System.out.println("Cân nặng: "+cow.weigth);
    }    
}
