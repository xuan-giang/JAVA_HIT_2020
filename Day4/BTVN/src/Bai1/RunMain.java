package Bai1;

import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập số lượng sách: ");
        n = sc.nextInt();
        SACH []a = new SACH[n];
        for(int i = 0; i < n; i++){
            a[i] = new SACH();
            a[i].NHAP();
        }

        System.out.println("THÔNG TIN VỪA NHẬP: ");
        for(SACH sach:a){
            sach.XUAT();
        }
    }
}
