public class kelimeyiGetir {
    public static void main(String[] args) {
        System.out.println(kelimeyiGetir("bugun hava cok sicak", 1));
        System.out.println(kelimeyiGetir("bugun hava cok sicak" , 3));
    }
    public static String kelimeyiGetir(String cumle , int kelimeSiraNo){
        if(cumle == null || cumle.trim().isEmpty() || kelimeSiraNo < 1){
            return "HATA";
        }

        String[] kelimeler = cumle.trim().split("\\s+");

        if(kelimeSiraNo > kelimeler.length){
            return "HATA";
        }
        
        return kelimeler[kelimeSiraNo-1];
      
    }
}
