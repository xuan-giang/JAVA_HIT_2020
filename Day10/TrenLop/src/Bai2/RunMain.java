package Bai2;

import java.lang.reflect.Array;
import java.util.*;

public class RunMain {
    public static void main(String[] args) {
      //  List<String> list = new ArrayList<>();
        //List<String> list = new LinkedList<>();
//        list = new LinkedList<>();
//        list = new Vector<>();
//        list = new Stack<>();
//        list.add("Trung");
//        list.add("Doan");
//        list.add("Điệp");
//
//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        String arr[] = {"Trung", "Doan", "Trung", "Doan", "Điệp", "Tình", "Sáng"};
//        Set<String> set = new HashSet<>();
//        for(String s : arr){
//            set.add(s);
//        }
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        for(String s : set){
            System.out.println(s);
        }

    }
}
