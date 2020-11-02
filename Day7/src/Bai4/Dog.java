package Bai4;

public class Dog implements Animal{
    @Override
    public void Eat() {
        System.out.println("Eat");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleep");
    }
}
