import java.util.ArrayList;

public class tekleriGetir {
    public static void main(String[] args) {
        int[] dizi = {3,4,5,6,7,46,2,343};
        String[] tekler = tekleriGetir(dizi);
        System.out.println("tek sayilar");
        for(String tek : tekler){
            System.out.println(tek);
        }
    }

    public static String[] tekleriGetir(int[] dizi){
        ArrayList<String> liste = new ArrayList<>();

        for(int sayi : dizi){
            if(sayi %2 != 0)
               liste.add(String.valueOf(sayi));
        }

        return liste.toArray(new String[0]);

       
    }
}
