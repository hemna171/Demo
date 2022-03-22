public class FibonacciSeries {
    public static void main(String[] args){
        int n=10;
        int f1=0;
        int f2=1;
        int f=0;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=3;i<=n;i++){
            f=f1+f2;
            System.out.println(f);
            f1=f2;
            f2=f;

        }
    }
}
