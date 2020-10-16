package Bai1;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day +
                "/" + month +
                "/" + year +
                "";
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay sinh: ");
        this.day = sc.nextInt();
        System.out.print("Nhap tháng sinh: ");
        this.month = sc.nextInt();
        System.out.print("Nhap nam sinh: ");
        this.year = sc.nextInt();
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
