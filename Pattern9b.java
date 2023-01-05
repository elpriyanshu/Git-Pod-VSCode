public class Pattern9b {
    public static void main(String[] args) {
        int n = 5;
        int m = n-1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                System.out.print(" ");
            }
            m--;
            for (int k=1; k<=(i*2)-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        n = 5;
        m = 0;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=m; j++){
                System.out.print(" ");
            }
            m++;
            for (int k=(i*2)-1; k>=1; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
