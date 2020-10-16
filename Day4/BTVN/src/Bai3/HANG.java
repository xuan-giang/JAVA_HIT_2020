package Bai3;

import java.util.Scanner;

public class HANG {
    private String maHang, tenHang;
    private int donGia;



    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã hàng: "); maHang = sc.nextLine();
        System.out.print("Tên hàng: "); tenHang = sc.nextLine();
        System.out.print("Đơn giá: "); donGia = sc.nextInt();
    }

    public void XUAT(){
        System.out.println(maHang + "   " + tenHang + "   " + donGia + " VND");
    }


    public int getDonGia() {
        return donGia;
    }
}
