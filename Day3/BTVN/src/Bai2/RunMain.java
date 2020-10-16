package Bai2;

public class RunMain {

    public static void main(String[] args) {
        final int SO_LAN = 3;
        Dog mic = new Dog();
        mic.InputName("Mic");
        for(int i = 0; i < SO_LAN; i++){
            mic.Bark();
            mic.ShowMP();
        }
    }
}
