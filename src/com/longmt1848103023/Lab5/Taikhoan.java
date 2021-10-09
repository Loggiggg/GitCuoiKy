/*
*Created date: Oct 09, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab5;

import java.util.Scanner;

public class Taikhoan {
    String tentk;
    int stk;
    double sodutk;
    double tientrongtk;

    Taikhoan(String ten){
        tentk = ten;
    }
    Taikhoan(String ten, int sotk){
        tentk = ten;
        stk = sotk;
    }
    Taikhoan(String ten, int sotk, double sdtk){
        tentk = ten;
        stk = sotk;
        sodutk = sdtk;
    }
    Taikhoan(String t,int s,double sd,double ttk){
        tentk = t;
        stk = s;
        sodutk = sd;
        tientrongtk = ttk;
    }
    Taikhoan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy tên tài khoản: ");
        tentk = sc.next();
        System.out.print("Hãy nhập số tài khoản: ");
        stk = sc.nextInt();
        System.out.print("Hãy nhập số dư trong tk: ");
        sodutk = sc.nextDouble();
        System.out.print("Hãy nhập số tiền hiện có trong tài khoản: ");
        tientrongtk = sc.nextDouble();

        System.out.println("---------------------");    
        System.out.println("Tên tài khoản: "+tentk);
        System.out.println("Số tài khoản: "+stk);
        System.out.println("Số dư trong tài khoản: "+sodutk);
        System.out.println("Tiền trong tài khoản: "+tientrongtk);
    }
    void showda(){
        System.out.println("Tên tài khoản: "+tentk);
        System.out.println("Số tài khoản: "+stk);
    }
    void chuyentiendi(int ammount){
        System.out.println("Tên tài khoản: "+tentk);
        System.out.println("Số tài khoản: "+stk);
        System.out.println("Số dư trong tài khoản hiện tại: "+sodutk);
        tientrongtk +=sodutk;
        System.out.println("Tiền trong tk hiện tại: "+tientrongtk);
        tientrongtk -= ammount;
        System.out.println("Tiền trong tk sau khi chuyen di: "+tientrongtk);
    }
    void nhantien(int amount){
        System.out.println("Số tiền trong tk ban đầu: "+tientrongtk);
        tientrongtk +=amount;
        System.out.println("Số tiền trong tk sau khi nhận: "+tientrongtk);
    }
}
