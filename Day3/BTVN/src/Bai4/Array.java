package Bai4;

import java.util.Scanner;

public class Array {
    public static Scanner scanner = new Scanner(System.in);
    private int n;
    private int[] a;

    public Array() {
    }

    public Array(int n, int[] a) {
        this.n = n;
        this.a = a;
    }

    public void InputData(){
        n = scanner.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
    }
    public void Show(){
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
    }
    public int Sum(){
        int sum = 0;
        for(int  i = 0; i < n; i++){
            sum += a[i];
        }
        return sum;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }


}
