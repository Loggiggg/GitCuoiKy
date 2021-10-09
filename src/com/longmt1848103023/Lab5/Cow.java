/*
*Created date: Oct 09, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab5;

import java.util.Scanner;

public class Cow {
    double weigth;
    
    Cow(double w){
        weigth = w;
    }
    Cow(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cân nặng của con bò: ");
        weigth = sc.nextDouble();
    }
}
