import java.util.Scanner;

public class besinKatlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi girin: ");
        int sayi1 = input.nextInt();

        System.out.println("sayi girin : ");
        int sayi2 = input.nextInt();

        besinKatlariYazdir(sayi1,sayi2);

        


    }
    public static void besinKatlariYazdir(int sayi1 , int sayi2){
        for(int i=sayi1 ; i<=sayi2 ; i++){
            if(i%5 == 0) 
               System.out.println(i);
        }
    }
}
