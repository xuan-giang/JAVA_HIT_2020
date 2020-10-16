package Bai2;

import java.util.Scanner;

public class Date {
    private int D, M, Y;

    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        D = sc.nextInt();
        M = sc.nextInt();
        Y = sc.nextInt();
    }

    public String XUAT(){
        return (D +"/" + M + "/" + Y);
    }

}
