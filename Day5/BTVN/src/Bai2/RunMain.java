package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoPhuc p1 = new SoPhuc();
        SoPhuc p2 = new SoPhuc();
        System.out.print("Số phức thứ nhất: ");
        p1.Nhap();;
        System.out.print("Số phức thứ hai: ");
        p2.Nhap();
        System.out.println(p1.toString() + " + " + p2.toString() +" = " + p1.Cong(p2).toString());
        System.out.println(p1.toString() +" - " + p2.toString() +" = " + p1.Tru(p2).toString());
    }
}
