public class Pattern10b {
    public static void main(String[] args) {
        int n = 5;
        int stars;
        for(int i=1;i<=2*n-1;i++){
            if(i <=n){
                stars = i;
            }else{
                stars = 2*n-i;
            }
            
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
