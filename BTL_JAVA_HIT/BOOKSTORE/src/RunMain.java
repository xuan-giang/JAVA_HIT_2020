import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    List<BOOK> bookList = new ArrayList<>();
    List<CUSTOMER> customerList = new ArrayList<>();
    private static final String URL_SQLSERVER = "jdbc:sqlserver://localhost:1433;databaseName=book";
    private static final String USERNAME_SQLSERVER = "sa";
    private static final String PASSWORD_SQLSERVER = "123";
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();




    }
    public static void menu(){
        int luaChon = 0;
        boolean flag = true;
        do{
            System.out.println("--------------- MENU CHÍNH ---------------");
            System.out.println("1. Nhập thanh toán");
            System.out.println("2. Quản lý sách");
            System.out.println("3. Quản lý khách");
            System.out.println("4. Tra cứu");
            System.out.println("5. Tùy chỉnh");
            System.out.println("6. Báo cáo");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn: ");

            try {
                luaChon = sc.nextInt();
                switch (luaChon){
                    case 1:
                        flag = false;
                        nhapThanhToan();
                        break;
                    case 2:
                        flag = false;
                        menu2();
                        break;
                    case 3:
                        menu3();
                        break;
                    case 4:
                        menu4();
                        break;
                    case 5:
                        menu5();
                        break;
                    case 6:
                        menu6();
                        break;
                    case 7:
                        System.exit(0);
                        break;
                }
            }catch (Exception e){
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                flag = true;
                sc.nextLine();
            }
        }while (flag == true);
    }
    public static void menu2(){
        int luaChon = 0;
        boolean flag = true;
        do{
            System.out.println("-------------- QUẢN LÝ SÁCH --------------");
        System.out.println("1. Nhập sách");
        System.out.println("2. Chỉnh sửa thông tin sách");
        System.out.println("3. Xóa sách");
        System.out.println("4. Quay lại");
        System.out.print("Lựa chọn: ");
            try {
                luaChon = sc.nextInt();
                switch (luaChon){
                    case 1:
                        nhapThanhToan();
                        break;
                    case 2:
                        menu2();
                        break;
                    case 3:
                        menu3();
                        break;
                    case 4:
                        menu();
                        break;
                }
            }catch (Exception e){
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                flag = true;
                sc.nextLine();
            }
        }while (flag == true);
    }
    public static void menu3(){
            int luaChon = 0;
            boolean flag = true;
            do{
                System.out.println("-------------- QUẢN LÝ KHÁCH --------------");
        System.out.println("1. Chỉnh sửa thông tin khách");
        System.out.println("2. Hiển thị danh sách khách");
        System.out.println("3. Xóa khách");
        System.out.println("4. Quay lại");
        System.out.print("Lựa chọn: ");
                try {
                    luaChon = sc.nextInt();
                    switch (luaChon){
                        case 1:
                            nhapThanhToan();
                            break;
                        case 2:
                            menu2();
                            break;
                        case 3:
                            menu3();
                            break;
                        case 4:
                            menu();
                            break;
                    }
                }catch (Exception e){
                    System.out.println("Lỗi: " + e.getMessage());
                    System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                    flag = true;
                    sc.nextLine();
                }
            }while (flag == true);

    }
    public static void menu4(){
                int luaChon = 0;
                boolean flag = true;
                do{
                    System.out.println("-------------- TRA CỨU --------------");
        System.out.println("1. Tra cứu tình trạng sách");
        System.out.println("2. Tra cứu thông tin khách");
        System.out.println("3. Quay lại");
        System.out.print("Lựa chọn: ");
                    try {
                        luaChon = sc.nextInt();
                        switch (luaChon){
                            case 1:
                                nhapThanhToan();
                                break;
                            case 2:
                                menu2();
                                break;
                            case 3:
                                menu();
                                break;
                        }
                    }catch (Exception e){
                        System.out.println("Lỗi: " + e.getMessage());
                        System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                        flag = true;
                        sc.nextLine();
                    }
                }while (flag == true);
    }
    public static void menu5(){
                    int luaChon = 0;
                    boolean flag = true;
                    do{
                        System.out.println("-------------- MÃ GIẢM GIÁ --------------");
        System.out.println("1. Tạo mã giảm giá");
        System.out.println("2. Hủy mã giảm giá");
        System.out.println("3. Quay lại");
        System.out.print("Lựa chọn: ");
                        try {
                            luaChon = sc.nextInt();
                            switch (luaChon){
                                case 1:
                                    nhapThanhToan();
                                    break;
                                case 2:
                                    menu2();
                                    break;
                                case 3:
                                    menu();
                                    break;
                            }
                        }catch (Exception e){
                            System.out.println("Lỗi: " + e.getMessage());
                            System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                            flag = true;
                            sc.nextLine();
                        }
                    }while (flag == true);

    }
    public static void menu6(){
                        int luaChon = 0;
                        boolean flag = true;
                        do{
                            System.out.println("-------------- BÁO CÁO --------------");
        System.out.println("1. Hiển thị sách bán chạy");
        System.out.println("2. Hiển thị danh sách sách đã bán");
        System.out.println("3. Hiển thị khách hàng tiềm năng");
        System.out.println("4. Quay lại");
        System.out.print("Lựa chọn: ");
                            try {
                                luaChon = sc.nextInt();
                                switch (luaChon){
                                    case 1:
                                        nhapThanhToan();
                                        break;
                                    case 2:
                                        menu2();
                                        break;
                                    case 3:
                                        menu3();
                                        break;
                                    case 4:
                                        menu();
                                        break;
                                }
                            }catch (Exception e){
                                System.out.println("Lỗi: " + e.getMessage());
                                System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                                flag = true;
                                sc.nextLine();
                            }
                        }while (flag == true);

    }

    public static void nhapThanhToan(){

    }
    public static void nhapSach(List<BOOK> book){
        book = new ArrayList();
        BOOK a = new BOOK();
        a.nhapSach();
        book.add(a);
    }
}
