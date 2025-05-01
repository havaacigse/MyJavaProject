import java.util.Scanner;
public class u2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("enter the number : ");
        n = input.nextInt();

        for(int i=1 ; i<=n ; i++){
            if(i%4==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
    
}
