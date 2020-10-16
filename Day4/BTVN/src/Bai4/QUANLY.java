package Bai4;

import java.util.Scanner;

public class QUANLY {
    private String maQL, hoTen;

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin người quản lý: ");
        System.out.println("Mã quản lý"); maQL = sc.nextLine();
        System.out.println("Họ tên: "); hoTen = sc.nextLine();
    }
    public void XUAT(){
        System.out.println(maQL + " - " + hoTen);
    }
}
