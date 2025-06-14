public class kelimeVarMi {
    public static void main(String[] args) {
        System.out.println(kelimeVarMi("bugun hava cok sicak" , "hava"));
        System.out.println(kelimeVarMi("bugun hava cok sicak", "aslı"));   
    }
    public static boolean kelimeVarMi(String cumle , String kelime){
        if(cumle == null || kelime == null || cumle.trim().isEmpty() || kelime.trim().isEmpty()){
             return false;
        }
        String[] kelimeler = cumle.trim().split("\\s+");

        for(String k : kelimeler){
            if(k.equals(kelime)){
                return true;
            }
        }
        return false;

    }
}
