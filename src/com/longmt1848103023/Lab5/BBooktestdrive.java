/*
*Created date: Oct 07, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab5;

public class BBooktestdrive {

    public static void main(String[] args) {
        BBook bbook;
        bbook = new BBook(50000);
        System.out.println("Giá sách: "+bbook.gia);
        bbook = new BBook("KinDong", 2020);
        System.out.println("Nhà xuất bản: "+bbook.nxb+" Và năm xuất bản: "+bbook.namxb);
        bbook = new BBook(200000, 20, "Tố Hữu");
        System.out.println("Giá bán: "+bbook.giaban+" Số lượng hiện có: "+bbook.soluong+" Tên tác giả: "+bbook.tacgia);
        bbook = new BBook();
        System.out.println(bbook);
    }
    
}
