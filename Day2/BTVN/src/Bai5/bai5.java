package Bai5;
import java.util.Scanner;

public class bai5 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();
        int count = 0;
        float sum = 0;
        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
            if(Character.isDigit(temp)){
                count++;
                sum += Integer.parseInt(String.valueOf(temp));
            }
        }
        System.out.println("Tổng: "+sum/count);
    }
}