import java.util.Scanner;

public class BOOK {
    private int maSach, donGia;
    private String tenSach, tacGia;

    public BOOK() {
    }

    public BOOK(int maSach, String tenSach, String tacGia, int donGia) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void nhapSach(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: "); setMaSach(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên sách: "); setTenSach(sc.nextLine());
        System.out.print("Nhập tên tác giả: "); setTacGia(sc.nextLine());
        System.out.print("Nhập đơn giá: "); setDonGia(sc.nextInt());
    }

    @Override
    public String toString() {
        return maSach + "   " + tenSach + "   " + donGia;
    }

    public void hienThiSach(){
        System.out.println("Mã sách: " + getMaSach());
        System.out.println("Tên sách: " + getTenSach());
        System.out.println("Tác giả: " + getTacGia());
        System.out.println("Giá: " + getDonGia() + " VND");
    }
}
