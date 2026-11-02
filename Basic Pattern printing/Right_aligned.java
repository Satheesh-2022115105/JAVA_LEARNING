package day4;

public class Right_aligned {
    public static void main(String[] args) {
        // Right Triangle
        int n=5;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j<n-i-1){
                    System.out.print(" ");

                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        //Right aligned numbers
        for(int i=0;i<n;i++){
            int k=1;
            for (int j=0;j<n;j++){
                
                if (j<n-i-1){
                    System.out.print(" ");

                }else{
                    System.out.print(k++);
                }
            }
            System.out.println();
        }
        System.out.println();

        //Reverse Right angle
          for(int i=0;i<n;i++){
            
            for (int j=0;j<n;j++){
                
                if (j<i){
                    System.out.print(" ");

                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        //Right aligned repeated numbers

          for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                
                if (j<n-i-1){
                    System.out.print(" ");

                }else{
                    System.out.print(i+1);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
