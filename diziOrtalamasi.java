public class diziOrtalamasi {
    public static void main(String[] args) {
        int[] list = {15,6,7,12,3,8,9};
        double sum = 0; 

        for(int i=0 ; i<list.length ;i++){
            sum+=list[i];
        }
        double avarage = sum / list.length;
        System.out.println(avarage);


        System.out.println("****************");
        
        //dizideki sayiların harmonik ortalamasını hesapla
        int[] list2 = {1,2,3,4,5,6,7,8,9,10};

        double sum2 = 0;
        
        for(int i=0 ; i<list.length ; i++){
            sum+=list[i];
        }
        double harmonicMean =  list.length/ sum;
        System.out.println("harmonic mean :" + harmonicMean);



















    }
}
