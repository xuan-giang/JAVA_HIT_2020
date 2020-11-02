package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select; boolean added = false;
        ArrayList<Book> list = new ArrayList<>();
        while (true){
        System.out.println("");
        System.out.println("1. Add book.");
        System.out.println("2. Edit book by id.");
        System.out.println("3. Delete book by id.");
        System.out.println("4. Sort book by name (ascending).");
        System.out.println("5. Sort book by price (descending).");
        System.out.println("6. Show all books.");
        System.out.println("0. Exit.");
        System.out.print("Your select: ");

        select = sc.nextInt();

            switch (select){
                case 1:
                    Book book = new Book();
                    book.Input();
                    list.add(book);
                    added = true;
                    System.out.println("------ SUCCESSFULLY ------");
                    break;
                case 2:
                if(added){
                    sc.nextLine();
                    System.out.println("Enter the ID need to edit: ");
                    String  tempID = new String();

                    tempID = sc.nextLine();
                    for(Book tempList : list){
                        if(tempList.getId().compareToIgnoreCase(tempID) == 0){
                            tempList.Input();
                            System.out.println("------ SUCCESSFULLY ------");
                            break;
                        }
                    }
                    System.out.println("No have the ID you entered!");
                }else {
                    System.out.println("ERROR: You must enter information of book");
                }
                    break;
                case 3:
                    if(added){
                        sc.nextLine();
                        System.out.println("Enter the ID need to delete: ");
                        String  delID = new String();

                        delID = sc.nextLine();
                        for(Book delList : list){
                            if(delList.getId().compareToIgnoreCase(delID) == 0){
                                list.remove(delList);
                                System.out.println("------ SUCCESSFULLY ------");
                                break;
                            }
                        }
                        System.out.println("No have the ID you entered!");
                    }else {
                        System.out.println("ERROR: You must enter information of book");
                    }
                    break;
                case 4:
                    if(added){
                        Collections.sort(list, new Comparator<Book>() {
                            @Override
                            public int compare(Book o1, Book o2) {
                                return o1.getName().compareTo(o2.getName());
                            }
                        });
                    }else {
                        System.out.println("ERROR: You must enter information of book");
                    }

                    break;
                case 5:
                    if(added){
                        Collections.sort(list, new Comparator<Book>() {
                            @Override
                            public int compare(Book o1, Book o2) {
                               return o1.getPrice() > o2.getPrice() ? 1 : -1;
                            }
                        });
                    }else {
                        System.out.println("ERROR: You must enter information of book");
                    }

                    break;
                case 6:
                    Tittle();
                    for(Book books : list){
                        books.Output();
                    }
                    break;
                case 0:
                    if(added){
                        System.exit(0);
                        break;
                    }else {
                        System.out.println("Ơ bạn không nhập gì à???, nhập đê");
                    }

            }
        }


    }
    public static void Tittle(){
        System.out.printf("%10s %18s %16s %15s %17s %13s\n", "ID", "Name", "Publisher", "Price", "Number of Page", "Author");
    }

}
