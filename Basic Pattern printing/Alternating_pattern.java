package day.day5;
public class Alternating_pattern {
    public static void main(String[] args) {
        
            int n = 5;
            // Alernating 0 and 1
            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= i; j++) {

                    if ((i + j) % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }

                System.out.println();
            
            }
            System.out.println();

            //Checkerboard
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if((i+j)%2==0){
                        System.out.print(1);
                    }else{
                        System.out.print(0);
                    }
                    
                }
                System.out.println();
            }
          

    }
}
    
