public interface STOREINTERFACE {
    public void add(Object obj);
    public void edit(String maSach, String tenSach, String tacGia, double giaTien, int soLuong);
    public void delete(String ID);
    public void find(String ID);
    public void list();
    public void showBill(String ID, int soLuongMua, int temp);
}
