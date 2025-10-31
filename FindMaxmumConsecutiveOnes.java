public class FindMaxmumConsecutiveOnes {
    public static int ConsecutiveOnes(int arr[]){
        int n=arr.length;
        int maxCount=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }else{
                maxCount=Math.max(maxCount,count);
                count=0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args){
        int[] arr={1,1,1,0,0,0,2,1,1,1,1,1,1,0};
        System.out.println(ConsecutiveOnes(arr));
    } 
}
