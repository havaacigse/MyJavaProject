public class parcaGetir {
    public static void main(String[] args) {
       System.out.println(parcaGetir("merhaba", 1, 3));
       System.out.println(parcaGetir("ali", 2, 3));
       System.out.println(parcaGetir("ali", 1, 5));
    }
    public static String parcaGetir(String kelime , int baslangic , int bitis){
        if(kelime == null || baslangic < 1 || bitis > kelime.length() || baslangic > bitis){
            return null;
        }

        return kelime.substring(baslangic -1 , bitis);


    }
}
