public class enUzunCumle {
    public static void main(String[] args) {
        System.out.println(enUzunCumle("merhaba arkadaslar " , "bugun cok guzel seyler olucak"));
        System.out.println(enUzunCumle("yarın finallere calismam lazim " , "bugun denize gidicem."));
    }
    public static int enUzunCumle(String... cumleler){ 
        if(cumleler == null || cumleler.length == 0)
            return 0;
         
        int maxKelimeSayisi = 0;
        String enUzunCumle = "";

        for(String cumle : cumleler){
            if(cumle == null || cumle.trim().isEmpty())
               continue;
            
            String[] kelimeler = cumle.trim().split("\\s+");
            int kelimeSayisi = kelimeler.length;

            if(kelimeSayisi>maxKelimeSayisi){
                maxKelimeSayisi = kelimeSayisi;
                enUzunCumle = cumle;
            }
        }
        System.out.println("en uzun cumle :" + enUzunCumle);
            return maxKelimeSayisi;
               
    }
}
