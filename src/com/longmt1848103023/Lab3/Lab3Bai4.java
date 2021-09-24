/*
*Created date: Sep 23, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab3;

import java.util.Scanner;

public class Lab3Bai4 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập số lượng sinh viên: ");
        Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
        String[] Ten = new String[n];
        float[] Diem = new float[n];
        Nhap(n, Ten, Diem);
        Xuat(n, Ten, Diem);
        Hocluc(n, Ten, Diem);
    }
    private static void Nhap(int n, String[] Ten, float[] Diem) {
        for(int i = 0; i < n; i++){
            System.out.println("Nhap ten sinh vien thứ " +i+ ":");
            Scanner sc = new Scanner(System.in);
            Ten[i] = sc.nextLine();
            System.out.println("Nhập điểm sinh viên thứ "+i+ ":");
            Diem[i] = sc.nextFloat();
        }
    }
    private static void Xuat(int n, String[] Ten, float[] Diem) {
        for(int i = 0; i<n; i++){
            System.out.println("Tên sinh viên thứ tự "+i+":" +Ten[i]);
            System.out.println("Điểm sinh viên thứ tự "+i+":" +Diem[i]);
            System.out.println("Học lực sinh viên thứ tự " +i+":");
            Hocluc(n, Ten, Diem);
        }
    }
    private static void Hocluc(int n, String[] Ten, float[] Diem) {
        for(int i = 0; i<n;i++){
            if(Diem[i]<5){
                System.out.println("Học lực: Yếu");
            }
            if(Diem[i]>5 && Diem[i]<6.5){
                System.out.println("Học lực: Trung bình");
            }
            if(Diem[i]>6.5 && Diem[i]<7.5){
                System.out.println("Học lực: Khá");
            }
            if(Diem[i]>7.5 && Diem[i]<9){
                System.out.println("Học lực: Giỏi");
            }
            if(Diem[i]>9){
                System.out.println("Học lực: Xuất sắc");
            }
        }
    }
}
