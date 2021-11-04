/*
*Created date: Nov 04, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.BaiKiemTraGiuaKy;

public abstract class HocVien extends Nguoi {
    float diemMonHoc1;
    float diemMonHoc2;
    static int soLuongHV;
    boolean ok = true;
     public HocVien(float diemTB, String toString){
        super(diemTB, "HocVien");
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
        this.soLuongHV = soLuongHV;
        
    }
    public double getDiem(){
        return ((diemMonHoc1) + diemMonHoc2)/2;
    }
    @Override
    public void toString() {
        return ;
    }
    public void setDiemMonHoc1(int i) {
        if (diemMonHoc1<0 && diemMonHoc1>=10){
            ok = false;
            break;
        }
    }
    public void setHoTen(String string) {
    }
    public void setSoLuongHV(int i) {
    }

    

}
