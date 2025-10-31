public class LinearSearch {
    public static boolean FindElement(int arr[],int k){
        int n=arr.length;
        boolean isPresent=false;

        for(int i=0;i<n;i++){
            if(arr[i]==k){
                isPresent=true;
                break;
            }
        }
        return isPresent;
    }

    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60};
        int k=20;
        boolean find=FindElement(arr, k);
        if(find){
            System.out.println("element is present");
        }else{
            System.out.println("not present");
        }
    }
}
