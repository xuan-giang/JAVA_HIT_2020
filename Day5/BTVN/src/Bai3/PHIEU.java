package Bai3;

import java.util.Scanner;

public class PHIEU {
    private String maPhieu, tenPhieu;
    private DateTime a;
    private int n;
    private SANPHAM[] x;

    public void inputPhieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã phiếu: ");
        maPhieu = sc.nextLine();
        System.out.println("Tên phiếu: ");
        tenPhieu = sc.nextLine();
        System.out.println("Ngày nhập: ");
        a = new DateTime();
        a.inputDate();
        System.out.println("Số lượng sản phẩm: ");
        n = sc.nextInt();
        System.out.println("Nhập danh sách sản phẩm: ");
        x = new SANPHAM[n];
        for(int i = 0; i < n; i++){
            System.out.println("Sản phẩm thứ " + (i+1) + ": ");
            x[i] = new SANPHAM();
            x[i].inputSP();
        }
    }

    public void outputPhieu(){
        int sum = 0;
        System.out.println("Mã phiếu: " + maPhieu);
        System.out.println("Tên phiếu: " +tenPhieu);
        System.out.println("Ngày nhập: " + a.toString());
        System.out.println("Số lượng sản phẩm: "+n);
        System.out.println("Danh sách sản phẩm: ");
        for(int i = 0; i < n; i++){
            sum += x[i].getThanhTien();
            System.out.println("\nSản phẩm thứ " + (i+1) + ": ");
            x[i].outputSP();
        }
        System.out.println("\n--> THành tiền: " + sum + " VND");
    }
}
