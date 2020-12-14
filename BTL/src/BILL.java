public class BILL {
    public String id;
    public int soLuongMua;

    public BILL() {
    }

    public BILL(String id, int soLuongMua) {
        this.id = id;
        this.soLuongMua = soLuongMua;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }
}
