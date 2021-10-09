/*
*Created date: Oct 09, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab5;

public class Taikhoantestdrive {
    public static void main(String[] args) {
        Taikhoan taikhoan;
        taikhoan = new Taikhoan("MAI THANH LONG");;
        System.out.println("Tên tài khoản: "+taikhoan.tentk);
        
        taikhoan = new Taikhoan("MAI THANH LONG", 123456789);
        System.out.println("Tên tài khoản: "+taikhoan.tentk);
        System.out.println("Số tài khoản: "+taikhoan.stk);
       
        taikhoan = new Taikhoan("MAI THANH LONG", 123456789, 529.5);
        System.out.println("Tên tài khoản: "+taikhoan.tentk);
        System.out.println("Số tài khoản: "+taikhoan.stk);
        System.out.println("Số dư tài khoản: "+taikhoan.sodutk);

        taikhoan = new Taikhoan();
        System.out.println(taikhoan);

        taikhoan = new Taikhoan("Mai Thanh Long", 123456789, 529.5, 10450000);
        taikhoan.showda();
        taikhoan.chuyentiendi(2000000);
        taikhoan.nhantien(5000000);
    }
}
