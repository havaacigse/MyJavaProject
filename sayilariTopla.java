
public class sayilariTopla {
    public static void main(String[] args) {
         sayilariTopla(20, 100);
         sayilariTopla(1, 20);
         sayilariTopla(23, 30);
        
    }
    public static void sayilariTopla(int baslangic , int bitis){
        int toplam = 0;
        for(int i=baslangic ; i<bitis ; i++){
            toplam += i;
        }
         System.out.println(toplam);

    }
}
