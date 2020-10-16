package Bai4;

import java.util.Scanner;

public class bai4 {
    public static Scanner nhap = new Scanner(System.in);
    public static void main(String[] args) {
        int n, S = 0;
        System.out.print("Nhập n: ");
        n = nhap.nextInt();
        int []a = new int[n];
        System.out.print("Nhập mảng: ");
        for(int i = 0; i < n; i++){
            a[i] = nhap.nextInt();
        }
        int[] prime = Prime(n);
        for(int i = 0; i < a.length; i++){
            S += (isPrime(a[i]) ? a[i] +prime[i] - i : a[i]);
        }
        System.out.println("S = "+S);
    }
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return n > 1;
    }
    public static int[] Prime(int n){
        int count = 0, i = 2;
        int []temp = new int[n];
        while (count < n){
            if(isPrime(i)){
                temp[count] = i;
                count++;
            }
            i++;
        }
        return temp;
    }
}
