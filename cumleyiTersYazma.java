//Parametre olarak yollanan bir cümleyi tersten ekrana yazdıran bir metot yazın
public class cumleyiTersYazma {
    public static void main(String[] args) {
        String cumle = "merhaba dunya";
        tersYaz(cumle);
    }
    public static void tersYaz(String cumle){
        for(int i= cumle.length() -1 ; i>=0 ; i--){
            System.out.print(cumle.charAt(i));         
        }
  }
}
