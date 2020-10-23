package Bai5;

public class RunMain {
    public static void main(String[] args) {
        LOPHOC LH = new LOPHOC();
        System.out.println("Nhập thông tin lớp học: ");
        LH.NHAP();
        System.out.printf("\n %50s","THÔNG TIN LỚP HỌC: \n");
        LH.XUAT();
    }
}
