/*
*Created date: Nov 04, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.BaiKiemTraGiuaKy;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy ds = new DanhSachQuanLy();
        HocVien sv = new HocVien();
        sv.setDiemMonHoc1(5);
        sv.setDiemMonHoc1(6);
        sv.setHoTen("a");
        sv.setDiaChi("dia chi o dau");
        sv.setSoLuongHV(20);
        ds.them(sv);

        NhanVien nv = new NhanVien();
        nv.setHeSoLuong(5);
        nv.setHoTen("B");
        nv.setDiaChi("dia chi");
        ds.them(nv);
        
        KhachHang kh = new KhachHang();
        kh.setTenCongTy("mb");
        kh.setTriGiaDonHang(1000);
        kh.setHoTen(" C");
        kh.setDiaChi("dia chi");
        ds.them(kh);
        ds.inDanhSach();
    }
    
}
