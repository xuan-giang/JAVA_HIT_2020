package Bai2;

import java.util.Scanner;

public class Document {
    private String id, name, publisher;
    private long price;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Publisher: ");
        publisher = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextLong();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public void Output(){
        System.out.printf("%10s %18s %15s %16s", id, name, publisher, price);
    }
}
