package com.longmt1848103023.Lab2;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dien su dung cua thang: ");
        float sd = scanner.nextFloat();
        if(sd<=50){
            float tien = sd*1000;
            System.out.println("So tien cua thang nay: "+tien+"VND");
        }else{
            float tien = (+sd - 50)*1200 + 50*1000;
            System.out.println("So tien cua thang nay: "+tien+"VND");
        }
    }
}
