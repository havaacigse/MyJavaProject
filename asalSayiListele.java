//kendisine yollanan 2 sayı arasındaki sayılardan asal sayilari listeleyen ve ekrana yazdıran metot
public class asalSayiListele {
    public static void main(String[] args) {
        asalSayilariListele(21, 100);
    }
    public static void asalSayilariListele(int sayi1, int sayi2){
        for(int i=sayi1 ; i<=sayi2 ; i++){
            if(asalMi(i)){
                System.out.println(i);
            }
        } 
        
    }
    public static boolean asalMi(int sayi){
        if(sayi<2) 
           return false;
        for(int i=2 ; i<sayi ; i++){
            if(sayi%i == 0){
                return false; //bölündü asal degil 
            }
        }
        return true;

    }
}
