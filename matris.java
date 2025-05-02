import java.util.Scanner;

public class matris{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int satir=3;
        int sutun=4;
        int[][] matris = new int[satir][sutun];

        System.out.println("matrisin elemanlarını giriniz (" + satir + "x" + sutun + ") :");

        for(int i=0 ; i<satir ; i++){
            for(int j=0 ; j<sutun ; j++){
                System.out.println("matris[i][j]");
                matris[i][j] = input.nextInt();
            }
        }
         

        System.out.println("\n Girilen matris: ");
        for(int i=0 ; i<satir ; i++){
            for(int j=0 ; j<sutun ; j++){
                System.out.println(matris[i][j]);
            }
            System.out.println();
        }






















    }


}