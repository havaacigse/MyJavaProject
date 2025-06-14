public class hesaplamaİslemiYap {
    public static void main(String[] args) {
        hesaplamaİslemiYap(20.5, 30.3 , '+');
        hesaplamaİslemiYap(130 , 170 , '*');
        hesaplamaİslemiYap(90,45, '-');
    }
    public static void hesaplamaİslemiYap(double sayi1 , double sayi2 , char islem){
        switch(islem){
            case '+' : 
               System.out.println(sayi1 + sayi2);
               break;
            case '-' : 
                System.out.println(sayi1 - sayi2);
                break;
            case '*' : 
                System.out.println(sayi1 * sayi2);
                break;
            case '/' : 
                 if(sayi2 != 0) 
                   System.out.println(sayi1 / sayi2);
                else 
                    System.out.println("hata: payda 0 olamaz");
                break;

            default : 
                System.out.println("gecersiz islem");
            
        }

    }
}
