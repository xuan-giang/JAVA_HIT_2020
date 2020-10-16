package Bai2;

import Bai1.Date;

import java.util.Scanner;

public class Person {
    private String name;
    private Date dateOfBirth;
    private String gender;
    private String hobbyMorning;
    private String hobbyEvening;

    public Person() {

    }

    public Person(String name, Date dateOfBirth, String gender, String hobbyMorning, String hobbyEvening) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.hobbyMorning = hobbyMorning;
        this.hobbyEvening = hobbyEvening;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobbyMorning() {
        return hobbyMorning;
    }

    public void setHobbyMorning(String hobbyMorning) {
        this.hobbyMorning = hobbyMorning;
    }

    public String getHobbyEvening() {
        return hobbyEvening;
    }

    public void setHobbyEvening(String hobbyEvening) {
        this.hobbyEvening = hobbyEvening;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        dateOfBirth = new Date();
        dateOfBirth.Input();
        System.out.print("Nhập giới tính: ");
        this.gender = sc.nextLine();
        System.out.print("Nhập sở thích ban ngày: ");
        hobbyMorning = sc.nextLine();
        System.out.print("Nhập sở thích ban đêm: ");
        hobbyEvening = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Tên: "+name);
        System.out.println("Ngày sinh: "+dateOfBirth.toString());
        System.out.println("Giới tính: "+gender);
        System.out.println("Sở thích ban ngày: "+hobbyMorning);
        System.out.println("Sở thích ban đêm: "+hobbyEvening);
    }
}
