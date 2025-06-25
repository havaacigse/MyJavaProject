public class enKucukSayiBul {
    public static void main(String[] args) {
        int[] sayilar = {3,5,23,45,34};
        int enKucuk = diziEnKucukSayiBul(sayilar);
        System.out.println("en kucuk sayi:" + enKucuk);


    }
    public static int diziEnKucukSayiBul(int[] gelenDizi){
        if(gelenDizi == null || gelenDizi.length == 0)
              throw new IllegalArgumentException("Dizi bos olamaz");

        
         int sayi = gelenDizi[0];
         for(int i=1 ; i< gelenDizi.length ; i++){
              if(gelenDizi[i] <sayi){
                  sayi = gelenDizi[i];
        }
    }
    return sayi;
    }

 }

