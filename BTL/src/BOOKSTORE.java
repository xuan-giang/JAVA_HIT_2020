import java.util.*;
public class BOOKSTORE implements STOREINTERFACE{
    private List<BOOK> listItems		= null;


    public BOOKSTORE(){
        listItems	= new LinkedList<BOOK>();
    }
    List<CUSTOMER> customerList = new LinkedList<>();
    public int getItemPosition(String bookID){
        Iterator<BOOK> itr	= listItems.iterator();
        int i			= 0;
        while(itr.hasNext()){
            if(bookID.equals(itr.next().getMaSach())) return i;
            i++;
        }
        return -1;
    }
    public int getCustomerPosition(String SDT){
        Iterator<CUSTOMER> customerIterator = customerList.iterator();
        int i = 0;
        while (customerIterator.hasNext()){
            if(SDT.equals(customerIterator.next().getSDT())) return  i;
            i++;
        }
        return -1;
    }
    public void addCustomer(Object obj){
        CUSTOMER customer = (CUSTOMER) obj;
        customerList.add(customer);
    }
    public void editCustomer(String hoTen, String SDT){
        int customerPosition = this.getCustomerPosition(SDT);
        if(customerPosition == -1){
            System.out.println("Không tồn tại khách này");
        }else {
            customerList.get(customerPosition).setHoTen(hoTen);
            customerList.get(customerPosition).setSDT(SDT);
            System.out.println("Chỉnh sửa thành công!");
        }
    }
    public void deleteCustomer(String SDT){
        int customerPosition = this.getCustomerPosition(SDT);
            if(customerPosition == -1){
            System.out.println("Không tồn tại khách này");
        }else {
            customerList.remove(customerPosition);
            System.out.println("Đã xóa!");
        }
    }

    public void findCustomer(String SDT){
        int customerPosition = this.getCustomerPosition(SDT);
        if(customerPosition == -1){
            System.out.println("Không tồn tại khách này");
        }else {
            System.out.println(customerList.get(customerPosition).toString());
        }
    }
    @Override
    public void add(Object obj) {
        BOOK bookObj	= (BOOK) obj;
            listItems.add(bookObj);
            System.out.println("Đã thêm!!");
    }

    public void edit(String bookID, String bookName, String bookAuthor, double bookPrice, int soLuong){
        int bookPosition	= this.getItemPosition(bookID);
        if(bookPosition == -1){
            System.out.println("Sách không tồn tại!");
        }else{
            listItems.get(bookPosition).setTenSach(bookName);
            listItems.get(bookPosition).setDonGia(bookPrice);
            listItems.get(bookPosition).setSoLuong(soLuong);
            System.out.println("Chỉnh sửa thành công!");
        }
    }

    public void delete(String bookID){
        int bookPosition	= this.getItemPosition(bookID);
        if(bookPosition == -1){
            System.out.println("Sách không tồn tại!");
        }else{
            listItems.remove(bookPosition);
            System.out.println("Đã xóa!");
        }
    }

    public void find(String bookID){
        int bookPosition	= this.getItemPosition(bookID);
        if(bookPosition == -1){
            System.out.println("Sách không tồn tại!");
        }else{
            System.out.println(listItems.get(bookPosition));
        }
    }

    public void list(){

            Iterator<BOOK> itr	= listItems.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
       
    }
    public void listCustomer(){

        Iterator<CUSTOMER> itr	= customerList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    int thanhTien = 0;
    public void showBill(String id, int soLuongMua, int temp){
        int bookPosition	= this.getItemPosition(id);
        if(bookPosition == -1){
            System.out.println("Mã " + id + " không tồn tại!");
        }else{
            listItems.get(bookPosition).setSoLuong(listItems.get(bookPosition).getSoLuong() - soLuongMua);
            thanhTien += soLuongMua * listItems.get(bookPosition).getDonGia();
            System.out.printf("%20s %5s %1s %10s\n", listItems.get(bookPosition).getTenSach(),"x",soLuongMua,
                    listItems.get(bookPosition).getDonGia());
        }
        if(temp == 1){
            System.out.println("   \t\t\t\t\tTHÀNH TIỀN: " + thanhTien + " VND");
        }
    }

    public int getTotalItems() {
        return listItems.size();
    }
}
