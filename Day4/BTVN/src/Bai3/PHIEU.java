package Bai3;

import java.util.Scanner;
import java.util.logging.Handler;

public class PHIEU {
    private String maPhieu;
    HANG []x ;
    private int n;

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã phiếu: "); maPhieu = sc.nextLine();
        System.out.println("Số lượng hàng: "); n = sc.nextInt();
        x = new HANG[n];
        for(int  i = 0; i < n; i++){
            x[i] = new HANG();
            System.out.println("Nhập thông tin hàng thứ " + i + 1 +":");
            x[i].NHAP();
        }
    }

    public void XUAT(){
        System.out.println("Mã phiếu: "+maPhieu);
        System.out.println("Số lượng hàng: "+n);
        System.out.println("Danh sách các mặt hàng: ");
        int sum = 0;

        for(int i = 0; i < n; i++){
            x[i].XUAT();
            sum += x[i].getDonGia();
        }
        System.out.println("Tổng tiền: "+sum +" VND");
    }
}
