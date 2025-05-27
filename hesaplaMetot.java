public class hesaplaMetot {
    public static void main(String[] args) {
        int sonuc = hesapla(20,34,'+');
        int sonuc2 = hesapla(45, 5, '/');
        System.out.println(sonuc);
        System.out.println(sonuc2);
    }
    public static int hesapla(int sayi1 , int sayi2 , char operator){
        int sonuc=0;
        switch(operator){
            case '+' :
                sonuc = sayi1 + sayi2;
                break;
            
            case '-' : 
                 sonuc =sayi1 - sayi2;
                 break;
            
            case '*' : 
                 sonuc = sayi1 * sayi2;
                 break;
            
            case '/' : 
                  if(sayi2 != 0){
                     sonuc = sayi1 / sayi2;
                     break;
                  }
                  else{
                    System.out.println("error");
                    return 0;
                  }
        
        }
        return sonuc;
    }
}
