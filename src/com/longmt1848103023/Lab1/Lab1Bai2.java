package com.longmt1848103023.Lab1;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chieu dai:");
        double dai = scanner.nextDouble();
        System.out.println("Chieu rong:");
        double rong = scanner.nextDouble();
        double dientich = dai*rong;
        double chuvi = (dai+rong)*2;
        double canhnhonhat = Math.min(dai, rong);
        System.out.printf("dien tich %f chu vi %f canh nho nhat %f cm",dientich,chuvi,canhnhonhat);
    }
}
