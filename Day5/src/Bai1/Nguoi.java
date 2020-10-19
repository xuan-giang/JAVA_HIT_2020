package Bai1;

import java.util.Scanner;

public class Nguoi {
    private String theCanCuoc;
    private String hoTen;
    private String gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String theCanCuoc, String hoTen, String gioiTinh) {
        this.theCanCuoc = theCanCuoc;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
    }

    public String getTheCanCuoc() {
        return theCanCuoc;
    }

    public void setTheCanCuoc(String theCanCuoc) {
        this.theCanCuoc = theCanCuoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Thẻ căn cước: ");
        theCanCuoc = sc.nextLine();
        System.out.println("Họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Giới tính: ");
        gioiTinh = sc.nextLine();
    }

    public void Xuat(){
        System.out.println("Thẻ căn cước: " + theCanCuoc);
        System.out.println("Họ tên: " +hoTen);
        System.out.println("Giới tính: " +gioiTinh);
    }
}
