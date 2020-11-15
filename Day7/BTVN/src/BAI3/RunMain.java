package BAI3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int select;
        List<News> list = new ArrayList<>();

        while (true){
            menu();
            select = sc.nextInt();
            switch (select){
                case 1:
                    insertNews(list);
                    break;
                case 2:
                    viewListNews(list);
                    break;
                case 3:
                    for(int i = 0; i < list.size(); i++){
                        list.get(i).Calculate();
                        System.out.println("\nNews " + (i + 1));
                        list.get(i).Display();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
    public static void menu(){
        System.out.println();
        System.out.println("1. Insert news");
        System.out.println("2. View list news");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");
        System.out.print("Your select: ");
    }
    public static void insertNews(List<News> list){
        News news = new News();
        System.out.print("Enter your id: ");
        news.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter your title: ");
        news.setTitle(sc.nextLine());
        System.out.print("Enter publish date: ");
        news.setPublishDate(sc.nextLine());
        System.out.print("Enter author: ");
        news.setAuthor(sc.nextLine());
        System.out.print("Enter content: ");
        news.setContent(sc.nextLine());
        System.out.println("Enter 3 rates: ");
        System.out.print("First rate: ");
        news.rateList[0] = sc.nextInt();
        System.out.print("Second rate: ");
        news.rateList[1] = sc.nextInt();
        System.out.print("Three rate: ");
        news.rateList[2] = sc.nextInt();
        list.add(news);
    }
    public static void viewListNews(List<News> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println("\nNews " + (i + 1));
            list.get(i).Display();
        }
    }
}
