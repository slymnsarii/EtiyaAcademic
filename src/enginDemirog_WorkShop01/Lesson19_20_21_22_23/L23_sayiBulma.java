package enginDemirog_WorkShop01.Lesson19_20_21_22_23;

public class L23_sayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 2;
        boolean varMi=false;

        for (int sayi : sayilar){

            if (sayi==aranacak){
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println("sayı mevcuttur");

        }
        else {
            System.out.println("sayı mevcut değildir");

        }
    }
}
