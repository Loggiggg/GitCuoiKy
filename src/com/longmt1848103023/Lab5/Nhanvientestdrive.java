/*
*Created date: Oct 09, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab5;

public class Nhanvientestdrive {
    public static void main(String[] args) {
        Nhanvien nhanvien;
        nhanvien = new Nhanvien("Huy");
        System.out.println("Tên nhân viên: "+nhanvien.tennhanvien);
        nhanvien = new Nhanvien(5000000, "128 Hoàng Văn Thụ, Quận 12, TPHCM");
        System.out.println("Lương: "+nhanvien.luong+" Địa chỉ: "+nhanvien.diachi);
        nhanvien = new Nhanvien("NV01", "Phòng Kho", 20);
        System.out.println("Mã số nv: "+nhanvien.msnv+" Bộ phận là việc: "+nhanvien.bophanlamviec+" Ngày sinh: "+nhanvien.ngay);
        nhanvien = new Nhanvien();
        System.out.println(nhanvien);
    }
}
