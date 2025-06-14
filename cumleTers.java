import java.util.Scanner;

public class cumleTers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle girin : ");
        String girilenCumle = input.nextLine();

        String tersCumle = tersle(girilenCumle);
        System.out.println("ters cumle : " + tersCumle);
    }
    
    public static String tersle(String cumle){
       String[] kelimeler = cumle.trim().split("\\s+");
       String ters = "";

       for(int i = kelimeler.length-1 ; i>=0 ; i--){
        ters += kelimeler[i];
        if(i != 0) ters += " " ;

       }
       return ters;
    }
}
