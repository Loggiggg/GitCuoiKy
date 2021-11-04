/*
*Created date: Nov 04, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.BaiKiemTraGiuaKy;

import java.util.Scanner;

public abstract class NhanVien extends Nguoi {
    
    private static java.lang.String tenNhanVien;
    protected java.lang.String heSoLuong;

    Scanner scanner = new Scanner(System.in);
    private float tinhLuong;
    private float luongNhanVien;
    private static long Luong_NV = 1500000;

   
    
    public NhanVien(float tinhLuong) {
        super(tinhLuong, tenNhanVien);
        this.tinhLuong = heSoLuong;
        
    }

    public void nhapThongTin() {
        System.out.print("Nhập he so luong: ");
        heSoLuong = scanner.nextLine();
        
    }
    @Override
    public void tinhLuong(){
        luongNhanVien = Luong_NV * this.tinhLuong;
        
    }
 
    @Override
    public String toString() {
         return super.toString() +", luongNhanVien:" + this.heSoLuong;
    }


    public void setHoTen(String string) {
    }

    public void setHeSoLuong(int i) {
    }         
}
