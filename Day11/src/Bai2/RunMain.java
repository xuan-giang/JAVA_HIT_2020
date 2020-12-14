package Bai2;

import java.util.ArrayList;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.stream().forEach(p -> System.out.println(p));

    }
}
