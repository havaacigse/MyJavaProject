public class diziHarfYazdir2 {
    public static void main(String[] args) {
        //B harfi yazdirma
        String[][] dizi = new String[7][4];
        
        for(int i=0 ; i<dizi.length ; i++){
            for(int j=0 ; j<dizi[i].length ; j++){
                if(i==0 || i==3 || i==6){
                    dizi[i][j] = " * ";
                }
                else if(j==0){
                    dizi[i][j] = " * ";
                }
                else if((i>0 && i<3 && j==3) || (i>3 && i<6 && j==3)){
                    dizi[i][j] = " * ";
                }
                else{
                    dizi[i][j] = "    "; 
                }
            }
        }
        for(String[] row : dizi){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
   }
}
