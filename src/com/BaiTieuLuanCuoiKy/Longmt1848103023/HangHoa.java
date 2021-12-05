/*
*Created date: Nov 17, 2021
*Author: Mai Thanh Long
*/
package com.BaiTieuLuanCuoiKy.Longmt1848103023;


public class HangHoa {
    private String Loai;
    private int Mahang;
    private String TenHang;
    private int Gianhap;
    private int Soluongnhap;
    private int Soluongton;
    private String Ngaynhap;


    public HangHoa(String Loai){
        this.Loai = Loai;
    }

    public HangHoa(int Gianhap){
        this.Gianhap = Gianhap;
    }

    public HangHoa(){

    }


    public HangHoa(String Loai, int Mahang, String TenHang, int Gianhap , int Soluongnhap, int Soluongton, String Ngaynhap){
        this.Loai=Loai;
        this.Mahang=Mahang;
        this.TenHang=TenHang;
        this.Gianhap=Gianhap;
        this.Soluongnhap=Soluongnhap;
        this.Soluongton=Soluongton;
        this.Ngaynhap=Ngaynhap;
    }

    public HangHoa(String Loai, String TenHang, int Gianhap , int Soluongnhap, int Soluongton, String Ngaynhap){
        this.Loai=Loai;
        this.TenHang=TenHang;
        this.Gianhap=Gianhap;
        this.Soluongnhap=Soluongnhap;
        this.Soluongton=Soluongton;
        this.Ngaynhap=Ngaynhap;
    }


    /**
     * @return the loai
     */
    public String getLoai() {
        return Loai;
    }
    /**
     * @param loai the loai to set
     */
    public void setLoai(String loai) {
        this.Loai = loai;
    }  
    /**
     * @return the soluongnhap
     */
    public int getSoluongnhap() {
        return Soluongnhap;
    }
    /**
     * @param soluongnhap the soluongnhap to set
     */
    public void setSoluongnhap(int soluongnhap) {
        this.Soluongnhap = soluongnhap;
    }
    /**
     * @return the ngaynhap
     */
    public String getNgaynhap() {
        return Ngaynhap;
    }
    /**
     * @param ngaynhap the ngaynhap to set
     */
    public void setNgaynhap(String ngaynhap) {
        this.Ngaynhap = ngaynhap;
    }
    /**
     * @return the soluongto
     */
    public int getSoluongton() {
        return Soluongton;
    }
    /**
     * @param soluongto the soluongto to set
     */
    public void setSoluongton(int soluongton) {
        this.Soluongton = soluongton;
    }
    /**
     * @return the gianhap
     */
    public int getGianhap() {
        return Gianhap;
    }
    /**
     * @param gianhap the gianhap to set
     */
    public void setGianhap(int gianhap) {
        this.Gianhap = gianhap;
    }
    /**
     * @return the tenHang
     */
    public String getTenHang() {
        return TenHang;
    }
    /**
     * @param tenHang the tenHang to set
     */
    public void setTenHang(String tenHang) {
        this.TenHang = tenHang;
    }
    /**
     * @return the mahang
     */
    public int getMahang() {
        return Mahang;
    }
    /**
     * @param mahang the mahang to set
     */
    public void setMahang(int mahang) {
        this.Mahang = mahang;
    }
      
}
