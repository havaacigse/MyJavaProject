/*
import java.util.Random;
public class metotRastgeleSayiUret {
    public static void main(String[] args) {
        rastgeleSayiUret(100, 500, 15);
    }
    public static void rastgeleSayiUret(int baslangicDegeri , int bitisDegeri , int adet){
        Random rnd = new Random();
        int rastgeleSayi;
        for(int i=0 ; i<adet ; i++){
            rastgeleSayi = rnd.nextInt(bitisDegeri - baslangicDegeri +1) + baslangicDegeri;
            System.out.println(rastgeleSayi);
            
        }

    }
}
*/

//aynı sorunun geriye deger döndüren halini de istiyor. geriye deger döndürmesi icin degerleri bir yerde tutması lazım dizi kullanıcaz
import java.util.Arrays;
import java.util.Random;
public class metotRastgeleSayiUret{
    public static void main(String[] args) {
       int[] rastgeleSayi = rastgeleSayiUret(10, 100, 16);
       System.out.println(Arrays.toString(rastgeleSayi)); 
    }
    public static int[] rastgeleSayiUret(int baslangicDegeri , int bitisDegeri , int adet){
        Random rnd = new Random();
        int[] dizi = new int[adet];
        for(int i=0 ; i<adet; i++){
             dizi[i] = rnd.nextInt(bitisDegeri-baslangicDegeri +1) + baslangicDegeri;
        }
        return dizi; //diziyi döndürüyorsun yani int[]
     }
    


}