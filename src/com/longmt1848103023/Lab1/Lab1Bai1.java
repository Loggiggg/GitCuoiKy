package com.longmt1848103023.Lab1;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho va Ten:");
        String hoten = scanner.nextLine();
        System.out.println("Diem TB:");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %fdiem",hoten,diemTB);
    }     
}
