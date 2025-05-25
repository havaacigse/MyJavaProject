//calıatıgında 0-100 arasında rastgele bir tam sayı tutup geriye tutugu bu tam sayıyı döndüren metot
import java.util.Random;
public class randomMetot{
    public static void main(String[] args) {
        int sonuc;
        sonuc = degerTut();
        System.out.println(sonuc);
    }
    public static int degerTut(){
        Random rnd = new Random();
        int sayi = rnd.nextInt(101);
        return sayi;
    }
}



