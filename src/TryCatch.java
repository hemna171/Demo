import java.util.Scanner;
public class TryCatch {
    public static int call(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("the value of i::");
        int i= scanner.nextInt();
        System.out.println(i);
        int j=i/0;
        System.out.println("the value of j is::"+j);
        return j;
    }

    public static void main(String[] args) {
        int m=0;
        try{
            m= call();
            System.out.println(m);
        }catch(Exception e){
            System.out.println("please recheck and enter the value of i::");
        }finally{
            if(m==0){
                call();
            }
        }
    }
}
