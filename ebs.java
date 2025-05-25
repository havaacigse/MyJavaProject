//cagrıldıgında klavyeden 10 tam sayı girisi yapılıp bu sayılardan en buyuk olanını geriye döndüren bir metot 

import java.util.Scanner;

public class ebs {
    public static void main(String[] args) {
        int bulunanSayi = enBuyukSayi();
        System.out.println(bulunanSayi);
 }
 
    public static int enBuyukSayi(){
        Scanner input = new Scanner(System.in);
        int ebs = 0 ;
        int sayi = 0;

        for(int i=0 ; i<10 ; i++){
            System.out.println("sayi:");
            sayi = input.nextInt();

            if(i==0)
               ebs = sayi;
            if(sayi>ebs) 
                ebs = sayi;
        
        }
        return ebs;
    }

}
