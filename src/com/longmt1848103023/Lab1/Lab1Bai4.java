package com.longmt1848103023.Lab1;

import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so bac 2,a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhap he so bac 1, b =");
        float b = scanner.nextFloat();
        System.out.print("Nhap he so tu do, c =");
        float c = scanner.nextFloat();
        float delta = (float) (Math.pow(b, 2) - 4*a*c);
        float candelta = (float) (Math.sqrt(delta));
        System.out.print("Kq cua Can delta:");
        System.out.printf("%f",candelta);
    }
}
