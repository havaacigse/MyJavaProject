import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("kac adet sayi girilsin : ");
        int adet = input.nextInt();

        int[] list = new int[adet];
        int toplam = 0;
        
        for(int i=0 ; i<list.length ; i++){
            System.out.println((i+1) + ".sayiyi girin : ");
            list[i] = input.nextInt();
            toplam+=list[i];
        }
        double ortalama = toplam / adet ; 


        int enBuyuk = list[0];
        int enKucuk = list[0];

        System.out.println("\npozitif sayilar : ");
        for(int sayi : list){
            if(sayi > enBuyuk)
                enBuyuk = sayi;
            if(sayi < enKucuk)
                 enKucuk = sayi ;  

            if(sayi>0){
                System.out.println(sayi);
            }
        }

        System.out.println("\nNegatif sayilar : ");
        for(int sayi : list){
            if(sayi<0){
                System.out.println(sayi);
            }
        }

      
        System.out.println("\nSayilarin ortalamasi : " + ortalama);
        System.out.println("en buyuk sayi : " + enBuyuk);
        System.out.println("en kucuk sayi : " + enKucuk);

        
    }
}

