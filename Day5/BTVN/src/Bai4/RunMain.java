package Bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<STUDENT> list = new ArrayList<>();
        boolean added = false;
        while (true){
        System.out.println("");
        System.out.println("1. Add student");
        System.out.println("2. Edit student by id");
        System.out.println("3. Delete student by id");
        System.out.println("4. Sort students by gpa");
        System.out.println("5. Sort students by name");
        System.out.println("6. Show students");
        System.out.println("0. Exit");
        System.out.print("Your select: ");
        int select = sc.nextInt();
            switch (select){
                case 1:
                    System.out.println("Enter student info: ");
                    STUDENT sv = new STUDENT();
                    sv.Nhap();
                    list.add(sv);
                    added = true;
                    System.out.println(" ========== SUCCESSFULLY ==========");
                    break;
                case 2:
                    if(added){
                        System.out.print("Enter ID need to edit: ");
                        String tempID;
                        int check = 0;
                        sc.nextLine();
                        tempID        = sc.nextLine();
                        for(STUDENT sv_edit : list){
                            if(sv_edit.getId().compareToIgnoreCase(tempID) == 0){
                                System.out.println("Enter new info: ");
                                sv_edit.Nhap();
                                check =1;
                                System.out.println(" ========== SUCCESSFULLY ==========");
                            }
                        }
                        if(check == 0){
                            System.out.println("ID is invalid");
                        }

                        break;
                    }else {
                        System.out.println("You must enter student information!!!");
                        break;
                    }
                case 3:
                    if(added){
                        System.out.print("Enter ID need to delete: ");
                        String tempID;
                        int check = 0;
                        sc.nextLine();
                        tempID        = sc.nextLine();
                        for(STUDENT sv_del : list){
                            if(sv_del.getId().compareToIgnoreCase(tempID) == 0){
                                list.remove(sv_del);
                                check = 1;
                                System.out.println(" ========== SUCCESSFULLY ==========");
                            }
                        }
                        if(check == 0){
                            System.out.println("ID is invalid");
                        }

                        break;
                    }else {
                        System.out.println("You must enter student information!!!");
                        break;
                    }
                case 4:
                    Collections.sort(list, new Comparator<STUDENT>() {
                        @Override
                        public int compare(STUDENT o1, STUDENT o2) {
                            return o1.getGpa() > o2.getGpa() ? 1 : -1;
                        }
                    });
                    System.out.println(" ========== SUCCESSFULLY ==========");
                    break;
                case 5:
                    Collections.sort(list, new Comparator<STUDENT>() {
                        @Override
                        public int compare(STUDENT o1, STUDENT o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });
                    System.out.println(" ========== SUCCESSFULLY ==========");
                    break;
                case 6:
                    System.out.println("DANH SÁCH SINH VIÊN: ");
                    Tittle();
                    for(STUDENT SV : list){
                        SV.Xuat();
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
    public static void Tittle(){
        System.out.printf("%15s %20s %13s %15s %15s\n", "ID", "NAME", "AGE","ADDRESS","GPA");
    }
}
