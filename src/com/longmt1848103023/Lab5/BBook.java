/*
*Created date: Oct 07, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab5;

import java.util.Scanner;

public class BBook {
    int gia;
    String nxb;
    int namxb;
    int giaban;
    int soluong;
    String loai;
    String tacgia;

    BBook (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập giá của sách: ");
        gia = sc.nextInt();
        System.out.print("Hãy nhập nhà xuất bản của sách: ");
        nxb = sc.next();
        System.out.print("Hãy nhập năm xuất bản của sách: ");
        namxb = sc.nextInt();
        System.out.print("Hãy nhập số lượng sách: ");
        soluong = sc.nextInt();
        System.out.print("Hãy nhập loại sách: ");
        loai = sc.next();
        System.out.print("Hãy nhập tên tác giả của sách: ");
        tacgia = sc.next();
        System.out.println("---------------------");    
        System.out.println("Giá của sách là: "+gia);
        System.out.println("Nhà xuất bản của sách là: "+nxb);
        System.out.println("Năm xuất bản của sách là: "+namxb);
        System.out.println("Số lượng sách là: "+soluong);
        System.out.println("Loại sách là: "+loai);
        System.out.println("Tên tác giả của sách là: "+tacgia);
    }
    BBook(int g){
        gia = g;
    }
    BBook(String xb, int nmxb ){
        nxb = xb ;
        namxb = nmxb;
    }
    BBook(int gb, int sl, String tg){
        giaban = gb;
        soluong = sl;
        tacgia = tg;
    }
}
