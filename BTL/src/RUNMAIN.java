import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.*;

public class RUNMAIN {
    private static BOOKSTORE bookstore = new BOOKSTORE();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
    }

    public static void menu() {
        int luaChon = 0;
        boolean flag = true;
        do {
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
                switch (luaChon) {
                    case 1:
                        flag = false;
                        nhapThanhToan();
                        break;
                    case 2:
                        flag = false;
                        menu2();
                        break;
                    case 3:
                        flag = false;
                        menu3();
                        break;
                    case 4:
                        flag = false;
                        menu4();
                        break;
                    case 5:
                        flag = false;
                        menu5();
                        break;
                    case 6:
                        flag = false;
                        menu6();
                        break;
                    case 7:
                        System.exit(0);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                flag = true;
                sc.nextLine();
            }
        } while (flag == true);
    }

    public static void menu2() {
        int luaChon = 0;
        boolean flag1 = true;
        do {
            System.out.println("-------------- QUẢN LÝ SÁCH --------------");
            System.out.println("1. Nhập sách");
            System.out.println("2. Chỉnh sửa thông tin sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Quay lại");
            System.out.print("Lựa chọn: ");
            try {
                luaChon = sc.nextInt();
                switch (luaChon) {
                    case 1:

                        addBook();
                        break;
                    case 2:

                        editBook();
                        break;
                    case 3:

                        deleteBook();
                        break;
                    case 4:
                        menu();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                flag1 = true;
                sc.nextLine();
            }
        } while (flag1 == true);
    }

    public static void menu3() {
        int luaChon = 0;
        boolean flag = true;
        do {
            System.out.println("-------------- QUẢN LÝ KHÁCH --------------");
            System.out.println("1. Chỉnh sửa thông tin khách");
            System.out.println("2. Hiển thị danh sách khách");
            System.out.println("3. Xóa khách");
            System.out.println("4. Quay lại");
            System.out.print("Lựa chọn: ");
            try {
                luaChon = sc.nextInt();
                switch (luaChon) {
                    case 1:
                        flag = false;
                        editCustomer();
                        break;
                    case 2:
                        flag = false;
                        listCustomer();
                        break;
                    case 3:
                        flag = false;
                        deleteCustomer();
                        break;
                    case 4:
                        menu();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                flag = true;
                sc.nextLine();
            }
        } while (flag == true);

    }

    public static void menu4() {
        //   String type;
        int luaChon = 0;
        boolean flag = true;
        do {
            System.out.println("-------------- TRA CỨU --------------");
            System.out.println("1. Tra cứu tình trạng sách");
            System.out.println("2. Tra cứu thông tin khách");
            System.out.println("3. Quay lại");
            System.out.print("Lựa chọn: ");
            try {
                luaChon = sc.nextInt();
                sc.nextLine();
                switch (luaChon) {
                    case 1:
                        //System.out.println("Nhập phương thức tìm: ");
                        //   type = sc.nextLine();
                        findBook();
                        break;
                    case 2:
                        findCustomer();
                        break;
                    case 3:
                        menu();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                flag = true;
                sc.nextLine();
            }
        } while (flag == true);
    }

    public static void menu5() {
        int luaChon = 0;
        boolean flag = true;
        do {
            System.out.println("-------------- MÃ GIẢM GIÁ --------------");
            System.out.println("1. Tạo mã giảm giá");
            System.out.println("2. Hủy mã giảm giá");
            System.out.println("3. Quay lại");
            System.out.print("Lựa chọn: ");
            try {
                luaChon = sc.nextInt();
                switch (luaChon) {
                    case 1:
                        System.out.println("Mã giảm giá 30%: " + getVoucher());
                        System.out.println("Hạn sử dụng:  7 ngày");
                        break;
                    case 2:
                        System.out.println("Tính năng này sẽ update trong thời gian tới\nVui lòng quay lại sau");
                        break;
                    case 3:
                        menu();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                flag = true;
                sc.nextLine();
            }
        } while (flag == true);

    }

    public static void menu6() {
        int luaChon = 0;
        boolean flag = true;
        do {
            System.out.println("<UPDATE: Tính năng này đang phát triển, vui lòng quay lại sau>");
            System.out.println("-------------- BÁO CÁO --------------");
            System.out.println("1. Hiển thị sách bán chạy");
            System.out.println("2. Hiển thị danh sách sách đã bán");
            System.out.println("3. Hiển thị khách hàng tiềm năng");
            System.out.println("4. Quay lại");
            System.out.print("Lựa chọn: ");
            try {
                luaChon = sc.nextInt();
                switch (luaChon) {
                    case 1:
                        //nhapThanhToan();
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
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Vui lòng nhập lại theo đúng các lựa chọn trên!");
                flag = true;
                sc.nextLine();
            }
        } while (flag == true);

    }

    public static void addBook() {

        Scanner sc = new Scanner(System.in);

        String tenSach = "";
        String maSach = "";
        String tacGia = "";
        double donGia = 0;
        int soLuong = 0;

        System.out.println("Mã sách: ");
        maSach = sc.nextLine();
        System.out.println("Tên sách: ");
        tenSach = sc.nextLine();
        System.out.println("Tác giả: ");
        tacGia = sc.nextLine();
        System.out.println("Giá: ");
        donGia = sc.nextDouble();
        System.out.println("Số lượng: ");
        soLuong = sc.nextInt();

        VALIDATE validateObj = new VALIDATE();
        boolean flagMaSach = validateObj.checkID(maSach);
        boolean flagTenSach = validateObj.checkName(tenSach);
        boolean flagTacGia = validateObj.checkAuthor(tacGia);
        boolean flagDonGia = validateObj.checkPrice(donGia);

        if (flagMaSach && flagTenSach && flagDonGia && flagTacGia) {
            BOOK bookObj = new BOOK(maSach, tenSach, tacGia, donGia, soLuong);
            bookstore.add(bookObj);
        } else {
            validateObj.getError();
        }

    }

    public static void editBook() {
        Scanner sc = new Scanner(System.in);

        String bookName = "";
        String bookID = "";
        String bookAuthor = "";
        double bookPrice = 0;
        int soLuong = 0;
        System.out.println("Mã sách: ");
        bookID = sc.nextLine();

        System.out.println("Tên sách: ");
        bookName = sc.nextLine();

        System.out.println("Tên tác giả: ");
        bookAuthor = sc.nextLine();

        System.out.println("Giá: ");
        bookPrice = sc.nextDouble();

        System.out.println("Số lượng: ");
        soLuong = sc.nextInt();
        bookstore.edit(bookID, bookName, bookAuthor, bookPrice, soLuong);
    }

    public static void deleteBook() {
        Scanner sc = new Scanner(System.in);

        String bookID = "";

        System.out.println("Mã sách cần xóa: ");
        bookID = sc.nextLine();

        bookstore.delete(bookID);
    }

    public static void findBook() {
        //switch (type) {
        //   case "id":
        Scanner sc = new Scanner(System.in);
        String bookID = "";
        System.out.println("Mã sách: ");
        bookID = sc.nextLine();
        System.out.printf("%5s %10s %7s %12s\n", "Mã", "Tên", "Giá", "Số Lượng");
        bookstore.find(bookID);
//                break;
//            case "max":
//               // bookstore.findMax();
//                break;
//            case "min":
//            default:
//              //  bookstore.findMin();
//                break;
        //      }

    }

    public static String getVoucher() {

        char data[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6',
                '7', '8', '9'};
        char index[] = new char[7];

        Random r = new Random();
        int i = 0;

        for (i = 0; i < (index.length); i++) {
            int ran = r.nextInt(data.length);
            index[i] = data[ran];
        }
        return new String(index);
    }

    public static void nhapThanhToan() {
        int soLuongMua, soLuongS, demS = 1, soLuongKhachMua = 0;
        String maSach, tenKhach = " ", SDT = " ";
        int checkContinue = 1;
//        System.out.print("Nhập số lượng sách: ");
//        soLuongMua = sc.nextInt();
        List<BILL> idTemp = new ArrayList<>();

        //sc.nextLine();
        while (checkContinue == 1) {
            int select = 1;
            BILL tempp = new BILL();
            System.out.printf("Mã sách thứ %d: ", demS);
            sc.nextLine();
            tempp.setId(sc.nextLine());
            demS++;
            System.out.print("Số lượng: ");
            int tempSlg = sc.nextInt();
            tempp.setSoLuongMua(tempSlg);
            soLuongKhachMua += tempSlg;
            idTemp.add(tempp);
            System.out.println("-------- Tiếp theo --------");
            System.out.println("Lựa chọn: \n1. Nhập tiếp\n2. Dừng lại\nLưa chọn: ");
            do {
                select = sc.nextInt();
                if (select != 1 && select != 2) {
                    System.out.print("Nhập lại lựa chọn: \n1. Nhập tiếp\n2. Dừng lại\nLưa chọn: ");
                }
            } while (select != 1 && select != 2);
            checkContinue = select;
        }

        System.out.print("Khách hàng: ");
        sc.nextLine();
        tenKhach = sc.nextLine();
        System.out.print("Số điện thoại khách: ");
        SDT = sc.nextLine();
        CUSTOMER customer = new CUSTOMER(tenKhach, SDT, soLuongKhachMua);
        bookstore.addCustomer(customer);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("================= HÓA ĐƠN MUA HÀNG =================");
        System.out.println("Ngày mua: " + formatter.format(date));
        System.out.println("Khách hàng: anh/chị " + tenKhach);
        System.out.println("\nChi tiết: ");
        System.out.printf("%17s %12s %8s\n", "Tên sách", "Số lượng", "Đơn giá");

        for (int i = 1; i <= idTemp.size(); i++) {
            if (i == idTemp.size()) {
                bookstore.showBill(idTemp.get(i - 1).getId(), idTemp.get(i - 1).getSoLuongMua(), 1);
            } else {
                bookstore.showBill(idTemp.get(i - 1).getId(), idTemp.get(i - 1).getSoLuongMua(), 0);
            }
        }

    }

    public static void editCustomer() {
        String hoTen = "";
        String SDT = "";

        System.out.println("Nhập họ tên khách: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập SĐT khách: ");
        SDT = sc.nextLine();
        bookstore.editCustomer(hoTen, SDT);

    }

    public static void findCustomer() {
        Scanner sc = new Scanner(System.in);
        String SDT = "";
        System.out.println("Số điện thoại: ");
        SDT = sc.nextLine();
        System.out.printf("%12s %12s %12s\n", "SĐT", "Tên", "Số Lượng mua");
        bookstore.findCustomer(SDT);
    }

    public static void deleteCustomer() {
        Scanner sc = new Scanner(System.in);

        String SDT = "";

        System.out.println("SĐT cần xóa: ");
        SDT = sc.nextLine();

        bookstore.deleteCustomer(SDT);
    }

    public static void listCustomer() {
        System.out.println("Danh sách khách");
        System.out.printf("%10s %14s %18s\n", "SĐT", "Tên", "Số Lượng mua");

        bookstore.listCustomer();
    }
}
