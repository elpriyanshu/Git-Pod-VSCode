public class Pattern10c {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int k=1;k<n;k++){
            for(int m=n-k;m>=1;m--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
