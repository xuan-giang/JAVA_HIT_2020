package Bai3;

import java.util.Scanner;

public class SANPHAM {
    private String maSanPham, tenSanPham;
    private int soLuong, donGia;

    public void inputSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã sản phẩm: ");
        maSanPham = sc.nextLine();
        System.out.print("Tên sản phẩm: ");
        tenSanPham = sc.nextLine();
        System.out.print("Số lượng: ");
        soLuong = sc.nextInt();
        System.out.print("ĐƠn giá: ");
        donGia = sc.nextInt();
    }
    public void outputSP(){
        System.out.printf("Mã sản phẩm: "+ maSanPham);
        System.out.printf("\tTên sản phẩm: "+tenSanPham);
        System.out.printf("\t\tSố lượng: "+soLuong);
        System.out.printf("\t\tĐƠn giá: "+donGia + " VND");
    }

    public int getThanhTien() {
        return donGia * soLuong;
    }
}
