package Bai1;

import java.util.Scanner;

public class SinhVien  extends Nguoi{
    private String maSinhVien;
    private String nganhHoc;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.println("Mã sinh viên: ");
        maSinhVien = sc.nextLine();
        System.out.println("Ngành học: ");
        nganhHoc = sc.nextLine();
    }

    public void Xuat(){
        super.Xuat();
        System.out.println("Mã sinh viên: "+maSinhVien);
        System.out.println("Ngành học: "+nganhHoc);
    }
}
