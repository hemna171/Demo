public class Practice {
    public static void main(String[] args){
        int a=0;
        int b=0;
        int n=3456;

        while(n!=0){
            a=n%10;
            b=b+a;
            n=n/10;
        }
        System.out.println(b);
    }
}
