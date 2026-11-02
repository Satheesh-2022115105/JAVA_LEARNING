package day4;

public class Pattern_print_loops {
    public static void main(String[] args) {

        //Square stars
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
        System.out.println();

        }

        System.out.println();
        //Square numbers

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(j+1);
            }
        System.out.println();

        }

        System.out.println();
        //Same number in each row

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(i+1);
            }
        System.out.println();

        }
        
        System.out.println();
         //Same character in each row

         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((char)(65+i));
            }
        System.out.println();

        }

        System.out.println();

        //Increasing stars

        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
        System.out.println();

        }

        System.out.println();
        //Increasing number

         for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
        System.out.println();

        }
        System.out.println();

        //Repeated row number

        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(i+1);
            }
        System.out.println();

        }

        System.out.println();

        //Increasing from 5

         for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(n-j);
            }
        System.out.println();

        }
        System.out.println();

        //Continuous Number
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(k++);
            }
        System.out.println();

        }

        System.out.println();

        //Decreasing stars

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");

            }
        System.out.println();
        }
        System.out.println();

        //Decreasing Number

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1);

            }
        System.out.println();
        }
        System.out.println();

        //Reverse numbers
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(j);

            }
        System.out.println();
        }
        System.out.println();

        //Repeating Decrease Number

          for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(n-i);

            }
        System.out.println();
        }
        System.out.println();        






























































    }
   
}
