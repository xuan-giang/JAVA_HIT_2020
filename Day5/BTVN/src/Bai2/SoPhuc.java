package Bai2;

import java.util.Scanner;

public class SoPhuc {
    private int Thuc, Ao;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Phần thực: ");
        Thuc = sc.nextInt();
        System.out.println("Phần ảo: ");
        Ao = sc.nextInt();
    }

    @Override
    public String toString() {
        return "(" +
                Thuc + " + " +
                 Ao +
                "i)";
    }

    public SoPhuc Cong(SoPhuc a){
        SoPhuc c = new SoPhuc();
        c.Thuc = a.Thuc + this.Thuc;
        c.Ao = a.Ao + this.Ao;
        return c;
    }
    public SoPhuc Tru(SoPhuc a){
        SoPhuc c = new SoPhuc();
        c.Thuc = this.Thuc - a.Thuc;
        c.Ao = this.Ao - a.Ao;
        return c;
    }
}
