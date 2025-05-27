public class carpimTablosu {
    public static void main(String[] args) {
        carp(5,6,'*');
      
    } 
    public static void carp(int sayi1 , int sayi2 , char operator){
        
        for(int i=1 ; i<sayi2 ; i++){
            System.out.println(i + "x" + sayi2 + "=" + (i*sayi2));
            //System.out.println(i*sayi2); cıkan sonucu yazar sadece
        }


    }
}
