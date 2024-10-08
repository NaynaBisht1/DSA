package CompetitiveCoding;

public class EulerPhiAlgo {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(euler(n));
    }
    public static int euler(int n){
        int count = n;
        for (int i = 2; i*i <=n ; i++) {
            if (n%i==0){
                count = count-count/i;
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        if (n>1){
            count = count-count/n;
        }
        return count;
    }
}
