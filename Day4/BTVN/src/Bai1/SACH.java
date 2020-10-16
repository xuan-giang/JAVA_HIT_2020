package Bai1;


import java.sql.SQLOutput;
import java.util.Scanner;

public class SACH {
    private String maSach, tenSach, nXB;
    private int soTrang, giaTien;

    public SACH() {
    }

    public SACH(String maSach, String tenSach, String nXB, int soTrang, int giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nXB = nXB;
        this.soTrang = soTrang;
        this.giaTien = giaTien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getnXB() {
        return nXB;
    }

    public void setnXB(String nXB) {
        this.nXB = nXB;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã sách: "); this.maSach = sc.nextLine();
        System.out.print("Tên sách: "); this.tenSach = sc.nextLine();
        System.out.print("Nhà xuất bản: "); this.nXB = sc.nextLine();
        System.out.print("Số trang: "); this.soTrang = sc.nextInt();
        System.out.print("Giá tiền: "); this.giaTien = sc.nextInt();
    }

    public void XUAT(){
        System.out.println(maSach + "  " + tenSach + "  " + nXB + "  " + soTrang + "  " + giaTien);
    }


}
