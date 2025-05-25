//klavyeden girilen iki sayı arasındaki sayilardan 5 in katlarını ekrana yazdiran metot
import java.util.Scanner;
public class metotalistirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi girin: ");
        int n1 = input.nextInt();

        System.out.println("bir sayi daha girin: ");
        int n2 = input.nextInt();

        katlar(n1,n2);
        

    }
    public static void katlar(int n1 , int n2){
        for(int i=n1 ; i<=n2 ; i++){
            if(i%5 == 0)
               System.out.println(i);
        }
    }
}
