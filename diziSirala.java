//50 elemanlı bir diziye 0-100 arasında rastgele sayılar atansın dizisirala adında bir metota dizi parametre olarak yollansın metot diziyi kucukten buyuge sıralasın 

import java.util.Random;
import java.util.Arrays;

public class diziSirala {
    public static void main(String[] args) {
        int[] dizi = new int[50];
        Random rnd = new Random();

        for(int i=0 ; i<dizi.length ; i++){
            dizi[i] = rnd.nextInt(101);
        }
         
        System.out.println("dizi : ");
        System.out.println(Arrays.toString(dizi));

        diziSirala(dizi);

        System.out.println("dizinin siralanmis hali: ");
        System.out.println(Arrays.toString(dizi));

        
    }
    public static void diziSirala(int[] dizi){
        Arrays.sort(dizi);
    }
}