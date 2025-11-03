public class NextPermutation {
    public static int[] NextPermutationNum(int arr[]){
        int n=arr.length;
        int index=-1;

        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverseArray(arr,0,n-1);
            return arr;
        }

        int temp=arr[index];
        arr[index]=arr[n-1];
        arr[n-1]=temp;

        reverseArray(arr,index+1,n-1);

        return arr;

    }

    public static void reverseArray(int arr[],int l ,int r){
        int n=arr.length;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args){
        int arr[]={1,2,2,7,6};
        int result[]=NextPermutationNum(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
