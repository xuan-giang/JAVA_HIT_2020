package Bai1;

import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private Date ngaySinh;

    public SinhVien() {

    }

    public SinhVien(String maSinhVien, String hoTen) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
    }
    public void HienThi(){
        System.out.print("Tên là: " + hoTen);
        System.out.print("Mã SV: " + maSinhVien + "\n");
        System.out.print(ngaySinh.toString());
    }

    public void HienThi(int stt){
        System.out.print("STT: "+stt);
        System.out.print("Tên là: " + hoTen);
        System.out.print("Mã SV: " + maSinhVien + "\n");
        System.out.print(ngaySinh.toString());
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void InputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sv: ");
        this.maSinhVien = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap thong tin ngay sinh: ");
        ngaySinh = new Date();
        ngaySinh.Input();
    }
}
