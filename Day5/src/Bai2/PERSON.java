package Bai2;

import java.util.Scanner;

public class PERSON {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Quê quán: ");
        queQuan = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Họ tên: "+hoTen);

        System.out.println("Ngày sinh: "+ngaySinh);

        System.out.println("Quê quán: "+queQuan);
    }
}
