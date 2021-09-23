package com.longmt1848103023.Lab2;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) {
        System.out.println("========Menu=======");
        System.out.println("1.Giải phương trình bậc nhất ");
        System.out.println("2.Giải phương trình bậc 2 ");
        System.out.println("3.Tính tiền điện  ");
        System.out.print("Hãy chọn 1 chức năng trong menu");
        Scanner chucnang = new Scanner(System.in);
        int giatrinhap = chucnang.nextInt();
        switch (giatrinhap) {
            case 1:
                giaiptb1();
                break;
            case 2:
                giaiptb2();
                break;
            case 3:
                tinhtien();
                break;
            default:
                break;
        }
    }
    static void giaiptb1 (){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap he so cua pt bac 1:");
            System.out.println("Nhap he so a cua ax:");
            float a = scanner.nextFloat();
            System.out.println("Nhap he so tu do b:");
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
    static void giaiptb2 (){
        float a, b, c, x, x1, x2, delta;
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
    static void tinhtien (){
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
