public class HighestNumber {
    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 201};
        int highest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > highest){
                highest = arr[i];
            }
        }
        System.out.println(highest+" is the highest number");

    }
}
