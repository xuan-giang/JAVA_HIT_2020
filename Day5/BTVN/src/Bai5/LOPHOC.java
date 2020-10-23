package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class LOPHOC {
    private String maLH, tenLH, ngayMo, giaoVien;
    private int n;
    //SINHVIEN[] x;
    ArrayList<SINHVIEN> x = new ArrayList<>();
    public LOPHOC() {
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã lớp học: ");
        maLH = sc.nextLine();
        System.out.println("Nhập tên lớp học: ");
        tenLH = sc.nextLine();
        System.out.println("Ngày mở: ");
        ngayMo = sc.nextLine();
        System.out.println("Giáo viên: ");
        giaoVien = sc.nextLine();
        System.out.println("Số lượng sinh viên: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            SINHVIEN temp = new SINHVIEN();
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1) + ":");
            temp.NHAP();
            x.add(temp);
        }
    }
    public void XUAT(){
        int countK14 = 0;
        System.out.println("Mã lớp học: " + maLH);
        System.out.println("Tên lớp học: " + tenLH);
        System.out.println("Ngày mở: " + ngayMo);
        System.out.println("Giáo viên: " +giaoVien);
        System.out.println("Số lượng sinh viên: " +n);
        System.out.printf("\nDanh sách sinh viên: ");
        TieuDe();
        for(SINHVIEN list : x){
            if(list.getKhoaHoc() == 14){
                countK14++;
            }
            list.XUAT();
        }
        System.out.print("\n\nSố sinh viên K14: " +countK14);

        for(int i = 0; i < x.size(); i++){
            for(int j = i + 1; j < x.size(); j++){
                if(x.get(i).getKhoaHoc() > x.get(j).getKhoaHoc()){
                    SINHVIEN tmp = x.get(i);
                    x.set(i, x.get(j));
                    x.set(j, tmp);
                }
            }
        }
        System.out.printf("\n\nDANH SÁCH SAU KHI SẮP XẾP\n");
        TieuDe();
        for(SINHVIEN listsx : x){
            listsx.XUAT();
        }
    }

    public static void TieuDe(){
        System.out.printf("%20s %20s %20s %17s %20s %20s\n", "Mã sinh viên", "Họ tên", "Ngày sinh", "Khóa học" ,"Ngành", "Quên quán");
    }
}
