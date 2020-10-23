package Bai3;

public class RunMain {
    public static void main(String[] args) {
        PHIEU a = new PHIEU();
        System.out.println("Nhập thông tin phiếu: ");
        a.inputPhieu();
        System.out.println("=== THÔNG TIN PHIẾU ===");
        a.outputPhieu();
    }
}
