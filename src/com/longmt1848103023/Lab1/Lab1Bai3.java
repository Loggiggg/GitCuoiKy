package com.longmt1848103023.Lab1;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh cua khoi lap phuong:");
        double canh = scanner.nextDouble();
        double thetich = Math.pow(canh, 3);
        System.out.print("The tich cua khoi lap phuong la:");
        System.out.printf("the tich %fcm",thetich);
    }
}
