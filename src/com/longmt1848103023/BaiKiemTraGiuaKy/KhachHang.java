/*
*Created date: Nov 04, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.BaiKiemTraGiuaKy;

public abstract class KhachHang {
    private String tenCongTy;
    private double triGiaHoaDon;

    public KhachHang(String tenCongTy, double triGiaHoaDon){
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;

    }
    @Override
    public String toString(){
    return "tenCongTy=" + tenCongTy +" triGiaHoaDon =" + triGiaHoaDon;
    }
}
