import java.util.Random;

public class rastgeleSayiUret {
    public static void main(String[] args) {
        rastgeleSayiUret(1, 200, 100);
    }
    public static void rastgeleSayiUret(int baslangicDgeri , int bitisDegeri , int adet){
        Random rnd = new Random();
        for(int i=0 ; i< adet ; i++){ //i nin amacı kac sayı urettiğini bulmak yani  0 dan baslayıp adet e kadar calısır
             int sayi = rnd.nextInt(bitisDegeri -baslangicDgeri + 1) + baslangicDgeri;
             System.out.println(sayi);
        }
    }
}
//for döngüsünde i = baslangic tan bitise yazmıstım ben hata!!!!!
//cunku o zaman sırayla yazmıs olur rastegele sayı uretmıs olmaz bu sekilde adet sayısı da kontrol edilmemis olur