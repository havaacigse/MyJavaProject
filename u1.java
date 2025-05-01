import java.util.Scanner;
public class u1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total = 0 ;

        do{
            System.out.println("enter the number :");
            number = input.nextInt();

            if(number%2==0 && number%4==0 ){
                total += number;    

            }
        }while(number %2 == 0);

        System.out.println("Total : " + total);
    }
    
}
