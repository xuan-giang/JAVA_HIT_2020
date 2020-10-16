package Bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Nhap vao 3 so: ");
        Scanner nhap = new Scanner(System.in);
        a = nhap.nextInt();
        b = nhap.nextInt();
        c = nhap.nextInt();
        System.out.println("So lon nhat: "+Math.max(Math.max(a,b),c));
    }
}
