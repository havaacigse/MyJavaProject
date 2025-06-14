public class cumleyiTerstenYazdir {
    public static void main(String[] args) {
        cumleyiTerstenYazdir("bugun hava cok sicak");
    }
    public static void cumleyiTerstenYazdir(String cumle){
        if(cumle == null || cumle.isEmpty()){
            return;
        }

        for(int i = cumle.length()-1 ; i>=0 ; i--){
            System.out.print(cumle.charAt(i));

        }

    }
}
