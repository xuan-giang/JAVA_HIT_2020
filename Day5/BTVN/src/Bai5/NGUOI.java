package Bai5;

import java.util.Scanner;

public class NGUOI {
    protected String hoTen, queQuan, ngaySinh;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Quê quán: ");
        queQuan = sc.nextLine();
    }

    public void Xuat(){
        System.out.println(hoTen + "  " + ngaySinh + "  " + queQuan);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
