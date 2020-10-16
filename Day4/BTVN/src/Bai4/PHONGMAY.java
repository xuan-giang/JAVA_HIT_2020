package Bai4;

import java.util.Scanner;

public class PHONGMAY {
    private String maPhong, tenPhong;
    private int dienTich, n;
    QUANLY x = new QUANLY();
    MAY []y;

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã phòng: "); maPhong = sc.nextLine();
        System.out.println("Tên phòng: "); tenPhong = sc.nextLine();
        System.out.println("Diện tích: "); dienTich = sc.nextInt();
        x.NHAP();
        System.out.println("Số lượng máy: "); n = sc.nextInt();
        y = new MAY[n];
        for(int i = 0; i < n ; i++){
            y[i] = new MAY();
            System.out.println("Nhập thông tin máy thứ " + i + 1 +":");
            y[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.println("Mã phòng: " +maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " +dienTich + " m2");
        System.out.print("Người quản lý: "); x.XUAT();
        System.out.println("\nDanh sách máy: ");
        for(int i = 0; i < n; i++){
            y[i].XUAT();
        }
    }
}
