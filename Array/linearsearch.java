public class linearsearch {
     public static void linear_search(int [] arr, int target){
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == target) {
                System.out.println("Element found at index "+ i);
                return;
            }
        }
        System.out.println("Sorry Target is not in the array ");
    }
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,7};
        linear_search(arr,8);
    }
    
}
