package Bai3;

public class RunMain {
    public static void main(String[] args) {
        HangHoa hang1 = new HangHoa();
        hang1.setMaHang("AC2019");
        hang1.setTenHang("Áo khoác");
        hang1.setDonGia(400000);
        hang1.setSoLuong(2);
        HangHoa hang2 = new HangHoa("BC2019", "Quần bò", 5000, 4);

        System.out.println("Thông tin mặt hàng 1: ");
        hang1.Xuat();
        System.out.println("--------------------------------");
        System.out.println("Thông tin mặt hàng 2: ");
        hang2.Xuat();
    }
}
