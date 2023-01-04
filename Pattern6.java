public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=n; i>0; i--){
            int k = 1;
            for (int j=0; j<i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println("");
        }
    }
}
