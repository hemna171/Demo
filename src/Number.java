public class Number {
    public static void main(String[] args){
      int n=16;
      int count=1;
      for(int i=2;i<=n;i++){
          if(n%i==0){
              count=count+1;
          }
      }
      if(count==2){
          System.out.println(n+" is a prime number");
      }else{
          System.out.println(n+" is not a prime number");
      }
    }
}
