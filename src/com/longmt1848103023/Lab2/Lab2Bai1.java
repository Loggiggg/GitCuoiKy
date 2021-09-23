package com.longmt1848103023.Lab2;

import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so cua pt bac 1: ");
        System.out.println("Nhap he so a cua ax: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap he so tu do b: ");
        float b = scanner.nextFloat();
        float x = -b/a;
        if (a==0){
           if(b==0){
            System.out.println("pt vo so nghiem");
        }
           else{
            System.out.println("co nghiem");
            x = 0;
            System.out.printf("%f", x);
           }
       }
       if(a==0){
           System.out.println("pt vo nghiem");
       }
       System.out.printf("%f",x);
       }
}
