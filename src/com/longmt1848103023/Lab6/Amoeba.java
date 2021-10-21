/*
*Created date: Oct 21, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab6;

public class Amoeba {
    String sound;
    int x;
    int y;

    public Amoeba (String s , int xx , int yy){
         sound = s;
         x = xx;
         y = yy;
    }
    void hx(){
        System.out.println("Xoay theo tọa độ : x= "+x+ " và y = "+y);
        System.out.println("Âm thanh: "+sound);
    }
}
