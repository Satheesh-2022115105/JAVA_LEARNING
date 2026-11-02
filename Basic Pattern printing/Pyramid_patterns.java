package day4;

public class Pyramid_patterns {
    public static void main(String[] args) {
        int n = 5;
        //star pyramid

        for(int i = 0; i < n; i++) {

            // spaces
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        //Number pyramid
         for(int i = 0; i < n; i++) {
            int k=1;
            // spaces
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            // numbers
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print(k++);
            }

            System.out.println();
        }
        System.out.println();

        //Repeated number pyramid

         for(int i = 0; i < n; i++) {

            // spaces
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            // numbers
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print(i+1);
            }

            System.out.println();
        }
        System.out.println();

        //Inverted star pyramid
       
       for (int i = 1; i <= n; i++) {
            for(int j=1;j<=2*n-i;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
           
       }
       System.out.println();

       //Inverted Numbers
       for (int i = 1; i <= n; i++) {
        int k=1;
            for(int j=1;j<=2*n-i;j++){
                if(j>=i){
                    System.out.print(k++);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
           
       }
       System.out.println();

       //Diamond Pryamid

       for(int i = 0; i < n; i++) {

            // spaces
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
         for (int i = 1; i <= n; i++) {
            for(int j=1;j<=2*n-i;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
           
       }

            
    }
   
} 

