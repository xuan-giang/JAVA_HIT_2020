package Bai1;

public class RunMain {
    public static void main(String[] args) {
        SinhVien x = new SinhVien();
        SinhVien[] arrSV = new SinhVien[3];
        for(int  i = 0; i < arrSV.length; i++){
            arrSV[i] = new SinhVien();
            System.out.println("Nhap thong tin sinh vien thu " + i+1 + ": ");
            arrSV[i].InputInfo();
        }
        for(int  i = 0; i < arrSV.length; i++){
            arrSV[i].HienThi();
        }
    }
}
