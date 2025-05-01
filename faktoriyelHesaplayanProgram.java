import java.util.Scanner;
public class faktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=1;

        System.out.println("enter the number:");
        int n = input.nextInt();
    
        for(int i=1 ; i<=n ; i++ ){
            total = total * i ;
        }
        System.out.println( n + ".faktoriyel : " + total);

    }
}
