public class CUSTOMER {
    private String maKhachHang;
    private String hoTen;
    private int soLuongMua, SDT, tongTienMua;

    public CUSTOMER() {
    }

    public CUSTOMER(String maKhachHang, String hoTen, int soLuongMua, int SDT, int tongTienMua) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.soLuongMua = soLuongMua;
        this.SDT = SDT;
        this.tongTienMua = tongTienMua;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public int getTongTienMua() {
        return tongTienMua;
    }

    public void setTongTienMua(int tongTienMua) {
        this.tongTienMua = tongTienMua;
    }
}
