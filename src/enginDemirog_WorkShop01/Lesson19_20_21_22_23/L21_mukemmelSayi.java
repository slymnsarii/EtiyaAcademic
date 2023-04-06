package enginDemirog_WorkShop01.Lesson19_20_21_22_23;

public class L21_mukemmelSayi {
    public static void main(String[] args) {
        int number = 28;
        int total = 0;

        for(int i=1; i<number;i++){
            if (number % i ==0){
                total = total +i;

            }
        }
        if(total == number){
            System.out.println("mükemmel sayı");
        }
        else{
            System.out.println("mükemmel sayı değildir");
        }
    }
}
