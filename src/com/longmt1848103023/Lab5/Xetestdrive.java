/*
*Created date: Oct 09, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab5;

public class Xetestdrive {
    public static void main(String[] args) {
        Xe xe;
        xe = new Xe("Long");
        System.out.println("Tên chủ xe: "+xe.ten);
        xe = new Xe("ToYoTa", "2021 New");
        System.out.println("Hãng xe: "+xe.hsx+". Dòng xe: "+xe.dong);
        xe = new Xe("Long", "20/21 GTVT", "1000ml");
        System.out.println("Tên chủ xe: "+xe.ten+". Mã số giấy phép: "+xe.giayphep+". Dung tích xăng: "+xe.dungtichxang);
        xe = new Xe();
        System.out.println(xe);
    }
}
