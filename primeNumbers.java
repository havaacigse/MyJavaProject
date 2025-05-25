//kendisine yollanan 2 sayi arasındaki asal sayıları listeleyen ve ekrana yazdiran metot
public class metotalistirma2 {
    public static void main(String[] args) {
        printPrimeNumbers(1,100);
    }
    public static void printPrimeNumbers(int start , int end){
        for(int i=start; i<=end ; i++){
            int divisorCount = 0;
            for(int j=1 ; j<=i ; j++){
                if(i%j == 0){
                    divisorCount++;
                }
            }
            if(divisorCount==2)
               System.out.println(i);
        }
    }
   
}




