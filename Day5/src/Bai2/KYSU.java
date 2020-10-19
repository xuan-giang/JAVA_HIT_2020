package Bai2;

import Bai1.Nguoi;

import java.util.Date;
import java.util.Scanner;

public class KYSU extends PERSON{
    private String Nganh;
    private int namTN;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.println("Ngành học :");
        Nganh = sc.nextLine();
        System.out.println("Năm tốt nghiệp: ");
        namTN = sc.nextInt();
    }

    public void Xuat(){
        super.Xuat();
        System.out.println("Ngành học :"+Nganh);

        System.out.println("Năm tốt nghiệp: "+namTN);

    }

    public int getNamTN() {
        return namTN;
    }
}
