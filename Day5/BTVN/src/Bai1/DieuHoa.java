package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    private String maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private String ngayNhap;

    public DieuHoa() {
    }

    public DieuHoa(String maSanPham, String tenSanPham, String hangSanXuat, String ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.ngayNhap = ngayNhap;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sản phẩm: ");
        maSanPham = sc.nextLine();
        System.out.println("Tên sản phẩm: ");
        tenSanPham = sc.nextLine();
        System.out.println("Hãng sản xuất: ");
        hangSanXuat = sc.nextLine();
        System.out.println("Ngày nhập: ");
        ngayNhap = sc.nextLine();
        super.Nhap();
    }

    public void Xuat(){
        System.out.printf("%15s %20s %20s %20s %20s %16s\n", maSanPham, tenSanPham, hangSanXuat, ngayNhap, congSuat, giaBan);

    }
    public String getHangSanXuat() {
        return hangSanXuat;
    }
}
