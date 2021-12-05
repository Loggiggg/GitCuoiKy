/*
*Created date: Nov 17, 2021
*Author: Mai Thanh Long
*/
package com.BaiTieuLuanCuoiKy.Longmt1848103023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kho {

    public static List<HangHoa> HANGHOA = new ArrayList<HangHoa>();

    static Scanner sc = new Scanner(System.in);
    public static void Menu(){
        System.out.println("-----------Menu chuc nang------------");
        System.out.println("1. Thêm hàng hóa vào kho");
        System.out.println("2. Hiên thi hàng hóa vưa thêm và hàng hóa trong kho");
        System.out.println("3. Sua thông tin hàng hóa trong kho");
        System.out.println("4. Xoa bo hang hoa trong kho");
        System.out.println("5. Tim kiêm hàng hóa trong kho");
        System.out.println("6. Sap xep hàng hóa trong kho");
        System.out.println("7. Thông kê hàng hóa trong kho");
        System.out.println("8. Thoát");
    }
    public static void main(String[] args) {
        int function = 0;
        do {
            Menu();
            System.out.println("Chon chưc năng:");
            function = sc.nextInt();
            ChucNang chucnang = new ChucNang();
            switch (function) {
                case 1:
                chucnang.Them();
                    break;

                case 2:
                chucnang.Show();
                    break;
                
                case 3:
                chucnang.Sua();
                    break;

                case 4:
                chucnang.Xoa();
                    break;                    
                
                case 5:
                chucnang.TimKiem();
                    break;

                case 6:
                chucnang.SapXep();
                    break;
                
                case 7:
                chucnang.ThongKe();         
                    break;
                    
                default:
                    break;
            }
        } while (function != 8);
        System.out.println("Thanks");
    }
    
}
