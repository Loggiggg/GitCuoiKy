/*
*Created date: Oct 09, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab5;

public class Maytinhtestdrive {
    public static void main(String[] args) {
        Maytinh maytinh;
        maytinh = new Maytinh("MSI");
        System.out.println("Nhà sản xuất: "+maytinh.nsx);
        maytinh = new Maytinh(2021, "Win11");
        System.out.println("Năm sản xuất: "+maytinh.nmsx+". Hệ điệu hành: "+maytinh.hdh);
        maytinh = new Maytinh("32GB", "AMD Ryzen Threadripper PRO 3975WX", 100000000);
        System.out.println("Ram: "+maytinh.ram+". Bộ vi sử lý: "+maytinh.cpu+". Giá máy: "+maytinh.gia);
        maytinh = new Maytinh();
        System.out.println(maytinh);
    }
}
