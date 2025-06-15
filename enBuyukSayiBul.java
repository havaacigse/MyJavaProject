public class enBuyukSayiBul {
    public static void main(String[] args) {
        int[] sayilar = {3,5,65,34,23,54,18};
        int enBuyuk = enBuyukSayiBul(sayilar);
        System.out.println("en buyuk sayi :" + enBuyuk);
    }
    public static int enBuyukSayiBul(int[] gelenDizi){
        if(gelenDizi == null || gelenDizi.length == 0){
            throw new IllegalArgumentException("Dizi boş olamaz");
        }
        
        int sayi = gelenDizi[0];
        for(int i=0 ; i<gelenDizi.length ; i++){
            if(gelenDizi[i]>sayi)
                 sayi = gelenDizi[i];

        }  
        return sayi;
      }
}
