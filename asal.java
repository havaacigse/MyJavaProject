public class asal{
    public static void main(String[] args) {
        boolean sonuc = asalMi(34);
        boolean sonuc2 = asalMi(43);
        boolean sonuc3 = asalMi(2);
        System.out.println(sonuc);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
    }
    public static boolean asalMi(int sayi){
        if(sayi<2)
          return false;
        for(int i=2 ; i<sayi ; i++){ //i<=sayi yapmistim bunu HATA cunku tum sayilar kendisine bölünür ve bu yuzden asal degil gözükür 
            if(sayi%i == 0)
                return false;
        } 
        return true;
    }
    
}