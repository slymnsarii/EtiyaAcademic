package enginDemirog_WorkShop01.Lesson11_12_13;

public class loop {
    public static void main(String[] args) {
        //For
        for (int i = 2; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");

        //While
        int i=1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }

        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j=1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Döngüsü Bitti");

        //do-while kullanım alanı:bir döngüye girdiğimizde döngü çalışmasa bile log atmak istiyorsak,
        //yani şart sağlanmasa bile bi kere çalışan durumlar için
        //loglama:kim hangi operasyonu ne zaman ne şekilde çağırdı
    }
}
