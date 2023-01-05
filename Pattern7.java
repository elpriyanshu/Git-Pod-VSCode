public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int m = n;
        for (int i=0; i<n; i++,m-- ){
            for (int j=1; j<m; j++){
                System.out.print(" ");
            }
            for (int k=0; k<(i*2)-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
