public class kelimeSayisiniBul {
    public static void main(String[] args) {
        kelimeSayisiniBul("bugun hava cok sicak");
        kelimeSayisiniBul(null);
        kelimeSayisiniBul(" ");
        kelimeSayisiniBul("sinemaya gidiyoruz");

    }
    public static void kelimeSayisiniBul(String cumle){
        if(cumle == null || cumle.trim().isEmpty()){
            System.out.println("kelime sayisi : 0");
            return;
        }

        String[] kelimeler = cumle.trim().split("\\s+");
        System.out.println(kelimeler.length);


    }
}
