

public class Number_pattern{
    public static void main(String[] args) {
        //Flyod's triangle
        int k=1;
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=5;j++){
                if(j<=i){
                    System.out.print((k++)+" ");

                }

            }
            System.out.println();
        }
        System.out.println();

        // Reverse Flyod's triangle
        k=15;
        int n=5;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(j<n-i){
                    System.out.print((k--)+" ");
                }

            }
        System.out.println();  
        }
    }
}