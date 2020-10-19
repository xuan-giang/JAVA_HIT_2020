package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số lượng kỹ sư: ");
        n = sc.nextInt();
        KYSU []ks = new KYSU[n];
        for(int i = 0; i < n; i++){
            ks[i] = new KYSU();
            System.out.println("Nhập thông tin kỹ sư thứ " + (i + 1) + ": ");
            ks[i].Nhap();
        }
        System.out.println("=============================================");
        System.out.println("Các thông tin vừa nhập: ");
        for(KYSU ks1 : ks){
            System.out.println(ks1);
        }
        System.out.println("=============================================");
        System.out.println("Thông tin các sinh viên tốt nghiệp gần nhất là : ");
        int max = ks[0].getNamTN();
        for(int i = 0; i < n; i++){
            if(ks[i].getNamTN()> max){
                max = ks[i].getNamTN();
            }
        }
        for(int i = 0; i < n; i++){
            if(ks[i].getNamTN() == max){
                ks[i].Xuat();
            }
        }
    }
}
