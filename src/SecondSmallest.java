public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr= {3,18,7,4,14};
        System.out.println("number in the array are::");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int value=0;
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k< arr.length;k++){
                if(arr[j]>arr[k]){
                    value=arr[j];
                    arr[j]=arr[k];
                    arr[k]=value;
                }
            }
        }
        System.out.println();
        System.out.println("elements in the array in ascending order are::");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("second smallest element in the array is "+arr[1]);
    }

}
