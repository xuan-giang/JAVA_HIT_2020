package BAI2;

import java.io.BufferedWriter; // đồng bộ, luồng đọc ghi dữ liệu an toàn
import java.io.FileWriter; // tạo ra file
import java.io.IOException;
import java.io.PrintWriter;

public class RunMain {
    public static void main(String[] args) throws IOException {

        try{
            FileWriter fileWriter = new FileWriter("thuan.txt", false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println("Hello anh em");
            for(int i = 0; i < 5; i++){
                printWriter.println(i);
            }
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
