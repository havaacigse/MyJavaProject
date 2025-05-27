public class asalMi {
    public static void main(String[] args) {
        int sayi = 29;
        boolean sonuc = asalMi(sayi);
        System.out.println(sonuc);
    }
    public static boolean asalMi(int sayi){
        if (sayi <= 1){
            return false;
        }

        for(int i=2 ; i<= Math.sqrt(sayi); i++){
            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    }
}
