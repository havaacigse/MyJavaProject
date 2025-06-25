public class asalMi {
    public static void main(String[] args) {
        System.out.println(asalMi(20));
        System.out.println(asalMi(47));
    }
    public static boolean asalMi(int sayi){
        if (sayi <= 1){
            return false;
        }

        for(int i=2 ; i< sayi ; i++){
            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    }
}

//int sayi = 29;
//  boolean sonuc = asalMi(sayi);
//  System.out.println(sonuc);