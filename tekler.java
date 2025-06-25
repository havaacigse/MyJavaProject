import java.util.Arrays;

public class tekler {
    public static void main(String[] args) {
        int[] dizi = {3,45,6787,20,32,21,543,23,67,34};
        String[] tekler = tekleriGetir(dizi);
        System.out.println(Arrays.toString(tekler));
    }
    public static String[] tekleriGetir(int[] dizi){
        int tekSayisi = 0;
        for(int i=0 ; i<dizi.length ; i++){ 
           if(dizi[i] %2 !=0 ) 
             tekSayisi++;
        } 
        String[] sonuc = new String[tekSayisi];
        int indeks = 0;
        for(int i=0 ; i<dizi.length ; i++){
            if(dizi[i] % 2 != 0){
                sonuc[indeks] = "" + dizi[i];
                indeks++;
            }
        }
        return sonuc;
    

    }
    
}

