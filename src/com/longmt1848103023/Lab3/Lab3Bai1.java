/*
*Created date: Sep 23, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab3;

import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        System.out.print("Nhập một số N : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        check(N);   
    }
    public static void check(int n){
        boolean ok = true;
        for(int i = 2 ; i < n - 1 ; i++){
            if(n % i == 0){
                ok = false;
                break;
            }
        }
        if(ok == true){
            System.out.print("Đây là số nguyên tố");
        }
        else{
            System.out.print("Đây không là số nguyên tố");
        }
    }
}
