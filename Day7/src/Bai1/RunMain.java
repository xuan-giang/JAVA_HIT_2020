package Bai1;

import java.util.ArrayList;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {
        SINHVIEN sv = new SINHVIEN();
        CONGNHAN cn = new CONGNHAN();
        NGUOI NGUOI = new SINHVIEN();
        NGUOI.DiaChi();
        NGUOI = new CONGNHAN();
        NGUOI.DiaChi();

        List<SINHVIEN> list = new ArrayList<>();
        List<CONGNHAN> lists = new ArrayList<>();
    }
}
