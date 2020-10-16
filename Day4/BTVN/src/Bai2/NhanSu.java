package Bai2;

import java.util.Scanner;

public class NhanSu {
    private String maNhanSu = new String();
    private String hoTen = new String();
    Date NS;

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã nhân sự: "); maNhanSu = sc.nextLine();
        System.out.print("Họ tên: "); hoTen = sc.nextLine();
        NS = new Date();
        System.out.print("Ngày sinh "); NS.NHAP();
    }

    public void XUAT(){
        System.out.println("THÔNG TIN NHÂN SỰ:");
        System.out.println("Mã nhân sự: " + maNhanSu);
        System.out.println("Họ tên: "+ hoTen);
        System.out.println("Ngày sinh: "+NS.XUAT());
    }
}
