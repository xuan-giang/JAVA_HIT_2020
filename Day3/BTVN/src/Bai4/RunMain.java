package Bai4;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        System.out.println("Nhập mảng 1: ");
        arr1.InputData();

        System.out.println("Nhập mảng 2: ");
        arr2.InputData();

        if (arr1.Sum() / arr1.getN() > arr2.Sum() / arr2.getN()) {
            System.out.print("Mảng có TBC lớn hơn: ");
            arr1.Show();
        } else if (arr1.Sum() / arr1.getN() < arr2.Sum() / arr2.getN()) {
            System.out.print("Mảng có TBC lớn hơn: ");
            arr2.Show();
        } else {
            System.out.println("Hi");
        }
    }
}
