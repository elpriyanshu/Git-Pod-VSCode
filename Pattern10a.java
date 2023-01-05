public class Pattern10a {
    public static void main(String[] args) {
        int n = 5;
        for(int row=1; row<2*n; row++){
            int stars=row>n ? (2*n-row) : row;
            for(int col=1; col<=stars; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
