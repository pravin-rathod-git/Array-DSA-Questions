public class LargestElement{
  public static void main(String[] args){
    int[] arr={10,20,60,35,90,40,55};
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    System.out.println(largest);
  }
}