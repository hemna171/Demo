import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] arr = {101,134,675,345,987};
        int[] newArray = new int[arr.length];
        try{
            System.out.println("enter the number you want to add");
            int num= scanner.nextInt();
            System.out.println("enter the position where you want to enter the number");
            int position= scanner.nextInt();
            for(int i=0;i<arr.length;i++){
                if(i!=position){
                    newArray[i]=arr[i];
                }else if(i==position){
                    newArray[i]=num;
                }
                System.out.println(newArray[i]);
            }
        }catch(Exception e){
            System.err.println("Please the number and the position of th number you want to add!!");
        }

    }
}
