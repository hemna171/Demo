public class Num {
    public static void main(String[] args) {
        int arr[]= new int[100];
        int maximum= arr[0];
        int minimum= arr[0];

        for (int i=0;i<arr.length;i++) {
            arr[i] = i;
        }
        for(int i=0;i<100;i++){
            if(arr[i]>maximum){
                maximum= arr[i];
            }

        }
        for(int i=0;i<100;i++){
            if(arr[i]<minimum){
                minimum= arr[i];
            }
        }
        System.out.println(maximum+" is maximum number");

        System.out.println(minimum+" is minimum number");
    }
}