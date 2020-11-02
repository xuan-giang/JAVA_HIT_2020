package Bai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Trung");
        Person p2 = new Person(2, "Doan");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        for(Person p : list){
            System.out.println(p);
        }
        Collections.sort(list);
        for(Person p : list){
            System.out.println(p);
        }
    }
}
