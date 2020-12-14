public class BOOK {
    private double donGia;
    private String tenSach, maSach, tacGia;
    private int soLuong = 0;

    public BOOK() {
    }

    public BOOK(String maSach, String tenSach, String tacGia, double donGia, int soLuong) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return maSach + "   " + tenSach + "   " + donGia + "    " + getSoLuong();
    }
}
