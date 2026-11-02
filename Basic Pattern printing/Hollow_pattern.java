public class Hollow_pattern {
    public static void main(String[] args) {
        int n = 5;
        int m=8;
        //Hollow rectangle
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();
        //Hollow sqaure
        int a=5;
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a; j++) {

                if (i == 1 || i == a || j == 1 || j == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();

        //Hollow triangle
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==i||i==n){
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
