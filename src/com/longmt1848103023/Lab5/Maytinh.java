/*
*Created date: Oct 09, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab5;

import java.util.Scanner;

public class Maytinh {
    String nsx;
    int nmsx;
    String hdh;
    String ram;
    String cpu;
    double gia;
    int nambaohanh;

    Maytinh(String nhasx){
        nsx = nhasx;
    }
    Maytinh(int nam, String he){
        nmsx = nam;
        hdh = he;
    }
    Maytinh(String rm, String CPU, double g){
        ram = rm;
        cpu = CPU;
        gia = g;
    }
    Maytinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập nhà sản xuất: ");
        nsx = sc.next();
        System.out.print("Hãy nhập năm sản xuất: ");
        nmsx = sc.nextInt();
        System.out.print("Hãy nhập hệ điều hành: ");
        hdh = sc.next();
        System.out.print("Hãy nhập Ram của máy: ");
        ram = sc.next();
        System.out.print("Hãy nhập bộ vi sử lý của máy: ");
        cpu = sc.next();
        System.out.print("Giá máy: ");
        gia = sc.nextDouble();
        System.out.print("Năm bảo hành: ");
        nambaohanh = sc.nextInt();

        System.out.println("---------------------");    
        System.out.println("Nhà sản xuất: "+nsx);
        System.out.println("Năm sản xuất: "+nmsx);
        System.out.println("Hệ điều hành: "+hdh);
        System.out.println("Ram của máy: "+ram);
        System.out.println("Bộ vi sử lý của máy: "+cpu);
        System.out.println("Giá máy: "+gia);
        System.out.println("Số năm bảo hành: "+nambaohanh+" năm");
    }
}
