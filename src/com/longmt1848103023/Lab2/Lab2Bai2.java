package com.longmt1848103023.Lab2;

import java.util.Scanner;

public class Lab2Bai2 {
    public static void main(String[] args) {
        float a, b, c, x1, x2, delta;
        float x;
        String ketQua = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = scanner.nextFloat();
        System.out.print("Nhập b: ");
        b = scanner.nextFloat();
        System.out.print("Nhập c: ");
        c = scanner.nextFloat();
        if(a==0){
            x = -c/b;
            System.out.println("Do a = 0 => x = " +x);
        }
        System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: "+a+"x^2 + "+b+"x + "+c+" = 0");
        delta = (float) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            ketQua = "Phương trình vô nghiệm!";
        } else if (delta == 0) {
            x1 = x2 = -b/ (2*a);
            System.out.println("Phương trinh có nghiệm kép là x1 = x2 = "+x1);
        } else {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            ketQua = "Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2;
        }
        System.out.println(ketQua);
    }
}
