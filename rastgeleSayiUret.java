import java.util.Random;

public class rastgeleSayiUret {
    public static void main(String[] args) {
        rastgeleSayiUret(1, 200, 100);
    }
    public static void rastgeleSayiUret(int baslangicDgeri , int bitisDegeri , int adet){
        Random rnd = new Random();
        for(int i=0 ; i< adet ; i++){
             int sayi = rnd.nextInt(bitisDegeri -baslangicDgeri + 1) + baslangicDgeri;
             System.out.println(sayi);
        }
    }
}
