/*
*Created date: Nov 04, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.BaiKiemTraGiuaKy;

import java.util.ArrayList;

public class DanhSachQuanLy {
    private ArrayList<Nguoi> danhSach = new ArrayList<Nguoi>();
    public void them(Nguoi kh){
        this.danhSach.add(kh);
    }
    public void inDanhSach(){
        System.out.println(danhSach);
    }

}
