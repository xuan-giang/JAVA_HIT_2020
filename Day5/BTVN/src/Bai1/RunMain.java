package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

    public class RunMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n, check = 0;
            System.out.println("Nhập số lượng điều hòa: ");
            n = sc.nextInt();
            ArrayList<DieuHoa> list = new ArrayList<>();

            for(int i = 0; i < n; i++){
                DieuHoa dh = new DieuHoa();
                dh.Nhap();
                list.add(dh);
            }
            int minPrice = list.get(0).getGiaBan();
            for(DieuHoa dieuhoa : list){
                if(dieuhoa.getHangSanXuat().compareToIgnoreCase("Electrolux") == 0){
                    check = 1;
                    minPrice = dieuhoa.getGiaBan();
                    break;
                }
            }

            if(check == 1){
                for(DieuHoa dh1 : list){
                    if(dh1.getHangSanXuat().compareToIgnoreCase("Electrolux") == 0 && dh1.getGiaBan() < minPrice){
                        minPrice = dh1.getGiaBan();
                    }
                }
                System.out.println("====================================");
                System.out.println("Các điều hòa có hãng sản xuất Electrolux và giá bán thấp nhất.");
                TieuDe();
                for(DieuHoa dh2 : list){
                    if(dh2.getHangSanXuat().compareToIgnoreCase("Electrolux") == 0 && dh2.getGiaBan() == minPrice){
                        dh2.Xuat();
                    }
                }
            }else {
                System.out.println("Không có hãng Electrolux");
            }

        }
        public static void TieuDe(){
            System.out.printf("%15s %20s %22s %20s %20s %18s\n", "Mã SP", "Tên SP", "Hãng sản xuất", "Ngày nhập", "Công suất", "Giá bán (đv: triệu đồng)");
        }
    }

