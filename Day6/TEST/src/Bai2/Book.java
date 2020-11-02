package Bai2;

import java.util.Scanner;

public class Book extends Document{
    private int numOfPage;
    private String author;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.print("Number of page: ");
        numOfPage = sc.nextInt();
        sc.nextLine();
        System.out.print("Author: ");
        author = sc.nextLine();
    }

    public void Output(){
        super.Output();
        System.out.printf("%15s %15s\n", numOfPage, author);
    }
}
