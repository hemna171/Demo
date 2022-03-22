public class OddNumber {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                int j= i^2;
                System.out.println(i+" is odd number"+" and its square value is "+j);
            }
        }
    }
}
