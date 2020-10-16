package Bai2;

import java.util.Scanner;

public class bai2 {
    public static Scanner nhap = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so luong phan tu: ");
        n = nhap.nextInt();
        int []a = new int[n];
        System.out.print("Nhap mang: ");
        NhapMang(a,n);
        TimMinMax(a,n);
        SapXep(a,n);
        System.out.print("Mang sau khi sap xep: ");
        XuatMang(a,n);
    }
    public static void NhapMang(int[] a, int n){
        for(int i = 0; i < n; i++){
            a[i] = nhap.nextInt();
        }
    }
    public static void XuatMang(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void TimMinMax(int[] a, int n){
        int max = a[0], min = a[1];
        for(int i = 0; i < n; i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Max: "+max+"\nMin: "+min);
    }
    public static void SapXep(int[] a, int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
