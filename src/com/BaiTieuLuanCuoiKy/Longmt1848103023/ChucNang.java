/*
*Created date: Nov 17, 2021
*Author: Mai Thanh Long
*/
package com.BaiTieuLuanCuoiKy.Longmt1848103023;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.String;

public class ChucNang {
    public void Them(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap thông tin hang hoa");

    try {
        System.out.println("Ma hang: ");
        int Mahang = sc.nextInt();
        sc.nextLine();

        System.out.println("Loai");
        String Loai = sc.next();
        sc.nextLine();

        System.out.println("Tên hang hoa");
        String TenHang = sc.next();
        sc.nextLine();

        System.out.println("Gia nhap hang:");
        int Gianhap = sc.nextInt();
        sc.nextLine();

        System.out.println("Sô lương nhap");
        int Soluongnhap = sc.nextInt();
        sc.nextLine();

        System.out.println("Sô lương tôn");
        int Soluongton = sc.nextInt();
        sc.nextLine();

        System.out.println("Ngay nhap: ");
        String Ngaynhap = sc.next();
        sc.nextLine(); 

        HangHoa h = new HangHoa(Loai, Mahang, TenHang, Gianhap, Soluongnhap, Soluongton, Ngaynhap);
        Kho.HANGHOA.add(h);

        } catch (InputMismatchException ei) {
            System.out.println("Ban nhâp sai gia tri, mơi nhâp lai");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void Show(){
        System.out.println("Danh sach san phâm mơi: ");
        String Xuat = String.format("%s%10s%15s%20s%20s%20s%20s", "Loai", "Ma","Tên hang","Gia Nhâp","Sô Lương Nhâp", 
        "Sô lương tôn", "Ngay Nhâp");
        System.out.println(Xuat);

        for (HangHoa h: Kho.HANGHOA){
            String Xuat1 = String.format("%s%10d%15s%20d%20d%20d%20s", h.getLoai(), h.getMahang(),h.getTenHang(),
            h.getGianhap(),h.getSoluongnhap(), h.getSoluongton(), h.getNgaynhap());
            System.out.println(Xuat1);
        }
    }

    public void Sua(){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhâp ma san phâm muôn sưa thông tin: ");
            Integer mahang = sc.nextInt();
            HangHoa hanghoas = null;

            for (HangHoa h: Kho.HANGHOA){
                if(mahang==h.getMahang()){
                    hanghoas = h;
                    break;
                } 
            }

            if (hanghoas==null){
                System.out.println("Ma san phâm không tôn tai");
            }

            System.out.println("Thông tin san phâm");
            String Xuat1 = String.format("%s%10d%15s%20d%20d%20d%20s", hanghoas.getLoai(), hanghoas.getMahang(),hanghoas.getTenHang(),
            hanghoas.getGianhap(),hanghoas.getSoluongnhap(), hanghoas.getSoluongton(), hanghoas.getNgaynhap());
            System.out.println(Xuat1);

            for (int i = 0; i<Kho.HANGHOA.size();i++){
                if(mahang.equals(Kho.HANGHOA.get(i).getMahang())){

                    System.out.println("Loai");
                    String Loai = sc.next();
                    sc.nextLine();

                    System.out.println("Tên hang hoa");
                    String TenHang = sc.next();
                    sc.nextLine();

                    System.out.println("Gia nhâp hang:");
                    int Gianhap = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Sô lương nhâp");
                    int Soluongnhap = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Sô lương tôn");
                    int Soluongton = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ngay nhâp: ");
                    String Ngaynhap = sc.next();
                    sc.nextLine();

                    Kho.HANGHOA.get(i).setLoai(Loai);
                    Kho.HANGHOA.get(i).setTenHang(TenHang);
                    Kho.HANGHOA.get(i).setGianhap(Gianhap);
                    Kho.HANGHOA.get(i).setSoluongnhap(Soluongnhap);
                    Kho.HANGHOA.get(i).setSoluongton(Soluongton);
                    Kho.HANGHOA.get(i).setNgaynhap(Ngaynhap);
                }
            }
    
            } catch (InputMismatchException ei) {
                System.out.println("Ban nhâp sai gia tri, mơi nhâp lai");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
           
    
    }

    public void Xoa(){
        Scanner sc = new Scanner(System.in);
        try {    
            System.out.println("Nhâp ma san phâm muôn xoa thông tin: ");
            Integer mahang = sc.nextInt();
            HangHoa hanghoas = null;

            for (HangHoa h: Kho.HANGHOA){
                if(mahang==h.getMahang()){
                    hanghoas = h;
                    break;
                } 
            }

            if (hanghoas==null){
                System.out.println("Ma san phâm không tôn tai");
            }

            System.out.println("Thông tin san phâm");
            String Xuat1 = String.format("%s%10d%15s%20d%20d%20d%20s", hanghoas.getLoai(), hanghoas.getMahang(),hanghoas.getTenHang(),
            hanghoas.getGianhap(),hanghoas.getSoluongnhap(), hanghoas.getSoluongton(), hanghoas.getNgaynhap());
            System.out.println(Xuat1);

            for (int i = 0; i<Kho.HANGHOA.size();i++){
                if(mahang.equals(Kho.HANGHOA.get(i).getMahang())){
                    Kho.HANGHOA.remove(hanghoas);
                }
            }

            
            } catch (InputMismatchException ei) {
                System.out.println("Ban nhâp sai gia tri, mơi nhâp lai");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Đa xoa thành công");

    }

    public void TimKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp cach ban muôn đê tim thông tin hang hoa"); 
        System.out.println("0.Theo Loai cua hang hoa");
        System.out.println("1.Theo Gia nhâp cua hang hoa");
        System.out.println("2.Theo Ngay nhâp cua hang hoa");

        int Nhap = sc.nextInt();
        switch (Nhap) {
            case 0:
                System.out.println("Co cac Loai hang hoa như: ");
                System.out.println("Thưc Phâm: tư khoa tim kiêm 'TP'");
                System.out.println("Sanh sư: tư khoa tim kiêm 'SS'");
                System.out.println("Điên may: tư khoa tim kiêm 'DM'");
                
                try {    
                    System.out.println("Nhâp Loai hang hoa ban muôn tim kiêm: ");
                    String Loai = sc.next();  
                    HangHoa hh = new HangHoa();
                    
                    for (int i = 0; i<Kho.HANGHOA.size();i++){
                        if(Loai.equals(Kho.HANGHOA.get(i).getLoai())){
                            System.out.println("Danh sach san phâm: ");
                            String Xuat = String.format("%s%10s%15s%20s%20s%20s%20s", "Loai", "Ma","Tên hang","Gia Nhâp","Sô Lương Nhâp", 
                            "Sô lương tôn", "Ngay Nhâp");
                            System.out.println(Xuat);
        
                            for (HangHoa h: Kho.HANGHOA){
                                String Xuat1 = String.format("%s%10d%15s%20d%20d%20d%20s", h.getLoai(), h.getMahang(),h.getTenHang(),
                                h.getGianhap(),h.getSoluongnhap(), h.getSoluongton(), h.getNgaynhap());
                                System.out.println(Xuat1);
                            }    
                        }
                    }

                    
                    } catch (InputMismatchException ei) {
                        System.out.println("Ban nhâp sai gia tri, mơi nhâp lai");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    
                break;
            case 1:
                
                try {      
                    System.out.println("Nhâp gia nhâp cua hang hoa:");
                    int Gianhap = sc.nextInt() ;      
                    HangHoa h = new HangHoa(Gianhap);
            
                    } catch (InputMismatchException ei) {
                        System.out.println("Không co hang hoa nao gia nhâp như vây đâu");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Danh sach san phâm: ");
                    String Xuat2 = String.format("%s%10s%15s%20s%20s%20s%20s", "Loai", "Ma","Tên hang","Gia Nhâp","Sô Lương Nhâp", 
                    "Sô lương tôn", "Ngay Nhâp");
                    System.out.println(Xuat2);

                    for (HangHoa h: Kho.HANGHOA){
                        String Xuat1 = String.format("%s%10d%15s%20d%20d%20d%20s", h.getLoai(), h.getMahang(),h.getTenHang(),
                        h.getGianhap(),h.getSoluongnhap(), h.getSoluongton(), h.getNgaynhap());
                        System.out.println(Xuat1);
                    }
                break;
            case 2:
            try {        
                System.out.println("Nhâp ngay nhâp cua hang hoa ban muôn tim:");
                String Ngaynhap = sc.next() ;    
                HangHoa h = new HangHoa(Ngaynhap);
        
                } catch (InputMismatchException ei) {
                    System.out.println("Không co hang hoa nao co ngay nhâp như vây đâu");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Danh sach san phâm: ");
                String Xuat3 = String.format("%s%10s%15s%20s%20s%20s%20s", "Loai", "Ma","Tên hang","Gia Nhâp","Sô Lương Nhâp", 
                "Sô lương tôn", "Ngay Nhâp");
                System.out.println(Xuat3);

                for (HangHoa h: Kho.HANGHOA){
                    String Xuat1 = String.format("%s%10d%15s%20d%20d%20d%20s", h.getLoai(), h.getMahang(),h.getTenHang(),
                    h.getGianhap(),h.getSoluongnhap(), h.getSoluongton(), h.getNgaynhap());
                    System.out.println(Xuat1);
                }
                break;
            default:
                break;
        }
    }

    public void SapXep(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp sô biêu thi cach ban muôn săp xêp hang hoa"); 
        System.out.println("0.Săp xêp theo gia nhâp tăng dân");
        System.out.println("1.Săp xêp theo ngay nhâp tăng dân");
        System.out.println("2.Săp xêp theo gia nhâp giam dân");
        System.out.println("3.Săp xêp theo ngay nhâp giam dân");
        System.out.println("4.Săp xêp theo gia va loai nhâp tăng dân");
        System.out.println("5.Săp xêp theo ngay va loai nhâp tăng dân");
        System.out.println("6.Săp xêp theo gia va loai nhâp giam dân");
        System.out.println("7.Săp xêp theo ngay va loai nhâp giam dân");
        int So = sc.nextInt(); 
        switch (So) {
            case 0:
            
            System.out.println("Danh sach san phâm: ");
            String Xuat3 = String.format("%s%10s%15s%20s%20s%20s%20s", "Loai", "Ma","Tên hang","Gia Nhâp","Sô Lương Nhâp", 
            "Sô lương tôn", "Ngay Nhâp");
            System.out.println(Xuat3);

            for (HangHoa h: Kho.HANGHOA){
                String Xuat1 = String.format("%s%10d%15s%20d%20d%20d%20s", h.getLoai(), h.getMahang(),h.getTenHang(),
                h.getGianhap(),h.getSoluongnhap(), h.getSoluongton(), h.getNgaynhap());
                System.out.println(Xuat1);
            }
                break;
            
            case 1:
                break;
            
            case 2:
                break;

            case 3:
                
                break;
            
            case 4:
                break;
            
            case 5:
                break;    

            case 6:
                break;
            
            case 7:
                break;    
            default:
                break;
        }
    }

    public void ThongKe(){

    }

}
