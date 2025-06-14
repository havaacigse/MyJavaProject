public class nufus {
    public static void main(String[] args) {
        double sonuc = nufus(100000, 3.5 , 3);
        System.out.println(sonuc);
    }
    public static double nufus(double baslangicNufusu , double artisOrani , int yil){
        for(int i= 0 ; i < yil ; i++){
            baslangicNufusu = baslangicNufusu + (baslangicNufusu *artisOrani / 100);
        }
        return baslangicNufusu;
    }
}
