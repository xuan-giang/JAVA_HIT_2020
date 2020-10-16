package Bai2;
import Bai1.Date;

import java.util.ArrayList;

public class RunMain {
    public static void main(String[] args) {
        Person[] nguoi = new Person[2];
        for(int i = 0; i < nguoi.length; i++){
            System.out.println("Nhập thông tin người thứ " + i + 1 + ":");
            nguoi[i] = new Person();
            nguoi[i].nhap();
        }
           
        //ArrayList<String> list = new ArrayList<>();
        System.out.println("\nTHÔNG TIN VỪA NHẬP: ");
        for(int i = 0; i < nguoi.length; i++){
            System.out.println("=========================");
            nguoi[i].xuat();
        }
    }
}
