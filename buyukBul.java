public class buyukBul {
    public static void main(String[] args) {
        buyukBul(10, 20, 24);
        buyukBul(12, 55, 34);
    }
    public static void buyukBul(int sayi1 , int sayi2 , int sayi3){
        if(sayi1 >= sayi2 && sayi1 >= sayi3 )
            System.out.println(sayi1);
        else if(sayi2 >= sayi1 && sayi2 >= sayi3)
            System.out.println(sayi2);
        else 
             System.out.println(sayi3);

    }
}
