public class karelerinToplami {
    public static void main(String[] args) {
        int sayi = 6;
        int sonuc = karelerinToplami(sayi);

        if(sonuc != -1){
            System.out.println(sayi + sonuc);
        }
    }

    public static int karelerinToplami(int sayi){
        if(sayi<0){
            System.out.println("hesaplanamaz");
            return -1;
        }
        if(sayi == 1)
             return 1;
        else 
             return (sayi * sayi) + karelerinToplami(sayi -1); //recursive

    }
}
