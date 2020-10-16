package Bai3;

import java.util.Scanner;

public class bai3 {
    public static Scanner nhap = new Scanner(System.in);
    public static void main(String[] args) {
        int n, selection;
        System.out.print("Nhập số lượng phần tử: ");
        n = nhap.nextInt();
        int[] a = new int[n];
        System.out.print("Nhập mảng: ");
        for(int i = 0; i < n; i++){
            a[i] = nhap.nextInt();
        }
        menu();
        System.out.print("Nhập lựa chọn: ");
        selection = nhap.nextInt();
        switch (selection){
            case 1:{
                System.out.print("Mảng vừa tạo: ");
                XuatMang(a,n);
                break;
            }
            case 2:{
                ThemPhanTu(a,n);

                break;
            }
            case 3:{
                XoaPhanTu(a,n);
                break;
            }
            case 4:{
                DaoNguocMang(a,n);
                break;
            }
            case 5:{
                ThaoTaca1(a,n);
                break;
            }
            case 6:{
                System.exit(0);

            }
        }
    }
    public static void menu(){
        System.out.println("\n1. Hiển thị mảng vừa tạo");
        System.out.println("2. Thêm một phần tử vào vị trí k");
        System.out.println("3. Xóa một phần tử ở vị trí k");
        System.out.println("4. Đảo ngược mảng");
        System.out.println("5. Hiển thị phần tử a[i] và các số chia hết cho a[1]");
        System.out.println("6. Thoát");
    }

    public static void XuatMang(int[] a, int n) {
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void ThemPhanTu(int []a, int n){
        int k, val;
        System.out.print("Nhap vi tri k: ");
        k = nhap.nextInt();
        System.out.print("Nhap gia tri can them: ");
        val = nhap.nextInt();

        for(int i = n; i > k - 1; i--){
            a[i] = a[i-1];
        }
        a[k - 1] = val;
        n++;
        XuatMang(a, n);
    }

    public static void XoaPhanTu(int []a, int n){
        int k;
        System.out.print("Nhập vị trí cần xóa: ");
        k = nhap.nextInt();
        for(int i = k - 1; i < n; i++){
            a[i] = a[i+1];
        }
        n--;
        XuatMang(a,n);
    }
    public static void DaoNguocMang(int []a, int n){
        for(int i = 0; i <= n/2; i++){
            int temp = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = temp;
        }
        XuatMang(a,n);
    }
    public static void ThaoTaca1(int[] a, int n){
        System.out.println("Phan tu a[1]: "+a[1]);
        int count = 0;
        System.out.print("Cac so chia het cho a[1]: ");
        for(int i = 0; i < n; i++){
            if(a[i] % a[1] == 0){
                System.out.print(a[i]+" ");
                count++;
            }
        }
        if(count!=0){
            System.out.println("Không có số nào chia hết cho "+a[1]);
        }
    }
}
