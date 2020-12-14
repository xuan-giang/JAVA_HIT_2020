public class CUSTOMER {
    private String SDT, hoTen;
    private int soLuongMua;

    public CUSTOMER() {
    }

    public CUSTOMER(String SDT, String hoTen, int soLuongMua) {
        this.SDT = SDT;
        this.hoTen = hoTen;
        this.soLuongMua = soLuongMua;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
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

    @Override
    public String toString() {
        return getHoTen() + "       "
                + getSDT() + "       "
                +getSoLuongMua() + "\n";
    }
}
