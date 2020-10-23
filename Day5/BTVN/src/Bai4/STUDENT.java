package Bai4;

import java.util.Scanner;

public class STUDENT {
    private String name, id, address;
    private int age;
    private double gpa;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Full name: ");
        name = sc.nextLine();
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("GPA: ");
        gpa = sc.nextDouble();
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public void Xuat(){
        System.out.printf("%15s %20s %13s %15s %15s\n", id, name, age,address,gpa);
    }
}
