public class Consecutive {
    public static void main(String[] args) {
        int[] arr= {49,1,3,200,2,4,70,5};
        int[] newArr= new int[5];
        int k=0;
        int variable=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    variable = arr[i];
                    arr[i]=arr[j];
                    arr[j]=variable;
                }
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(" "+arr[j]+" ");
        }
        for(int j=0;j<arr.length;j++){
            for(k=j+1;k<arr.length;k++){
                if(arr[k]-1==arr[j]){
                    newArr[j]=arr[j];
                    System.out.println(newArr[j]);
                    break;
                }
            }
        }

    }


}
