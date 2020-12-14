public class VALIDATE {
    private StringBuilder error	= new StringBuilder();

    public void getError() {
        System.out.println(this.error);
    }

    public void setError(String error) {
        this.error.append(error).append("\n");
    }

    public boolean checkPrice(double value){
        boolean flag = (value > 1000) && (value < 1000000);
        if(flag == false){
            this.setError("Giá tiền phải nằm trong khoảng [0-100]");
        }
        return flag;
    }
//[A-z\.\s!]{2,100}
    public boolean checkName(String value){
        boolean flag	= value.matches("[A-z\\.\\s]{2,100}");
        if(flag == false){
            this.setError("Tên sách không hợp lệ");
        }
        return flag;
    }
    public boolean checkAuthor(String value){
        boolean flag	= value.matches("[A-z\\.\\s]{2,100}");
        if(flag == false){
            this.setError("Tên tác giả không hợp lệ");
        }
        return flag;
    }
    public boolean checkID(String value){
        boolean flag	= value.matches("[A-z]{3}-[0-9]{3}");
        if(flag == false){
            this.setError("Mã sách phải có dạng [A-z]{3}[0-9]{3}");
        }
        return flag;
    }
}
