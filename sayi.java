import java.util.Scanner;
public class sayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total=0;

        do{
            System.out.println("enter the number: ");
            number = input.nextInt();

            if(number %2 == 1){
                total += number;

            }

        }while(number > 0);

        System.out.println("Total : " + total);
         
    }
}
