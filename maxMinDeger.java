import java.util.Scanner;
public class maxMinDeger {
    public static void main(String[] args) {
        int[] list = {10,20,23,24,45,56,75,100};
        Scanner input = new Scanner(System.in);

        System.out.println("bir sayi girin : ");
        int sayi = input.nextInt();

        int enKucugeYakin = Integer.MIN_VALUE;
        int enBuyugeYakin = Integer.MAX_VALUE;

        for(int i=0 ; i<list.length ; i++){
            if(list[i] < sayi){
                enKucugeYakin = Math.max(enKucugeYakin , list[i]);
            }
            if(list[i] > sayi){
                enBuyugeYakin = Math.min(enBuyugeYakin , list[i]);
            }
        }
        
        if(enKucugeYakin == Integer.MIN_VALUE){
            System.out.println("girilen sayidan kucuk sayi bulunmamaktadir");
        }else{
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucugeYakin);
        }
        if (enBuyugeYakin == Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük bir sayı bulunmamaktadır.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyugeYakin);
        }
        
    }
}
