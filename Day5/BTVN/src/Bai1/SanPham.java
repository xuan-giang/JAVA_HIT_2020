package Bai1;

import java.util.Scanner;

public class SanPham{
    protected String congSuat;
    protected int giaBan;

    public int getGiaBan() {
        return giaBan;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Công suất: ");
        congSuat = sc.nextLine();
        System.out.println("Giá bán: ");
        giaBan = sc.nextInt();
    }

    public void Xuat() {
        System.out.println("Công suất: "+congSuat);
        System.out.println("Giá bán: "+giaBan + "triệu đồng");
    }
}
