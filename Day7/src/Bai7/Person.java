package Bai7;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String  name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if(this.id > o.getId()){
            return 1;
        }else if(this.id < o.getId()){
            return -1;
        }else {
            return 0;
        }
    }
}
