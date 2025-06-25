public class kuvvetAl {
    public static void main(String[] args) {
        System.out.println(kuvvetAl(2, 5));
        System.out.println(kuvvetAl(3, 4));
        System.out.println(kuvvetAl(5, 0));
        System.out.println(kuvvetAl(7, 2));
    }
    public static int kuvvetAl(int sayi , int kuvvet){
        if(kuvvet == 0) 
            return 1;
        else 
             return sayi * kuvvetAl(sayi, kuvvet -1); //ozyinelemeli 
    }
}
