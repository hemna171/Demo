import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= {12,45,67,89,76,34};
        int[] newArray= new int[arr.length-1];
        int k=0;
        System.out.println("The numbers present are:: ");
        for(k=0; k<arr.length;k++){
            System.out.println(arr[k]+" ");
        }
        try{
            System.out.println("enter the number you want to delete");
            int num= scanner.nextInt();
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=num){
                    for(int j=0;j<newArray.length;j++){
                        newArray[j]=arr[i];
                        System.out.println(newArray[j]);
                        break;
                    }
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please check the number you want to delete is present in the list or not");
        }

    }
}
