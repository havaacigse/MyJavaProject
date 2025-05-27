import java.util.Scanner;
public class enBuyukSayiBulma {
    public static void main(String[] args) {
        int ebs = enBuyukSayiBul();
        System.out.println("en buyuk sayi " + ebs);
    }
    public static int enBuyukSayiBul(){
       Scanner input = new Scanner(System.in);
       int ebs = Integer.MIN_VALUE;

       for(int i=1 ; i<=10 ; i++){
        System.out.println(i + ".sayiyi girin :");
        int sayi =input.nextInt();

        if(sayi> ebs)
            ebs = sayi;
       }
       return ebs;
    }
   
}
 
