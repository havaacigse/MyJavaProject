//kendisine yollanan 2 tam sayi ve hesaplama operatörüne göre dort islemden istenileni yapıp sonucu geriye döndüren metot
public class hesaplama {
    public static void main(String[] args) {
       int result = calculate(23,35,'*');
       double result2 = calculate(10 , 3 , '/');
       System.out.println(result);
       System.out.println(result2);
    }
    public static int calculate(int n1 , int n2, char operator){
        int result = 0;
        switch(operator){
            case '+' :
                result = n1 + n2 ;
                break;
            
            case '-' : 
               result = n1 - n2 ;
               break;

            case '*' : 
                result = n1 * n2 ; 
                break;
                
             
            case '/' : 
                if(n2 != 0)
                    return n1/n2;
                else 
                   System.out.println("Error");
                   return 0;
                          
                   default : 
                       System.out.println("error : Invalid operator");  
                       return 0;    
                            
        }

        return result;
    }


     public static double calculate(double n1 , double n2 , char operator){
        double result = 0;

        switch(operator){
            case '+':
               result = n1 + n2;
               break;
               
            case '-' : 
                result = n1 - n2 ; 
                break;


            case '*' : 
                 result = n1 * n2 ;
                 break;
                

            case '/' : 
                 if(n2 != 0) 
                     result =n1 / n2;
                 else 
                    System.out.println("error");
                    return 0;

                 
                default : 
                    System.out.println("error : Invalid operator");
                    return 0;
        }
        return result;

     }
}
