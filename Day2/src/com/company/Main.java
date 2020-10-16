package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c;
        Scanner nhap = new Scanner(System.in);
        a = nhap.nextInt();
        b = nhap.nextInt();
        c = nhap.nextInt();

        System.out.println("So lon nhat: " +Max(Max(a,b),c));


    }
    public static int Max(int a, int b){
        return (a > b) ? a : b;
    }
}

