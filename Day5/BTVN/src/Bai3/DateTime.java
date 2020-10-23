package Bai3;

import java.util.Scanner;

public class DateTime {
    private int Ngay, Thang, Nam;

    public void inputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ngày: ");
        Ngay = sc.nextInt();
        System.out.print("Tháng: ");
        Thang = sc.nextInt();
        System.out.print("Năm: ");
        Nam = sc.nextInt();
    }
    @Override
    public String toString() {
        return Ngay + "/" + Thang + "/" + Nam;
    }
}
