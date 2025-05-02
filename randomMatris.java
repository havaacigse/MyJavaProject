import java.util.Random;
public class randomMatris {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matris = new int[7][7];

        for(int row=0 ; row<matris.length ; row++){
            for (int column=0 ; column<matris[row].length ; column++){
                matris[row][column] = rnd.nextInt(100);
            }
        }

        System.out.println("Olusturulan matris:");
        for(int i=0 ; i<matris.length ; i++){
            for(int j=0 ; j < matris[i].length ; j++){
                System.out.printf("%3d" , matris[i][j]);
            }
            System.out.println();
        }






    }
 }
