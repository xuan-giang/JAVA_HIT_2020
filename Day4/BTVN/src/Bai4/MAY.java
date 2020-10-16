package Bai4;

import java.util.Scanner;

public class MAY {
    private String maMay, kieuMay, tinhTrang;

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã máy: "); maMay = sc.nextLine();
        System.out.println("Kiểu máy: "); kieuMay = sc.nextLine();
        System.out.println("Tình trạng: "); tinhTrang = sc.nextLine();
    }
    public void XUAT(){
        System.out.println(maMay + "    " + kieuMay + "    " +tinhTrang);
    }
}
