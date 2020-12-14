package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person = () -> {
            System.out.println("Sleep.....");
        };
        person.Sleep();
    }
}
