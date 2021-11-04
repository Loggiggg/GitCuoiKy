/*
*Created date: Nov 04, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.BaiKiemTraGiuaKy;

public class Nguoi {
    /**
     *
     */
    private static final java.lang.String NGUOI_HO_TEN = " Nguoi [hoTen: ";
    private String hoTen;
    private String diaChi;

    public Nguoi(float diemTB, String diaChi){
        this.hoTen = hoTen;
        this.diaChi = diaChi;

    }
    public void setDiaChi(String string) {
    }
    public String gethoTen(){
        return hoTen;
    }
    public String getdiacChi (){
        return diaChi;
    }
    @Override
    public String toString(){
        return "NGUOI_HO_TEN"+ hoTen + "diaChi:" +diaChi;
    }
}
