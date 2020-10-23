package Bai5;

import java.util.Scanner;

public class SINHVIEN extends NGUOI{
    private String maSinhVien, nganh;
    private int khoaHoc;


    public SINHVIEN() {
    }

    public SINHVIEN(String maSinhVien, String nganh, int khoaHoc) {
        this.maSinhVien = maSinhVien;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nMã sinh viên: ");
        maSinhVien = sc.nextLine();
        super.Nhap();
        System.out.print("Ngành: ");
        nganh = sc.nextLine();
        System.out.print("Khóa học: ");
        khoaHoc = sc.nextInt();
    }
    public void XUAT(){
        System.out.printf("%20s %20s %20s %15s %21s %20s\n", maSinhVien, hoTen, ngaySinh, khoaHoc ,nganh, queQuan);
    }
}
