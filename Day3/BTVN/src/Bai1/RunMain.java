package Bai1;

public class RunMain{
    public static void main(String[] args) {
        Person DoanXinhGai = new Person("Nguyễn Văn Doan", "10/10/2020", "Nam", "Nhảy dây");
        Person DiepBueDe = new Person("Nguyễn Văn Diep", "1/1/2021", "Nữ", "Vẽ tranh");

        System.out.println("Thông tin người 1: ");
        DoanXinhGai.showInfo();
        System.out.println("=============================");
        System.out.println("Thông tin người 2: ");
        DiepBueDe.showInfo();
    }
}