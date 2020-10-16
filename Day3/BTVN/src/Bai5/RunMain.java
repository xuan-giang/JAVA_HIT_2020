package Bai5;

public class RunMain {
    public static void main(String[] args) {
        Guns a1 = new Guns("Chó", 750);
        Guns a2 = new Guns("Mèo", 1000);

        while (a1.getAmmoNumber() > 0 && a2.getAmmoNumber() > 0){
            a1.Shoot(10);
            a2.Shoot(50);
        }
        if(a1.getAmmoNumber()==0){
            System.out.print(a1.getWeaponName()+" thua");
            System.out.println("Điểm hiện tại: "+a1.getAmmoNumber());
            System.out.print(a2.getWeaponName()+" thắng");
            System.out.print(" - Điểm hiện tại: "+a2.getAmmoNumber());
        }else
        if(a2.getAmmoNumber()==0) {
            System.out.print(a2.getWeaponName()+" thua");
            System.out.println("- Điểm hiện tại: "+a2.getAmmoNumber());
            System.out.print(a1.getWeaponName()+" thắng");
            System.out.print(" - Điểm hiện tại: "+a1.getAmmoNumber());
        }
    }
}
