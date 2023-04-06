package enginDemirog_WorkShop01.Lesson14_15_16;

public class Arrays {
    public static void main(String[] args) {
        String ogrenci1="Engin";
        String ogrenci2="Derin";
        String ogrenci3="Salih";
        String ogrenci4="Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        String [] ogrenciler=new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";
        //ogrenciler[4]="Ali"; //ArrayIndexOutOfBoundation

        System.out.println("--------------------");

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------------");

        //yukarıdaki kullanım ile aynı
        for (String ogrenci:ogrenciler){ //ogrenciler dizisindeki her bir elemani(ogrenci(istedigini yaz)) gez
            System.out.println(ogrenci);
        }
    }
}
