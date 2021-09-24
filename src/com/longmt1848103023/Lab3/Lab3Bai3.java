/*
*Created date: Sep 23, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        n = scanner.nextInt();

        int [] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: \n");
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = " ,i);
            arr[i] = scanner.nextInt();
        }    
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap sep: ");
        Xuatmang(arr);
        
        int count = 0;
        int avg = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] % 3 == 0){
                sum += arr[i];
                count++;
            }
            avg = sum/count;
            System.out.println("Ket qua: "+avg);
    }
    
    private static void Xuatmang(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }        
}
