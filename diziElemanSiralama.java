import java.util.Arrays;
public class diziElemanSiralama {
    public static void main(String[] args) {
        int[] list = new int[5];

        list[0] = 99;
        list[1] = -2; 
        list[2] = -2121;
        list[3] = 1;
        list[4] = 0;

        Arrays.sort(list);

        for(int sayi : list){
            System.out.println(sayi);
        }



     
              
        }
    }

