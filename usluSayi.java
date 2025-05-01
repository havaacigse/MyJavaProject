import java.util.Scanner;
public class usluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sonuc = 1;

        System.out.println("us olacak sayıyı girin : ");
        int u = input.nextInt();

        System.out.println("taban olacak sayiyi girin : ");
        int t = input.nextInt();

        
        for(int i=1 ; i<=u ; i++){
            sonuc *= t ; 
            System.out.println("sonuc:" + sonuc);
        }

        System.out.println("******************");


        //Math.pow 
        Scanner scanner = new Scanner(System.in);
        double sonuc2;

        System.out.println("us olacak sayıyı girin : ");
        int us = input.nextInt();

        System.out.println("taban olacak sayiyi girin : ");
        int taban = input.nextInt();


        sonuc2 = Math.pow(taban , us);

        System.out.println("sonuc :" + sonuc2);

    }
}
